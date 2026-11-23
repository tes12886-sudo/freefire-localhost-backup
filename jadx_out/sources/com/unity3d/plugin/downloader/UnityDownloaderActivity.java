package com.unity3d.plugin.downloader;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Messenger;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.unity3d.player.UnityPlayer;
import j.d.a.e.a.a.b;
import j.d.a.e.a.a.c;
import j.d.a.e.a.a.d;
import j.d.a.e.a.a.e;
import j.d.a.e.a.a.f;
import j.d.a.e.a.a.g;
import j.d.a.e.a.a.h;

/* JADX INFO: loaded from: classes.dex */
public class UnityDownloaderActivity extends Activity implements f {
    private static final String LOG_TAG = "OBB";
    private TextView mAverageSpeed;
    private View mCellMessage;
    private View mDashboard;
    private h mDownloaderClientStub;
    private ProgressBar mPB;
    private Button mPauseButton;
    private TextView mProgressFraction;
    private TextView mProgressPercent;
    private g mRemoteService;
    private int mState;
    private boolean mStatePaused;
    private TextView mStatusText;
    private TextView mTimeRemaining;
    private Button mWiFiSettingsButton;

    private void initializeDownloadUI() {
        this.mDownloaderClientStub = c.b(this, UnityDownloaderService.class);
        setContentView(e.i(this, "main"));
        this.mPB = (ProgressBar) findViewById(e.h(this, "progressBar"));
        this.mStatusText = (TextView) findViewById(e.h(this, "statusText"));
        this.mProgressFraction = (TextView) findViewById(e.h(this, "progressAsFraction"));
        this.mProgressPercent = (TextView) findViewById(e.h(this, "progressAsPercentage"));
        this.mAverageSpeed = (TextView) findViewById(e.h(this, "progressAverageSpeed"));
        this.mTimeRemaining = (TextView) findViewById(e.h(this, "progressTimeRemaining"));
        this.mDashboard = findViewById(e.h(this, "downloaderDashboard"));
        this.mCellMessage = findViewById(e.h(this, "approveCellular"));
        this.mPauseButton = (Button) findViewById(e.h(this, "pauseButton"));
        this.mWiFiSettingsButton = (Button) findViewById(e.h(this, "wifiSettingsButton"));
        this.mPauseButton.setOnClickListener(new View.OnClickListener() { // from class: com.unity3d.plugin.downloader.UnityDownloaderActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (UnityDownloaderActivity.this.mRemoteService != null) {
                    if (UnityDownloaderActivity.this.mStatePaused) {
                        UnityDownloaderActivity.this.mRemoteService.requestContinueDownload();
                    } else {
                        UnityDownloaderActivity.this.mRemoteService.requestPauseDownload();
                    }
                    UnityDownloaderActivity unityDownloaderActivity = UnityDownloaderActivity.this;
                    unityDownloaderActivity.setButtonPausedState(!unityDownloaderActivity.mStatePaused);
                }
            }
        });
        this.mWiFiSettingsButton.setOnClickListener(new View.OnClickListener() { // from class: com.unity3d.plugin.downloader.UnityDownloaderActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                UnityDownloaderActivity.this.startActivity(new Intent("android.settings.WIFI_SETTINGS"));
            }
        });
        ((Button) findViewById(e.h(this, "resumeOverCellular"))).setOnClickListener(new View.OnClickListener() { // from class: com.unity3d.plugin.downloader.UnityDownloaderActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                UnityDownloaderActivity.this.mRemoteService.setDownloadFlags(1);
                UnityDownloaderActivity.this.mRemoteService.requestContinueDownload();
                UnityDownloaderActivity.this.mCellMessage.setVisibility(8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonPausedState(boolean z) {
        this.mStatePaused = z;
        this.mPauseButton.setText(e.l(this, z ? "text_button_resume" : "text_button_pause"));
    }

    private void setState(int i2) {
        if (this.mState != i2) {
            this.mState = i2;
            this.mStatusText.setText(e.f(this, i2));
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        try {
            Intent intent = new Intent(this, Class.forName(getIntent().getStringExtra("unityplayer.Activity")));
            intent.setFlags(270532608);
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
            if (c.c(this, PendingIntent.getActivity(this, 0, intent, 167772160), UnityDownloaderService.class) != 0) {
                initializeDownloadUI();
                return;
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(LOG_TAG, "Cannot find own package! MAYDAY!");
            e.printStackTrace();
        } catch (ClassNotFoundException e2) {
            Log.e(LOG_TAG, "Cannot find own package! MAYDAY!");
            e2.printStackTrace();
        } catch (IllegalStateException e3) {
            Log.e(LOG_TAG, "Just Catch IllegalStateException!");
            e3.printStackTrace();
        }
        finish();
    }

    @Override // j.d.a.e.a.a.f
    public void onDownloadProgress(b bVar) {
        this.mAverageSpeed.setText(getString(e.l(this, "kilobytes_per_second"), new Object[]{e.k(bVar.d)}));
        this.mTimeRemaining.setText(getString(e.l(this, "time_remaining"), new Object[]{e.m(bVar.c)}));
        long j2 = bVar.a;
        bVar.a = j2;
        this.mPB.setMax((int) (j2 >> 8));
        this.mPB.setProgress((int) (bVar.b >> 8));
        this.mProgressPercent.setText(Long.toString((bVar.b * 100) / bVar.a) + "%");
        this.mProgressFraction.setText(e.e(bVar.b, bVar.a));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0022  */
    /* JADX WARN: Code duplicated, block: B:19:0x0024  */
    /* JADX WARN: Code duplicated, block: B:22:0x002e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0036  */
    /* JADX WARN: Code duplicated, block: B:28:0x0040  */
    @Override // j.d.a.e.a.a.f
    public void onDownloadStateChanged(int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        setState(i2);
        boolean z4 = true;
        switch (i2) {
            case 1:
            case 2:
            case 3:
                z = false;
                z2 = false;
                z3 = true;
                if (z4) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                if (this.mDashboard.getVisibility() != i3) {
                    this.mDashboard.setVisibility(i3);
                }
                i4 = z ? 0 : 8;
                if (this.mCellMessage.getVisibility() != i4) {
                    this.mCellMessage.setVisibility(i4);
                }
                this.mPB.setIndeterminate(z3);
                setButtonPausedState(z2);
                break;
            case 4:
                z = false;
                z2 = false;
                z3 = false;
                if (z4) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                if (this.mDashboard.getVisibility() != i3) {
                    this.mDashboard.setVisibility(i3);
                }
                if (z) {
                }
                if (this.mCellMessage.getVisibility() != i4) {
                    this.mCellMessage.setVisibility(i4);
                }
                this.mPB.setIndeterminate(z3);
                setButtonPausedState(z2);
                break;
            case 5:
                finish();
                break;
            case 6:
            case 10:
            case 11:
            case 13:
            case 17:
            default:
                z = false;
                z2 = true;
                z3 = true;
                if (z4) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                if (this.mDashboard.getVisibility() != i3) {
                    this.mDashboard.setVisibility(i3);
                }
                if (z) {
                }
                if (this.mCellMessage.getVisibility() != i4) {
                    this.mCellMessage.setVisibility(i4);
                }
                this.mPB.setIndeterminate(z3);
                setButtonPausedState(z2);
                break;
            case 7:
            case 12:
            case 14:
                z = false;
                z2 = true;
                z3 = false;
                if (z4) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                if (this.mDashboard.getVisibility() != i3) {
                    this.mDashboard.setVisibility(i3);
                }
                if (z) {
                }
                if (this.mCellMessage.getVisibility() != i4) {
                    this.mCellMessage.setVisibility(i4);
                }
                this.mPB.setIndeterminate(z3);
                setButtonPausedState(z2);
                break;
            case 8:
            case 9:
                z = true;
                z4 = false;
                z2 = true;
                z3 = false;
                if (z4) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                if (this.mDashboard.getVisibility() != i3) {
                    this.mDashboard.setVisibility(i3);
                }
                if (z) {
                }
                if (this.mCellMessage.getVisibility() != i4) {
                    this.mCellMessage.setVisibility(i4);
                }
                this.mPB.setIndeterminate(z3);
                setButtonPausedState(z2);
                break;
            case 15:
            case 16:
            case 18:
            case 19:
                z = false;
                z4 = false;
                z2 = true;
                z3 = false;
                if (z4) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                if (this.mDashboard.getVisibility() != i3) {
                    this.mDashboard.setVisibility(i3);
                }
                if (z) {
                }
                if (this.mCellMessage.getVisibility() != i4) {
                    this.mCellMessage.setVisibility(i4);
                }
                this.mPB.setIndeterminate(z3);
                setButtonPausedState(z2);
                break;
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            return super.onKeyDown(i2, keyEvent);
        }
        finish();
        UnityPlayer.UnitySendMessage("GameStartup", "Quit", "");
        Log.e(LOG_TAG, "Call Unity to Close UnityActivity");
        return true;
    }

    @Override // android.app.Activity
    protected void onResume() {
        h hVar = this.mDownloaderClientStub;
        if (hVar != null) {
            hVar.a(this);
        }
        super.onResume();
    }

    @Override // j.d.a.e.a.a.f
    public void onServiceConnected(Messenger messenger) {
        g gVarA = d.a(messenger);
        this.mRemoteService = gVarA;
        gVarA.onClientUpdated(this.mDownloaderClientStub.b());
    }

    @Override // android.app.Activity
    protected void onStop() {
        h hVar = this.mDownloaderClientStub;
        if (hVar != null) {
            hVar.c(this);
        }
        super.onStop();
    }
}
