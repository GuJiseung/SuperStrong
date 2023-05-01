package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.a0;
import androidx.fragment.app.i0;
import androidx.lifecycle.j;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class a extends i0 implements a0.m {

    /* renamed from: p  reason: collision with root package name */
    public final a0 f1383p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1384q;

    /* renamed from: r  reason: collision with root package name */
    public int f1385r;

    public a(a0 a0Var) {
        a0Var.G();
        w<?> wVar = a0Var.f1404t;
        if (wVar != null) {
            wVar.f1666d.getClassLoader();
        }
        this.f1385r = -1;
        this.f1383p = a0Var;
    }

    @Override // androidx.fragment.app.a0.m
    public final boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (a0.J(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f1505g) {
            a0 a0Var = this.f1383p;
            if (a0Var.f1389d == null) {
                a0Var.f1389d = new ArrayList<>();
            }
            a0Var.f1389d.add(this);
            return true;
        }
        return true;
    }

    public final void c(int i6) {
        i0.a aVar;
        if (this.f1505g) {
            if (a0.J(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i6);
            }
            ArrayList<i0.a> arrayList = this.f1499a;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                o oVar = arrayList.get(i7).f1515b;
                if (oVar != null) {
                    oVar.f1583r += i6;
                    if (a0.J(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f1515b + " to " + aVar.f1515b.f1583r);
                    }
                }
            }
        }
    }

    public final int d(boolean z5) {
        int i6;
        if (!this.f1384q) {
            if (a0.J(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new s0());
                g("  ", printWriter, true);
                printWriter.close();
            }
            this.f1384q = true;
            boolean z6 = this.f1505g;
            a0 a0Var = this.f1383p;
            if (z6) {
                i6 = a0Var.f1394i.getAndIncrement();
            } else {
                i6 = -1;
            }
            this.f1385r = i6;
            a0Var.x(this, z5);
            return this.f1385r;
        }
        throw new IllegalStateException("commit already called");
    }

    public final void e() {
        if (!this.f1505g) {
            this.f1383p.A(this, false);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public final void f(int i6, o oVar, String str, int i7) {
        String str2 = oVar.L;
        if (str2 != null) {
            s0.b.d(oVar, str2);
        }
        Class<?> cls = oVar.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = oVar.f1588y;
                if (str3 != null && !str.equals(str3)) {
                    throw new IllegalStateException("Can't change tag of fragment " + oVar + ": was " + oVar.f1588y + " now " + str);
                }
                oVar.f1588y = str;
            }
            if (i6 != 0) {
                if (i6 != -1) {
                    int i8 = oVar.f1586w;
                    if (i8 != 0 && i8 != i6) {
                        throw new IllegalStateException("Can't change container ID of fragment " + oVar + ": was " + oVar.f1586w + " now " + i6);
                    }
                    oVar.f1586w = i6;
                    oVar.f1587x = i6;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + oVar + " with tag " + str + " to container view with no id");
                }
            }
            b(new i0.a(i7, oVar));
            oVar.s = this.f1383p;
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    public final void g(String str, PrintWriter printWriter, boolean z5) {
        String str2;
        if (z5) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1506h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1385r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1384q);
            if (this.f1504f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1504f));
            }
            if (this.f1500b != 0 || this.f1501c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1500b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1501c));
            }
            if (this.f1502d != 0 || this.f1503e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1502d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1503e));
            }
            if (this.f1507i != 0 || this.f1508j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1507i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1508j);
            }
            if (this.f1509k != 0 || this.f1510l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1509k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1510l);
            }
        }
        ArrayList<i0.a> arrayList = this.f1499a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            i0.a aVar = arrayList.get(i6);
            switch (aVar.f1514a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f1514a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i6);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f1515b);
            if (z5) {
                if (aVar.f1517d != 0 || aVar.f1518e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f1517d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f1518e));
                }
                if (aVar.f1519f != 0 || aVar.f1520g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f1519f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f1520g));
                }
            }
        }
    }

    public final a h(o oVar) {
        a0 a0Var = oVar.s;
        if (a0Var != null && a0Var != this.f1383p) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + oVar.toString() + " is already attached to a FragmentManager.");
        }
        b(new i0.a(3, oVar));
        return this;
    }

    public final a i(o oVar, j.c cVar) {
        a0 a0Var = oVar.s;
        a0 a0Var2 = this.f1383p;
        if (a0Var == a0Var2) {
            if (cVar == j.c.INITIALIZED && oVar.f1567b > -1) {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + " after the Fragment has been created");
            } else if (cVar != j.c.DESTROYED) {
                b(new i0.a(oVar, cVar));
                return this;
            } else {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
            }
        }
        throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + a0Var2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1385r >= 0) {
            sb.append(" #");
            sb.append(this.f1385r);
        }
        if (this.f1506h != null) {
            sb.append(" ");
            sb.append(this.f1506h);
        }
        sb.append("}");
        return sb.toString();
    }
}
