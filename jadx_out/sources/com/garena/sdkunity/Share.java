package com.garena.sdkunity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.beetalk.sdk.h;
import com.beetalk.sdk.i;
import com.beetalk.sdk.j;
import com.beetalk.sdk.ndk.ShareRet;
import com.beetalk.sdk.plugin.PluginResult;
import com.beetalk.sdk.plugin.b;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: loaded from: classes.dex */
public class Share {
    private static Exception lastException;

    private static byte[] GetImageBytes(String str, Bitmap.CompressFormat compressFormat, int i2) {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapDecodeStream.compress(compressFormat, i2, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            fileInputStream.close();
            return byteArray;
        } catch (Exception e) {
            SdkUnity.LogError("Exception in GetImageBytes(): " + e.getMessage());
            lastException = e;
            return null;
        }
    }

    public static void SendGameRequestToFacebookUser(long j2, String str, String str2, String str3) {
        i.i(SdkUnity.getGameActivity(), j2, str, str2, str3, new b<PluginResult>() { // from class: com.garena.sdkunity.Share.7
            @Override // com.beetalk.sdk.plugin.b
            public void onPluginResult(PluginResult pluginResult) {
                UnityMessgae.getInstance().sendToUnity("SendGameRequestToFacebookUserCallback", pluginResult);
            }
        });
    }

    public static void SendGameToSession(int i2, String str, String str2, String str3, String str4, String str5, String str6, int i3) {
        SdkUnity.Log("SendGameToSession");
        byte[] bArrGetImageBytes = GetImageBytes(str6, Bitmap.CompressFormat.JPEG, i3);
        if (bArrGetImageBytes == null) {
            UnityMessgae.getInstance().sendToUnity("SendGameToSessionException", lastException.getMessage());
            return;
        }
        j.a aVar = new j.a(bArrGetImageBytes, Integer.parseInt(SdkUnity.appId));
        aVar.e(Integer.valueOf(i2));
        aVar.f(str);
        aVar.c(str2);
        aVar.d(str3);
        aVar.b(str4);
        aVar.g(str5);
        i.j(SdkUnity.getGameActivity(), aVar.a(), new b<PluginResult>() { // from class: com.garena.sdkunity.Share.1
            @Override // com.beetalk.sdk.plugin.b
            public void onPluginResult(PluginResult pluginResult) {
                UnityMessgae.getInstance().sendToUnity("SendGameToSessionCallback", pluginResult);
            }
        });
    }

    public static void SendLinkToFacebook(String str, String str2, String str3, String str4, String str5) {
        i.k(SdkUnity.getGameActivity(), (str5 == null || str5.length() == 0) ? new com.beetalk.sdk.w.b(str, str2, str3, str4) : new com.beetalk.sdk.w.b(str, str2, str3, str4, str5), new b<PluginResult>() { // from class: com.garena.sdkunity.Share.5
            @Override // com.beetalk.sdk.plugin.b
            public void onPluginResult(PluginResult pluginResult) {
                UnityMessgae.getInstance().sendToUnity("SendLinkToFacebookCallback", pluginResult);
            }
        });
    }

    public static void SendLinkToSession(int i2, String str, String str2, String str3, String str4, String str5, String str6) {
        i.l(SdkUnity.getGameActivity(), i2, str, str2, str3, str4, str5, str6, new i.g() { // from class: com.garena.sdkunity.Share.3
            @Override // com.beetalk.sdk.plugin.b
            public void onPluginResult(ShareRet shareRet) {
                UnityMessgae.getInstance().sendToUnity("SendLinkToSessionCallback", shareRet);
            }
        });
    }

    public static void SendMediaToSession(int i2, String str, String str2, String str3) {
        h.a aVar = new h.a(i2, str3, Integer.parseInt(SdkUnity.appId));
        aVar.b(str);
        aVar.d(str2);
        aVar.c("");
        i.m(SdkUnity.getGameActivity(), aVar.a(), new b<PluginResult>() { // from class: com.garena.sdkunity.Share.2
            @Override // com.beetalk.sdk.plugin.b
            public void onPluginResult(PluginResult pluginResult) {
                UnityMessgae.getInstance().sendToUnity("SendMediaToSessionCallback", pluginResult);
            }
        });
    }

    public static void SendRequestInvitationToFacebook(String str, String str2) {
        i.o(SdkUnity.getGameActivity(), str, str2, new b<PluginResult>() { // from class: com.garena.sdkunity.Share.6
            @Override // com.beetalk.sdk.plugin.b
            public void onPluginResult(PluginResult pluginResult) {
                UnityMessgae.getInstance().sendToUnity("SendRequestInvitationToFacebookCallback", pluginResult);
            }
        });
    }

    public static void ShareToFacebook(String str, String str2, String str3, String str4, String str5, int i2, String str6) {
        String str7;
        SdkUnity.Log(String.format("@Share.ShareToFacebook(%s, %s, %s, %s, %s, %d, %s", str, str2, str3, str4, str5, Integer.valueOf(i2), str6));
        com.beetalk.sdk.w.b bVar = (str6 == null || str6.length() == 0) ? new com.beetalk.sdk.w.b(str, str2, str3, str4) : new com.beetalk.sdk.w.b(str, str2, str3, str4, str6);
        byte[] bArrGetImageBytes = GetImageBytes(str5, Bitmap.CompressFormat.JPEG, i2);
        Object[] objArr = new Object[1];
        if (bArrGetImageBytes == null) {
            str7 = "null";
        } else {
            str7 = "" + bArrGetImageBytes.length;
        }
        objArr[0] = str7;
        SdkUnity.Log(String.format("@Share.ShareToFacebook() imageBytes: %s", objArr));
        if (bArrGetImageBytes == null) {
            UnityMessgae.getInstance().sendToUnity("ShareToFacebookException", lastException.getMessage());
        } else {
            bVar.e = bArrGetImageBytes;
            i.q(SdkUnity.getGameActivity(), bVar, new b<PluginResult>() { // from class: com.garena.sdkunity.Share.4
                @Override // com.beetalk.sdk.plugin.b
                public void onPluginResult(PluginResult pluginResult) {
                    UnityMessgae.getInstance().sendToUnity("ShareToFacebookCallback", pluginResult);
                }
            });
        }
    }

    public static void ShareToVKontakte(String str, String str2, String str3, int i2) {
        byte[] bArrGetImageBytes = (str3 == null || str3.length() <= 0) ? null : GetImageBytes(str3, Bitmap.CompressFormat.JPEG, i2);
        com.beetalk.sdk.b0.b.C0030b c0030b = new com.beetalk.sdk.b0.b.C0030b();
        c0030b.g(str);
        c0030b.f(str2);
        c0030b.e(bArrGetImageBytes);
        i.r(SdkUnity.getGameActivity(), c0030b.d(), new b<PluginResult>() { // from class: com.garena.sdkunity.Share.8
            @Override // com.beetalk.sdk.plugin.b
            public void onPluginResult(PluginResult pluginResult) {
                UnityMessgae.getInstance().sendToUnity("ShareToVkCallback", pluginResult);
            }
        });
    }
}
