package com.garena.unity.webview;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.VideoView;
import j.d.d.e;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public abstract class UnityWebChromeClient extends WebChromeClient {
    public static final int FILE_CHOOSER_REQUEST_CODE = 8226;
    private int _SystemUiVisibility;
    private VideoViewListener _VideoViewListener;
    private int _WindowAttributesFlags;
    protected final int _webViewId;
    protected static e gson = new e();
    private static final LinkedList<FileChooserRequest> _PendingFileChooserRequests = new LinkedList<>();
    private boolean _ShowingCustomView = false;
    private WebChromeClient.CustomViewCallback _CustomViewCallback = null;
    private View _CustomView = null;

    private static class FileChooserRequest {
        public ValueCallback<Uri[]> Callback;
        public UnityWebChromeClient Client;
        public WebChromeClient.FileChooserParams Params;

        private FileChooserRequest() {
        }
    }

    private class VideoViewListener implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener {
        private VideoViewListener() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            UnityWebChromeClient.this.onHideCustomView();
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
            return false;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
        }
    }

    class _ConsoleMessage {
        public int lineNumber;
        public String message;
        public String messageLevel;
        public String sourceId;

        _ConsoleMessage() {
        }
    }

    public UnityWebChromeClient(int i2) {
        this._webViewId = i2;
    }

    public static void OnFileChooserResult(int i2, int i3, Intent intent) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        LinkedList<FileChooserRequest> linkedList = _PendingFileChooserRequests;
        synchronized (linkedList) {
            if (linkedList.isEmpty()) {
                return;
            }
            FileChooserRequest fileChooserRequestPollFirst = linkedList.pollFirst();
            if (fileChooserRequestPollFirst != null) {
                try {
                    WebChromeClient.FileChooserParams fileChooserParams = fileChooserRequestPollFirst.Params;
                    fileChooserRequestPollFirst.Callback.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(i3, intent));
                } catch (Throwable unused) {
                }
            }
            _processPendingFileChooserIntent();
        }
    }

    private static boolean _processPendingFileChooserIntent() {
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        try {
            LinkedList<FileChooserRequest> linkedList = _PendingFileChooserRequests;
            synchronized (linkedList) {
                if (linkedList.isEmpty()) {
                    return false;
                }
                FileChooserRequest fileChooserRequestPeekFirst = linkedList.peekFirst();
                fileChooserRequestPeekFirst.Client.getWebViewActivity().startActivityForResult(fileChooserRequestPeekFirst.Params.createIntent(), FILE_CHOOSER_REQUEST_CODE);
                return true;
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean processFileChooserIntent(UnityWebChromeClient unityWebChromeClient, WebChromeClient.FileChooserParams fileChooserParams, ValueCallback<Uri[]> valueCallback) {
        boolean zIsEmpty;
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        LinkedList<FileChooserRequest> linkedList = _PendingFileChooserRequests;
        synchronized (linkedList) {
            zIsEmpty = linkedList.isEmpty();
            FileChooserRequest fileChooserRequest = new FileChooserRequest();
            fileChooserRequest.Client = unityWebChromeClient;
            fileChooserRequest.Params = fileChooserParams;
            fileChooserRequest.Callback = valueCallback;
            linkedList.addLast(fileChooserRequest);
        }
        if (zIsEmpty) {
            return _processPendingFileChooserIntent();
        }
        return false;
    }

    protected abstract WebViewStatus getStatus();

    protected abstract WebView getWebView();

    protected abstract Activity getWebViewActivity();

    protected abstract ViewGroup getWebViewParent();

    public boolean onBackPressed() {
        if (!this._ShowingCustomView) {
            return false;
        }
        onHideCustomView();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (!WebViewManager.getSendConsoleMessagesToUnity()) {
            return false;
        }
        _ConsoleMessage _consolemessage = new _ConsoleMessage();
        _consolemessage.message = consoleMessage.message();
        _consolemessage.messageLevel = consoleMessage.messageLevel().toString();
        _consolemessage.lineNumber = consoleMessage.lineNumber();
        _consolemessage.sourceId = consoleMessage.sourceId();
        sendToUnity(IUnityWebViewProxy.UnityCallbacks.CONSOLE_MESSAGE, gson.t(_consolemessage));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        try {
            if (this._ShowingCustomView) {
                if (this._CustomView != null) {
                    getWebViewParent().removeView(this._CustomView);
                }
                this._ShowingCustomView = false;
                WebChromeClient.CustomViewCallback customViewCallback = this._CustomViewCallback;
                if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                    this._CustomViewCallback.onCustomViewHidden();
                }
                this._CustomView = null;
                this._CustomViewCallback = null;
                this._VideoViewListener = null;
                WindowManager.LayoutParams attributes = getWebViewActivity().getWindow().getAttributes();
                attributes.flags = this._WindowAttributesFlags;
                getWebViewActivity().getWindow().setAttributes(attributes);
                getWebViewActivity().getWindow().getDecorView().setSystemUiVisibility(this._SystemUiVisibility);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i2) {
        super.onProgressChanged(webView, i2);
        WebViewStatus status = getStatus();
        if (status != null) {
            double d = i2;
            Double.isNaN(d);
            status.LoadingProgress = d / 100.0d;
            setStatus(status);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, int i2, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, customViewCallback);
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        WebViewStatus status;
        String nameInJavaScript;
        try {
            WebView webView = getWebView();
            if (webView == null || (status = getStatus()) == null || status.Hiding) {
                return;
            }
            WindowManager.LayoutParams attributes = getWebViewActivity().getWindow().getAttributes();
            this._WindowAttributesFlags = attributes.flags;
            this._SystemUiVisibility = getWebViewActivity().getWindow().getDecorView().getSystemUiVisibility();
            if (view instanceof FrameLayout) {
                this._ShowingCustomView = true;
                this._CustomView = view;
                this._CustomViewCallback = customViewCallback;
                getWebViewParent().addView(this._CustomView, new ViewGroup.LayoutParams(-1, -1));
                this._CustomView.setVisibility(0);
                View focusedChild = ((FrameLayout) view).getFocusedChild();
                if (focusedChild instanceof VideoView) {
                    VideoView videoView = (VideoView) focusedChild;
                    VideoViewListener videoViewListener = new VideoViewListener();
                    this._VideoViewListener = videoViewListener;
                    videoView.setOnPreparedListener(videoViewListener);
                    videoView.setOnCompletionListener(this._VideoViewListener);
                    videoView.setOnErrorListener(this._VideoViewListener);
                } else if (webView.getSettings().getJavaScriptEnabled() && (focusedChild instanceof SurfaceView) && (nameInJavaScript = WebViewManager.getNameInJavaScript()) != null && nameInJavaScript.length() > 0) {
                    webView.loadUrl((((((((("javascript:var _uwv_h5_video_last;") + "var _uwv_h5_video = document.getElementsByTagName('video')[0];") + "if (_uwv_h5_video != undefined && _uwv_h5_video != _uwv_h5_video_last) {") + "_uwv_h5_video_last = _uwv_h5_video;") + "function _uwv_h5_video_ended() {") + nameInJavaScript + ".on_HTML5_Video_Ended();") + "}") + "_uwv_h5_video.addEventListener('ended', _uwv_h5_video_ended);") + "}");
                }
            }
            int i2 = attributes.flags | 1024;
            attributes.flags = i2;
            attributes.flags = i2 | 128;
            getWebViewActivity().getWindow().setAttributes(attributes);
            getWebViewActivity().getWindow().getDecorView().setSystemUiVisibility(4);
            WebViewManager.RunOnUiThread(new Runnable() { // from class: com.garena.unity.webview.UnityWebChromeClient.1
                @Override // java.lang.Runnable
                public void run() {
                    UnityWebChromeClient.this._CustomView.forceLayout();
                }
            });
        } catch (Exception unused) {
            onHideCustomView();
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        if (fileChooserParams == null || valueCallback == null || Build.VERSION.SDK_INT < 21) {
            return false;
        }
        return processFileChooserIntent(this, fileChooserParams, valueCallback);
    }

    protected abstract void sendToUnity(String str, String str2);

    protected abstract void setStatus(WebViewStatus webViewStatus);

    public boolean showingCustomView() {
        return this._ShowingCustomView;
    }
}
