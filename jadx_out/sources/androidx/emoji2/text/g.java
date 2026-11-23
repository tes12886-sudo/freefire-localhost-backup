package androidx.emoji2.text;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Object f346n = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static volatile g f347o;
    private final Set<e> b;
    private final b e;
    final InterfaceC0020g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final boolean f348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f349h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final int[] f350i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f351j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f352k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f353l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final d f354m;
    private final ReadWriteLock a = new ReentrantReadWriteLock();
    private volatile int c = 3;
    private final Handler d = new Handler(Looper.getMainLooper());

    private static final class a extends b {
        private volatile androidx.emoji2.text.i b;
        private volatile m c;

        /* JADX INFO: renamed from: androidx.emoji2.text.g$a$a, reason: collision with other inner class name */
        class C0019a extends h {
            C0019a() {
            }

            @Override // androidx.emoji2.text.g.h
            public void a(Throwable th) {
                a.this.a.m(th);
            }

            @Override // androidx.emoji2.text.g.h
            public void b(m mVar) {
                a.this.d(mVar);
            }
        }

        a(g gVar) {
            super(gVar);
        }

        @Override // androidx.emoji2.text.g.b
        void a() {
            try {
                this.a.f.a(new C0019a());
            } catch (Throwable th) {
                this.a.m(th);
            }
        }

        @Override // androidx.emoji2.text.g.b
        CharSequence b(CharSequence charSequence, int i2, int i3, int i4, boolean z) {
            return this.b.h(charSequence, i2, i3, i4, z);
        }

        @Override // androidx.emoji2.text.g.b
        void c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.a.f348g);
        }

        void d(m mVar) {
            if (mVar == null) {
                this.a.m(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.c = mVar;
            m mVar2 = this.c;
            i iVar = new i();
            d dVar = this.a.f354m;
            g gVar = this.a;
            this.b = new androidx.emoji2.text.i(mVar2, iVar, dVar, gVar.f349h, gVar.f350i);
            this.a.n();
        }
    }

    private static class b {
        final g a;

        b(g gVar) {
            this.a = gVar;
        }

        void a() {
            this.a.n();
        }

        CharSequence b(CharSequence charSequence, int i2, int i3, int i4, boolean z) {
            return charSequence;
        }

        void c(EditorInfo editorInfo) {
        }
    }

    public static abstract class c {
        final InterfaceC0020g a;
        boolean b;
        boolean c;
        int[] d;
        Set<e> e;
        boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f355g = -16711936;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f356h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        d f357i = new androidx.emoji2.text.i.b();

        protected c(InterfaceC0020g interfaceC0020g) {
            h.h.k.e.g(interfaceC0020g, "metadataLoader cannot be null.");
            this.a = interfaceC0020g;
        }

        protected final InterfaceC0020g a() {
            return this.a;
        }

        public c b(int i2) {
            this.f356h = i2;
            return this;
        }
    }

    public interface d {
        boolean a(CharSequence charSequence, int i2, int i3, int i4);
    }

    public static abstract class e {
        public void a(Throwable th) {
        }

        public void b() {
        }
    }

    private static class f implements Runnable {
        private final List<e> a;
        private final Throwable b;
        private final int c;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        f(e eVar, int i2) {
            this(Arrays.asList(eVar), i2, null);
            h.h.k.e.g(eVar, "initCallback cannot be null");
        }

        f(Collection<e> collection, int i2) {
            this(collection, i2, null);
        }

        f(Collection<e> collection, int i2, Throwable th) {
            h.h.k.e.g(collection, "initCallbacks cannot be null");
            this.a = new ArrayList(collection);
            this.c = i2;
            this.b = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.a.size();
            int i2 = 0;
            if (this.c != 1) {
                while (i2 < size) {
                    this.a.get(i2).a(this.b);
                    i2++;
                }
            } else {
                while (i2 < size) {
                    this.a.get(i2).b();
                    i2++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.g$g, reason: collision with other inner class name */
    public interface InterfaceC0020g {
        void a(h hVar);
    }

    public static abstract class h {
        public abstract void a(Throwable th);

        public abstract void b(m mVar);
    }

    static class i {
        i() {
        }

        j a(androidx.emoji2.text.h hVar) {
            return new o(hVar);
        }
    }

    private g(c cVar) {
        this.f348g = cVar.b;
        this.f349h = cVar.c;
        this.f350i = cVar.d;
        this.f351j = cVar.f;
        this.f352k = cVar.f355g;
        this.f = cVar.a;
        this.f353l = cVar.f356h;
        this.f354m = cVar.f357i;
        h.f.b bVar = new h.f.b();
        this.b = bVar;
        Set<e> set = cVar.e;
        if (set != null && !set.isEmpty()) {
            bVar.addAll(cVar.e);
        }
        this.e = Build.VERSION.SDK_INT < 19 ? new b(this) : new a(this);
        l();
    }

    public static g b() {
        g gVar;
        synchronized (f346n) {
            gVar = f347o;
            h.h.k.e.h(gVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return gVar;
    }

    public static boolean e(InputConnection inputConnection, Editable editable, int i2, int i3, boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            return androidx.emoji2.text.i.c(inputConnection, editable, i2, i3, z);
        }
        return false;
    }

    public static boolean f(Editable editable, int i2, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 19) {
            return androidx.emoji2.text.i.d(editable, i2, keyEvent);
        }
        return false;
    }

    public static g g(c cVar) {
        g gVar = f347o;
        if (gVar == null) {
            synchronized (f346n) {
                gVar = f347o;
                if (gVar == null) {
                    gVar = new g(cVar);
                    f347o = gVar;
                }
            }
        }
        return gVar;
    }

    public static boolean h() {
        return f347o != null;
    }

    private boolean j() {
        return d() == 1;
    }

    private void l() {
        this.a.writeLock().lock();
        try {
            if (this.f353l == 0) {
                this.c = 0;
            }
            this.a.writeLock().unlock();
            if (d() == 0) {
                this.e.a();
            }
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public int c() {
        return this.f352k;
    }

    public int d() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public boolean i() {
        return this.f351j;
    }

    public void k() {
        h.h.k.e.h(this.f353l == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (j()) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                this.a.writeLock().unlock();
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            this.e.a();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    void m(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new f(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    void n() {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 1;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new f(arrayList, this.c));
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence o(CharSequence charSequence) {
        return p(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence p(CharSequence charSequence, int i2, int i3) {
        return q(charSequence, i2, i3, Integer.MAX_VALUE);
    }

    public CharSequence q(CharSequence charSequence, int i2, int i3, int i4) {
        return r(charSequence, i2, i3, i4, 0);
    }

    public CharSequence r(CharSequence charSequence, int i2, int i3, int i4, int i5) {
        boolean z;
        h.h.k.e.h(j(), "Not initialized yet");
        h.h.k.e.d(i2, "start cannot be negative");
        h.h.k.e.d(i3, "end cannot be negative");
        h.h.k.e.d(i4, "maxEmojiCount cannot be negative");
        h.h.k.e.a(i2 <= i3, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        h.h.k.e.a(i2 <= charSequence.length(), "start should be < than charSequence length");
        h.h.k.e.a(i3 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i2 == i3) {
            return charSequence;
        }
        if (i5 != 1) {
            z = i5 != 2 ? this.f348g : false;
        } else {
            z = true;
        }
        return this.e.b(charSequence, i2, i3, i4, z);
    }

    public void s(e eVar) {
        h.h.k.e.g(eVar, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new f(eVar, this.c));
            } else {
                this.b.add(eVar);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public void t(e eVar) {
        h.h.k.e.g(eVar, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            this.b.remove(eVar);
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public void u(EditorInfo editorInfo) {
        if (!j() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.e.c(editorInfo);
    }
}
