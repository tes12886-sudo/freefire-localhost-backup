package com.vk.sdk.k.k;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class r extends s<b> implements Parcelable {
    private final s.a<b> c;

    class a implements s.a<b> {
        a(r rVar) {
        }

        @Override // com.vk.sdk.k.k.s.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(JSONObject jSONObject) {
            String strOptString = jSONObject.optString("type");
            if ("photo".equals(strOptString)) {
                return new i().c(jSONObject.getJSONObject("photo"));
            }
            if ("video".equals(strOptString)) {
                p pVar = new p();
                pVar.h(jSONObject.getJSONObject("video"));
                return pVar;
            }
            if ("audio".equals(strOptString)) {
                d dVar = new d();
                dVar.h(jSONObject.getJSONObject("audio"));
                return dVar;
            }
            if ("doc".equals(strOptString)) {
                e eVar = new e();
                eVar.h(jSONObject.getJSONObject("doc"));
                return eVar;
            }
            if ("wall".equals(strOptString)) {
                n nVar = new n();
                nVar.h(jSONObject.getJSONObject("wall"));
                return nVar;
            }
            if ("posted_photo".equals(strOptString)) {
                o oVar = new o();
                oVar.j(jSONObject.getJSONObject("posted_photo"));
                return oVar;
            }
            if ("link".equals(strOptString)) {
                f fVar = new f();
                fVar.h(jSONObject.getJSONObject("link"));
                return fVar;
            }
            if ("note".equals(strOptString)) {
                h hVar = new h();
                hVar.h(jSONObject.getJSONObject("note"));
                return hVar;
            }
            if ("app".equals(strOptString)) {
                c cVar = new c();
                cVar.h(jSONObject.getJSONObject("app"));
                return cVar;
            }
            if ("poll".equals(strOptString)) {
                m mVar = new m();
                mVar.h(jSONObject.getJSONObject("poll"));
                return mVar;
            }
            if ("page".equals(strOptString)) {
                q qVar = new q();
                qVar.h(jSONObject.getJSONObject("page"));
                return qVar;
            }
            if (!"album".equals(strOptString)) {
                return null;
            }
            j jVar = new j();
            jVar.h(jSONObject.getJSONObject("album"));
            return jVar;
        }
    }

    public static abstract class b extends g implements com.vk.sdk.k.k.a {
        public abstract String d();

        public abstract CharSequence f();
    }

    public r() {
        this.c = new a(this);
    }

    public r(List<? extends b> list) {
        super(list);
        this.c = new a(this);
    }

    @Override // com.vk.sdk.k.k.s, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void t(JSONArray jSONArray) {
        super.h(jSONArray, this.c);
    }

    public String u() {
        ArrayList arrayList = new ArrayList();
        Iterator<b> it = iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f());
        }
        return com.vk.sdk.m.b.a(arrayList, ",");
    }

    @Override // com.vk.sdk.k.k.s, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(size());
        for (b bVar : this) {
            parcel.writeString(bVar.d());
            parcel.writeParcelable(bVar, 0);
        }
    }
}
