package x;

import android.content.res.ColorStateList;
import android.graphics.Shader;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Shader f6611a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f6612b;

    /* renamed from: c  reason: collision with root package name */
    public int f6613c;

    public c(Shader shader, ColorStateList colorStateList, int i6) {
        this.f6611a = shader;
        this.f6612b = colorStateList;
        this.f6613c = i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x017e, code lost:
        if (r8.size() <= 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0180, code lost:
        r0 = new x.e((java.util.ArrayList) r8, (java.util.ArrayList) r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0186, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0187, code lost:
        if (r0 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x018c, code lost:
        if (r19 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x018e, code lost:
        r0 = new x.e(r5, r10, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0192, code lost:
        r0 = new x.e(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0196, code lost:
        if (r11 == 1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0199, code lost:
        if (r11 == 2) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x019b, code lost:
        r4 = r0.f6625a;
        r0 = r0.f6626b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01a1, code lost:
        if (r7 == 1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01a3, code lost:
        if (r7 == 2) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01a5, code lost:
        r1 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01a8, code lost:
        r1 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01ab, code lost:
        r1 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ad, code lost:
        r3 = new android.graphics.LinearGradient(r12, r26, r25, (float) r15, r4, r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01be, code lost:
        r3 = new android.graphics.SweepGradient((float) r7, (float) r9, r0.f6625a, r0.f6626b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01d3, code lost:
        if (r8 <= 0.0f) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01d5, code lost:
        r1 = r0.f6625a;
        r0 = r0.f6626b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01dc, code lost:
        if (r7 == 1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01df, code lost:
        if (r7 == 2) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01e1, code lost:
        r5 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01e4, code lost:
        r5 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01e7, code lost:
        r5 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01e9, code lost:
        r3 = new android.graphics.RadialGradient((float) r7, (float) r9, (float) r8, r1, r0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0201, code lost:
        return new x.c(r3, null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0209, code lost:
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Type inference failed for: r15v2, types: [float, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v9, types: [float, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static x.c a(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.c.a(android.content.res.Resources, int, android.content.res.Resources$Theme):x.c");
    }

    public final boolean b() {
        ColorStateList colorStateList;
        return this.f6611a == null && (colorStateList = this.f6612b) != null && colorStateList.isStateful();
    }
}
