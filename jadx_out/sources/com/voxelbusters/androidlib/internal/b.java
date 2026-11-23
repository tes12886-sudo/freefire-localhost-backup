package com.voxelbusters.androidlib.internal;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b extends Fragment {
    private com.voxelbusters.androidlib.c.c a;

    public static void b(Context context, ArrayList<String> arrayList, com.voxelbusters.androidlib.c.c cVar) {
        if (Build.VERSION.SDK_INT < 23 || arrayList.size() == 0) {
            if (cVar != null) {
                cVar.b();
                return;
            }
            return;
        }
        b bVar = new b();
        bVar.c(cVar);
        Bundle bundle = new Bundle();
        bundle.putStringArray("PERMISSION_LIST", (String[]) arrayList.toArray(new String[arrayList.size()]));
        bVar.setArguments(bundle);
        FragmentTransaction fragmentTransactionBeginTransaction = ((Activity) context).getFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.add(0, bVar);
        fragmentTransactionBeginTransaction.commit();
    }

    private boolean d(int[] iArr) {
        if (iArr.length < 1) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 != 0) {
                return false;
            }
        }
        return true;
    }

    public void a() {
        this.a = null;
        getActivity().getFragmentManager().beginTransaction().remove(this).commit();
    }

    public void c(com.voxelbusters.androidlib.c.c cVar) {
        this.a = cVar;
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String[] stringArray = getArguments().getStringArray("PERMISSION_LIST");
        if (!com.voxelbusters.androidlib.d.b.l(getActivity(), stringArray)) {
            if (Build.VERSION.SDK_INT >= 23) {
                requestPermissions(stringArray, 1112);
            }
        } else {
            com.voxelbusters.androidlib.c.c cVar = this.a;
            if (cVar != null) {
                cVar.b();
            }
            a();
        }
    }

    @Override // android.app.Fragment
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (i2 != 1112) {
            return;
        }
        if (d(iArr)) {
            com.voxelbusters.androidlib.c.c cVar = this.a;
            if (cVar != null) {
                cVar.b();
            }
        } else {
            com.voxelbusters.androidlib.c.c cVar2 = this.a;
            if (cVar2 != null) {
                cVar2.a();
            }
        }
        a();
    }
}
