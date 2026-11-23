package com.google.firebase.j;

/* JADX INFO: loaded from: classes.dex */
public interface f {

    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);

        private final int a;

        a(int i2) {
            this.a = i2;
        }

        public int a() {
            return this.a;
        }
    }

    a a(String str);
}
