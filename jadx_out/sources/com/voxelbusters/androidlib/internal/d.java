package com.voxelbusters.androidlib.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import com.voxelbusters.androidlib.c.h;

/* JADX INFO: loaded from: classes.dex */
public class d extends Fragment {
    private MediaProjectionManager a;
    private h b;

    private void b(Context context) {
        c();
    }

    public void a() {
        this.a = null;
        getActivity().getFragmentManager().beginTransaction().remove(this).commit();
    }

    public void c() {
        MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) getActivity().getSystemService("media_projection");
        this.a = mediaProjectionManager;
        startActivityForResult(mediaProjectionManager.createScreenCaptureIntent(), 1111, null);
    }

    public void d(h hVar) {
        this.b = hVar;
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 1111) {
            if (i3 == -1) {
                h hVar = this.b;
                if (hVar != null) {
                    hVar.a(intent);
                }
            } else {
                h hVar2 = this.b;
                if (hVar2 != null) {
                    hVar2.b("SCREEN_RECORDING_PERMISSION_UNAVAILABLE");
                }
            }
            a();
        }
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        b(activity);
    }
}
