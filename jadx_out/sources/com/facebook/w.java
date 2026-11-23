package com.facebook;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class w extends AbstractList<u> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AtomicInteger f804g = new AtomicInteger();
    private Handler a;
    private int b;
    private final String c;
    private List<u> d;
    private List<a> e;
    private String f;

    public interface a {
        void a(w wVar);
    }

    public interface b extends a {
        void b(w wVar, long j2, long j3);
    }

    public w(Collection<u> collection) {
        l.y.c.i.e(collection, "requests");
        this.c = String.valueOf(f804g.incrementAndGet());
        this.e = new ArrayList();
        this.d = new ArrayList(collection);
    }

    public w(u... uVarArr) {
        l.y.c.i.e(uVarArr, "requests");
        this.c = String.valueOf(f804g.incrementAndGet());
        this.e = new ArrayList();
        this.d = new ArrayList(l.t.g.b(uVarArr));
    }

    private final List<x> j() {
        return u.t.g(this);
    }

    private final v n() {
        return u.t.j(this);
    }

    public /* bridge */ boolean A(u uVar) {
        return super.remove(uVar);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public u remove(int i2) {
        return this.d.remove(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public u set(int i2, u uVar) {
        l.y.c.i.e(uVar, "element");
        return this.d.set(i2, uVar);
    }

    public final void D(Handler handler) {
        this.a = handler;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i2, u uVar) {
        l.y.c.i.e(uVar, "element");
        this.d.add(i2, uVar);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean add(u uVar) {
        l.y.c.i.e(uVar, "element");
        return this.d.add(uVar);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj != null ? obj instanceof u : true) {
            return f((u) obj);
        }
        return false;
    }

    public final void d(a aVar) {
        l.y.c.i.e(aVar, "callback");
        if (this.e.contains(aVar)) {
            return;
        }
        this.e.add(aVar);
    }

    public /* bridge */ boolean f(u uVar) {
        return super.contains(uVar);
    }

    public final List<x> h() {
        return j();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj != null ? obj instanceof u : true) {
            return y((u) obj);
        }
        return -1;
    }

    public final v l() {
        return n();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj != null ? obj instanceof u : true) {
            return z((u) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public u get(int i2) {
        return this.d.get(i2);
    }

    public final String r() {
        return this.f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj != null ? obj instanceof u : true) {
            return A((u) obj);
        }
        return false;
    }

    public final Handler s() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return w();
    }

    public final List<a> t() {
        return this.e;
    }

    public final String u() {
        return this.c;
    }

    public final List<u> v() {
        return this.d;
    }

    public int w() {
        return this.d.size();
    }

    public final int x() {
        return this.b;
    }

    public /* bridge */ int y(u uVar) {
        return super.indexOf(uVar);
    }

    public /* bridge */ int z(u uVar) {
        return super.lastIndexOf(uVar);
    }
}
