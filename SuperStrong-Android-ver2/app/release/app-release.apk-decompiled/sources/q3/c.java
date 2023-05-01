package q3;

import java.lang.reflect.Field;
import java.util.Locale;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class c implements q3.d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f5829b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ c[] f5830c;

    /* loaded from: classes.dex */
    public enum a extends c {
        public a() {
            super("IDENTITY", 0);
        }

        @Override // q3.d
        public final String a(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a();
        f5829b = aVar;
        f5830c = new c[]{aVar, new c() { // from class: q3.c.b
            @Override // q3.d
            public final String a(Field field) {
                return c.c(field.getName());
            }
        }, new c() { // from class: q3.c.c
            @Override // q3.d
            public final String a(Field field) {
                return c.c(c.b(field.getName(), " "));
            }
        }, new c() { // from class: q3.c.d
            @Override // q3.d
            public final String a(Field field) {
                return c.b(field.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        }, new c() { // from class: q3.c.e
            @Override // q3.d
            public final String a(Field field) {
                return c.b(field.getName(), "-").toLowerCase(Locale.ENGLISH);
            }
        }, new c() { // from class: q3.c.f
            @Override // q3.d
            public final String a(Field field) {
                return c.b(field.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    public c() {
        throw null;
    }

    public c(String str, int i6) {
    }

    public static String b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i6 = 0; i6 < length; i6++) {
            char charAt = str.charAt(i6);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static String c(String str) {
        int i6;
        String valueOf;
        StringBuilder sb = new StringBuilder();
        int i7 = 0;
        char charAt = str.charAt(0);
        int length = str.length();
        while (i7 < length - 1 && !Character.isLetter(charAt)) {
            sb.append(charAt);
            i7++;
            charAt = str.charAt(i7);
        }
        if (!Character.isUpperCase(charAt)) {
            char upperCase = Character.toUpperCase(charAt);
            if (i7 + 1 < str.length()) {
                valueOf = upperCase + str.substring(i6);
            } else {
                valueOf = String.valueOf(upperCase);
            }
            sb.append(valueOf);
            return sb.toString();
        }
        return str;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f5830c.clone();
    }
}
