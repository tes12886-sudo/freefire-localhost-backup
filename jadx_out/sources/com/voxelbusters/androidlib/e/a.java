package com.voxelbusters.androidlib.e;

import android.opengl.GLES20;
import android.util.Log;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static String f1627l = "FilterFBOTexture";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static float[] f1628m = {-1.0f, 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static float[] f1629n = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
    private final FloatBuffer a;
    private final FloatBuffer b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f1630g = com.voxelbusters.androidlib.d.a.c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f1631h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f1632i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f1633j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f1634k;

    public a(int i2, int i3, int i4, int i5) {
        this.f1631h = i2;
        this.f1632i = i3;
        this.f1634k = i4;
        this.f1633j = i5;
        FloatBuffer floatBufferPut = ByteBuffer.allocateDirect(f1628m.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(f1628m);
        this.a = floatBufferPut;
        floatBufferPut.position(0);
        FloatBuffer floatBufferPut2 = ByteBuffer.allocateDirect(f1629n.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(f1629n);
        this.b = floatBufferPut2;
        floatBufferPut2.position(0);
        int iA = com.voxelbusters.androidlib.d.a.a("attribute vec4 av_Position; \nattribute vec2 af_Position; \nvarying vec2 v_texPo; \nvoid main() { \n   gl_Position = av_Position; \n   v_texPo = af_Position; \n}", "#extension GL_OES_EGL_image_external : require \nprecision mediump float; \nvarying vec2 v_texPo;\nuniform samplerExternalOES s_Texture;\nvoid main() { \n   gl_FragColor = texture2D(s_Texture, v_texPo);\n}");
        this.f = iA;
        this.c = GLES20.glGetAttribLocation(iA, "av_Position");
        this.d = GLES20.glGetAttribLocation(iA, "af_Position");
        this.e = GLES20.glGetUniformLocation(iA, "s_Texture");
    }

    public void a() {
        GLES20.glViewport(0, 0, this.f1631h, this.f1632i);
        GLES20.glClearColor(1.0f, 1.0f, 1.0f, 0.0f);
        GLES20.glClear(16384);
        GLES20.glBindFramebuffer(36160, this.f1630g);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f1634k, 0);
        if (GLES20.glCheckFramebufferStatus(36160) != 36053) {
            Log.d(f1627l, "FrameBuffer error");
            return;
        }
        GLES20.glBindBuffer(34962, 0);
        GLES20.glBindBuffer(34963, 0);
        GLES20.glUseProgram(this.f);
        GLES20.glEnableVertexAttribArray(this.c);
        GLES20.glVertexAttribPointer(this.c, 2, 5126, false, 8, (Buffer) this.a);
        GLES20.glEnableVertexAttribArray(this.d);
        GLES20.glVertexAttribPointer(this.d, 2, 5126, false, 8, (Buffer) this.b);
        GLES20.glActiveTexture(33991);
        GLES20.glBindTexture(36197, this.f1633j);
        GLES20.glUniform1i(this.e, 7);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.c);
        GLES20.glDisableVertexAttribArray(this.d);
        GLES20.glBindTexture(36197, 0);
        GLES20.glBindFramebuffer(36160, 0);
    }
}
