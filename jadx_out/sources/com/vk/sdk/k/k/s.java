package com.vk.sdk.k.k;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.sdk.k.k.a;
import com.vk.sdk.k.k.g;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class s<T extends g & Parcelable & com.vk.sdk.k.k.a> extends g implements List<T>, Parcelable {
    private ArrayList<T> a;
    private int b;

    public interface a<D> {
        D a(JSONObject jSONObject);
    }

    public static final class b<D extends g> implements a<D> {
        private final Class<? extends D> a;

        public b(Class<? extends D> cls) {
            this.a = cls;
        }

        @Override // com.vk.sdk.k.k.s.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public D a(JSONObject jSONObject) {
            try {
                Constructor<? extends D> constructor = this.a.getConstructor(JSONObject.class);
                if (constructor != null) {
                    return constructor.newInstance(jSONObject);
                }
            } catch (Exception unused) {
            }
            return (D) this.a.newInstance().c(jSONObject);
        }
    }

    public s() {
        this.a = new ArrayList<>();
        this.b = -1;
    }

    public s(List<? extends T> list) {
        this.a = new ArrayList<>();
        this.b = -1;
        this.a = new ArrayList<>(list);
    }

    public s(JSONArray jSONArray, Class<? extends T> cls) {
        this.a = new ArrayList<>();
        this.b = -1;
        j(jSONArray, cls);
    }

    public s(JSONObject jSONObject, Class<? extends T> cls) {
        this.a = new ArrayList<>();
        this.b = -1;
        n(jSONObject, cls);
    }

    @Override // java.util.List
    public boolean addAll(int i2, Collection<? extends T> collection) {
        return this.a.addAll(i2, collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        return this.a.addAll(collection);
    }

    @Override // com.vk.sdk.k.k.g
    public g c(JSONObject jSONObject) throws JSONException {
        throw new JSONException("Operation is not supported while class is generic");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.a.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.a.containsAll(collection);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int i2, T t) {
        this.a.add(i2, t);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return getClass().equals(obj.getClass()) && this.a.equals(obj);
    }

    @Override // java.util.List, java.util.Collection
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(T t) {
        return this.a.add(t);
    }

    public void h(JSONArray jSONArray, a<? extends T> aVar) {
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    T tA = aVar.a(jSONArray.getJSONObject(i2));
                    if (tA != null) {
                        this.a.add(tA);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return this.a.iterator();
    }

    public void j(JSONArray jSONArray, Class<? extends T> cls) {
        h(jSONArray, new b(cls));
    }

    public void l(JSONObject jSONObject, a<? extends T> aVar) {
        if (jSONObject != null) {
            h(jSONObject.optJSONArray("items"), aVar);
            this.b = jSONObject.optInt("count", this.b);
        }
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return this.a.listIterator();
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int i2) {
        return this.a.listIterator(i2);
    }

    public void n(JSONObject jSONObject, Class<? extends T> cls) {
        if (!jSONObject.has("response")) {
            l(jSONObject, new b(cls));
            return;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("response");
        if (jSONArrayOptJSONArray != null) {
            j(jSONArrayOptJSONArray, cls);
        } else {
            n(jSONObject.optJSONObject("response"), cls);
        }
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public T get(int i2) {
        return this.a.get(i2);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public T remove(int i2) {
        return this.a.remove(i2);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return this.a.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.a.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.a.retainAll(collection);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public T set(int i2, T t) {
        return this.a.set(i2, t);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.a.size();
    }

    @Override // java.util.List
    public List<T> subList(int i2, int i3) {
        return this.a.subList(i2, i3);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.a.toArray();
    }

    @Override // java.util.List, java.util.Collection
    public <T1> T1[] toArray(T1[] t1Arr) {
        return (T1[]) this.a.toArray(t1Arr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.a.size());
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i2);
        }
        parcel.writeInt(this.b);
    }
}
