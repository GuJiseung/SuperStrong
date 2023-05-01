package l4;

import l4.b;
import s4.y;
/* loaded from: classes.dex */
public abstract class j extends b implements p4.c {

    /* renamed from: h  reason: collision with root package name */
    public final boolean f5140h;

    public j() {
        super(b.a.f5135b, null, null, null, false);
        this.f5140h = false;
    }

    public final boolean equals(Object obj) {
        p4.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (c().equals(jVar.c()) && this.f5132e.equals(jVar.f5132e) && this.f5133f.equals(jVar.f5133f) && f.a(this.f5130c, jVar.f5130c)) {
                return true;
            }
            return false;
        } else if (!(obj instanceof p4.c)) {
            return false;
        } else {
            if (this.f5140h) {
                aVar = this;
            } else {
                aVar = this.f5129b;
                if (aVar == null) {
                    aVar = b();
                    this.f5129b = aVar;
                }
            }
            return obj.equals(aVar);
        }
    }

    public final int hashCode() {
        int hashCode = this.f5132e.hashCode();
        return this.f5133f.hashCode() + ((hashCode + (c().hashCode() * 31)) * 31);
    }

    public final String toString() {
        p4.a aVar;
        if (this.f5140h) {
            aVar = this;
        } else {
            aVar = this.f5129b;
            if (aVar == null) {
                aVar = b();
                this.f5129b = aVar;
            }
        }
        if (aVar != this) {
            return aVar.toString();
        }
        return "property " + this.f5132e + " (Kotlin reflection is not available)";
    }

    public j(Object obj) {
        super(obj, y.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
        this.f5140h = false;
    }
}
