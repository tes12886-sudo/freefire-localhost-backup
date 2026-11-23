package com.dts.freefireth.mambetwrapper;

import com.seagroup.gamesdk.VoiceDataSender;

/* JADX INFO: loaded from: classes.dex */
class FFStatusCallback implements VoiceDataSender.OnStatusCallback {
    FFStatusCallback() {
    }

    @Override // com.seagroup.gamesdk.VoiceDataSender.OnStatusCallback
    public void onConnectChanged(boolean z) {
        MambetWrapper.onConnectChanged(z);
    }

    @Override // com.seagroup.gamesdk.VoiceDataSender.OnStatusCallback
    public void onMicFocusChanged(boolean z) {
        MambetWrapper.onMicFocusChanged(z);
    }
}
