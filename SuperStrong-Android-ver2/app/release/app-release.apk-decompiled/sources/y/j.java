package y;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import x.d;
/* loaded from: classes.dex */
public final class j extends l {
    public static Font g(FontFamily fontFamily, int i6) {
        FontStyle fontStyle = new FontStyle((i6 & 1) != 0 ? 700 : 400, (i6 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int h6 = h(fontStyle, font.getStyle());
        for (int i7 = 1; i7 < fontFamily.getSize(); i7++) {
            Font font2 = fontFamily.getFont(i7);
            int h7 = h(fontStyle, font2.getStyle());
            if (h7 < h6) {
                font = font2;
                h6 = h7;
            }
        }
        return font;
    }

    public static int h(FontStyle fontStyle, FontStyle fontStyle2) {
        int weight;
        int weight2;
        int slant;
        int slant2;
        weight = fontStyle.getWeight();
        weight2 = fontStyle2.getWeight();
        int abs = Math.abs(weight - weight2) / 100;
        slant = fontStyle.getSlant();
        slant2 = fontStyle2.getSlant();
        return abs + (slant == slant2 ? 0 : 2);
    }

    @Override // y.l
    public final Typeface a(Context context, d.c cVar, Resources resources, int i6) {
        d.C0099d[] c0099dArr;
        int i7;
        try {
            FontFamily.Builder builder = null;
            for (d.C0099d c0099d : cVar.f6614a) {
                try {
                    Font.Builder weight = new Font.Builder(resources, c0099d.f6620f).setWeight(c0099d.f6616b);
                    if (c0099d.f6617c) {
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    Font build = weight.setSlant(i7).setTtcIndex(c0099d.f6619e).setFontVariationSettings(c0099d.f6618d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(g(build2, i6).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // y.l
    public final Typeface b(Context context, c0.m[] mVarArr, int i6) {
        ParcelFileDescriptor openFileDescriptor;
        int i7;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (c0.m mVar : mVarArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(mVar.f2723a, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor == null) {
                    }
                } else {
                    try {
                        Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(mVar.f2725c);
                        if (mVar.f2726d) {
                            i7 = 1;
                        } else {
                            i7 = 0;
                        }
                        Font build = weight.setSlant(i7).setTtcIndex(mVar.f2724b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                        break;
                    }
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(g(build2, i6).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // y.l
    public final Typeface c(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // y.l
    public final Typeface d(Context context, Resources resources, int i6, String str, int i7) {
        try {
            Font build = new Font.Builder(resources, i6).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // y.l
    public final c0.m f(int i6, c0.m[] mVarArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
