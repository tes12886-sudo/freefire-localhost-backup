package com.voxelbusters.androidlib.d;

import android.opengl.GLES20;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static int a(String str, String str2) {
        int iE = e(b(35633, str), b(35632, str2));
        f(iE);
        return iE;
    }

    public static int b(int i2, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        if (iGlCreateShader == 0) {
            return 0;
        }
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    public static int c() {
        Log.d("FBOUtils", "start createFBO");
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        Log.d("FBOUtils", "end createFBO");
        return iArr[0];
    }

    public static int d() {
        Log.d("FBOUtils", "start createVideoTextureID");
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        Log.d("FBOUtils", "end create2DTextureId");
        return iArr[0];
    }

    public static int e(int i2, int i3) {
        int iGlCreateProgram = GLES20.glCreateProgram();
        if (iGlCreateProgram == 0) {
            return 0;
        }
        GLES20.glAttachShader(iGlCreateProgram, i2);
        GLES20.glAttachShader(iGlCreateProgram, i3);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateProgram;
        }
        GLES20.glDeleteProgram(iGlCreateProgram);
        return 0;
    }

    public static boolean f(int i2) {
        GLES20.glValidateProgram(i2);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(i2, 35715, iArr, 0);
        return iArr[0] != 0;
    }
}
