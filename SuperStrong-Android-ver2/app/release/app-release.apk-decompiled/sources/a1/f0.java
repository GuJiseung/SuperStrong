package a1;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.t1;
import c4.d;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes.dex */
public class f0 implements x1.h {

    /* renamed from: a  reason: collision with root package name */
    public static Field f23a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f24b;

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f25c = new int[0];

    /* renamed from: d  reason: collision with root package name */
    public static final Object[] f26d = new Object[0];

    /* renamed from: e  reason: collision with root package name */
    public static f0 f27e;

    public /* synthetic */ f0() {
    }

    public static int c(int i6, int i7, int[] iArr) {
        int i8 = i6 - 1;
        int i9 = 0;
        while (i9 <= i8) {
            int i10 = (i9 + i8) >>> 1;
            int i11 = iArr[i10];
            if (i11 < i7) {
                i9 = i10 + 1;
            } else if (i11 <= i7) {
                return i10;
            } else {
                i8 = i10 - 1;
            }
        }
        return ~i9;
    }

    public static int d(long[] jArr, int i6, long j5) {
        int i7 = i6 - 1;
        int i8 = 0;
        while (i8 <= i7) {
            int i9 = (i8 + i7) >>> 1;
            int i10 = (jArr[i9] > j5 ? 1 : (jArr[i9] == j5 ? 0 : -1));
            if (i10 < 0) {
                i8 = i9 + 1;
            } else if (i10 <= 0) {
                return i9;
            } else {
                i7 = i9 - 1;
            }
        }
        return ~i8;
    }

    public static final d.a e(Throwable th) {
        l4.f.f(th, "exception");
        return new d.a(th);
    }

    public static SimpleDateFormat g(int i6, int i7) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 == 3) {
                        str = "M/d/yy";
                    } else {
                        throw new IllegalArgumentException(androidx.activity.j.a("Unknown DateFormat style: ", i6));
                    }
                } else {
                    str = "MMM d, yyyy";
                }
            } else {
                str = "MMMM d, yyyy";
            }
        } else {
            str = "EEEE, MMMM d, yyyy";
        }
        sb.append(str);
        sb.append(" ");
        if (i7 != 0 && i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    str2 = "h:mm a";
                } else {
                    throw new IllegalArgumentException(androidx.activity.j.a("Unknown DateFormat style: ", i7));
                }
            } else {
                str2 = "h:mm:ss a";
            }
        } else {
            str2 = "h:mm:ss a z";
        }
        sb.append(str2);
        return new SimpleDateFormat(sb.toString(), Locale.US);
    }

    public static final int h(int i6) {
        if (i6 < 0) {
            return i6;
        }
        if (i6 < 3) {
            return i6 + 1;
        }
        if (i6 < 1073741824) {
            return (int) ((i6 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static void i(View view, EditorInfo editorInfo, InputConnection inputConnection) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof t1) {
                editorInfo.hintText = ((t1) parent).a();
                return;
            }
        }
    }

    public static final int j(double d6) {
        if (Double.isNaN(d6)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d6 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d6 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d6);
    }

    public static final void l(Object obj) {
        if (obj instanceof d.a) {
            throw ((d.a) obj).f2757b;
        }
    }

    public static final Map m(LinkedHashMap linkedHashMap) {
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        l4.f.e(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    @Override // x1.h
    public void a(x1.i iVar) {
        iVar.k();
    }

    @Override // x1.h
    public void b(x1.i iVar) {
    }

    public void f(float f6, float f7, h3.l lVar) {
        throw null;
    }

    public void k(View view, int i6) {
        if (!f24b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f23a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f24b = true;
        }
        Field field = f23a;
        if (field != null) {
            try {
                f23a.setInt(view, i6 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public /* synthetic */ f0(int i6) {
    }
}
