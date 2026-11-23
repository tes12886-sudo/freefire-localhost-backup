package com.google.android.datatransport;

/* JADX INFO: loaded from: classes.dex */
final class a<T> extends c<T> {
    private final Integer a;
    private final T b;
    private final d c;

    a(Integer num, T t, d dVar) {
        this.a = num;
        if (t == null) {
            throw new NullPointerException("Null payload");
        }
        this.b = t;
        if (dVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.c = dVar;
    }

    @Override // com.google.android.datatransport.c
    public Integer a() {
        return this.a;
    }

    @Override // com.google.android.datatransport.c
    public T b() {
        return this.b;
    }

    @Override // com.google.android.datatransport.c
    public d c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Integer num = this.a;
        if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
            if (this.b.equals(cVar.b()) && this.c.equals(cVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.a + ", payload=" + this.b + ", priority=" + this.c + "}";
    }
}
