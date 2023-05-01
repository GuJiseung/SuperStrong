package r;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import m.g;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5854a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5855b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5856c;

    /* renamed from: d  reason: collision with root package name */
    public int f5857d;

    /* renamed from: e  reason: collision with root package name */
    public float f5858e;

    /* renamed from: f  reason: collision with root package name */
    public String f5859f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5860g;

    /* renamed from: h  reason: collision with root package name */
    public int f5861h;

    public a(String str, int i6, Object obj, boolean z5) {
        this.f5854a = false;
        this.f5855b = str;
        this.f5856c = i6;
        this.f5854a = z5;
        c(obj);
    }

    public a(a aVar, Object obj) {
        this.f5854a = false;
        this.f5855b = aVar.f5855b;
        this.f5856c = aVar.f5856c;
        c(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        int resourceId;
        float dimension;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), c.a.f2643f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i6 = 0;
        boolean z5 = false;
        Object obj = null;
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = obtainStyledAttributes.getIndex(i7);
            int i8 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z5 = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i6 = 6;
            } else {
                int i9 = 3;
                if (index != 3) {
                    i9 = 4;
                    if (index != 2) {
                        if (index == 7) {
                            dimension = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                        } else if (index == 4) {
                            dimension = obtainStyledAttributes.getDimension(index, 0.0f);
                        } else if (index == 5) {
                            obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                            i6 = 2;
                        } else {
                            if (index == 6) {
                                resourceId = obtainStyledAttributes.getInteger(index, -1);
                            } else if (index == 9) {
                                obj = obtainStyledAttributes.getString(index);
                                i6 = 5;
                            } else {
                                i8 = 8;
                                if (index == 8) {
                                    resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                    if (resourceId == -1) {
                                        resourceId = obtainStyledAttributes.getInt(index, -1);
                                    }
                                }
                            }
                            obj = Integer.valueOf(resourceId);
                            i6 = i8;
                        }
                        obj = Float.valueOf(dimension);
                        i6 = 7;
                    }
                }
                i8 = i9;
                resourceId = obtainStyledAttributes.getColor(index, 0);
                obj = Integer.valueOf(resourceId);
                i6 = i8;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new a(str, i6, obj, z5));
        }
        obtainStyledAttributes.recycle();
    }

    public static void b(View view, HashMap<String, a> hashMap) {
        StringBuilder sb;
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            a aVar = hashMap.get(str);
            String str2 = aVar.f5854a ? str : "set" + str;
            try {
            } catch (IllegalAccessException e6) {
                e = e6;
                sb = new StringBuilder(" Custom Attribute \"");
                sb.append(str);
                sb.append("\" not found on ");
                sb.append(cls.getName());
                Log.e("TransitionLayout", sb.toString());
                e.printStackTrace();
            } catch (NoSuchMethodException e7) {
                Log.e("TransitionLayout", e7.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                Log.e("TransitionLayout", cls.getName() + " must have a method " + str2);
            } catch (InvocationTargetException e8) {
                e = e8;
                sb = new StringBuilder(" Custom Attribute \"");
                sb.append(str);
                sb.append("\" not found on ");
                sb.append(cls.getName());
                Log.e("TransitionLayout", sb.toString());
                e.printStackTrace();
            }
            switch (g.a(aVar.f5856c)) {
                case 0:
                    cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f5857d));
                    continue;
                case 1:
                    cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(aVar.f5858e));
                    continue;
                case 2:
                    cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f5861h));
                    continue;
                case 3:
                    Method method = cls.getMethod(str2, Drawable.class);
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(aVar.f5861h);
                    method.invoke(view, colorDrawable);
                    continue;
                case 4:
                    cls.getMethod(str2, CharSequence.class).invoke(view, aVar.f5859f);
                    continue;
                case 5:
                    cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.f5860g));
                    continue;
                case 6:
                    cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(aVar.f5858e));
                    continue;
                case 7:
                    cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f5857d));
                    continue;
                default:
                    continue;
            }
            Log.e("TransitionLayout", e7.getMessage());
            Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
            Log.e("TransitionLayout", cls.getName() + " must have a method " + str2);
        }
    }

    public final void c(Object obj) {
        switch (g.a(this.f5856c)) {
            case 0:
            case 7:
                this.f5857d = ((Integer) obj).intValue();
                return;
            case 1:
            case 6:
                this.f5858e = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f5861h = ((Integer) obj).intValue();
                return;
            case 4:
                this.f5859f = (String) obj;
                return;
            case 5:
                this.f5860g = ((Boolean) obj).booleanValue();
                return;
            default:
                return;
        }
    }
}
