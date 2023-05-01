package q1;

import android.annotation.SuppressLint;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import i1.i;
import r1.l;
/* loaded from: classes.dex */
public final class a implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5798a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f5799b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f5800c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ i1.b f5801d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ l f5802e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ i f5803f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ b f5804g;

    /* renamed from: q1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0080a implements ImageDecoder.OnPartialImageListener {
        @Override // android.graphics.ImageDecoder.OnPartialImageListener
        public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public a(b bVar, int i6, int i7, boolean z5, i1.b bVar2, l lVar, i iVar) {
        this.f5804g = bVar;
        this.f5798a = i6;
        this.f5799b = i7;
        this.f5800c = z5;
        this.f5801d = bVar2;
        this.f5802e = lVar;
        this.f5803f = iVar;
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    @SuppressLint({"Override"})
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace colorSpace4;
        boolean isWideGamut;
        boolean z5 = false;
        if (this.f5804g.f5805a.a(this.f5798a, this.f5799b, this.f5800c, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f5801d == i1.b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C0080a());
        size = imageInfo.getSize();
        int i6 = this.f5798a;
        if (i6 == Integer.MIN_VALUE) {
            i6 = size.getWidth();
        }
        int i7 = this.f5799b;
        if (i7 == Integer.MIN_VALUE) {
            i7 = size.getHeight();
        }
        float b6 = this.f5802e.b(size.getWidth(), size.getHeight(), i6, i7);
        int round = Math.round(size.getWidth() * b6);
        int round2 = Math.round(size.getHeight() * b6);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + b6);
        }
        imageDecoder.setTargetSize(round, round2);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 28) {
            if (i8 >= 26) {
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
                imageDecoder.setTargetColorSpace(colorSpace);
                return;
            }
            return;
        }
        if (this.f5803f == i.DISPLAY_P3) {
            colorSpace3 = imageInfo.getColorSpace();
            if (colorSpace3 != null) {
                colorSpace4 = imageInfo.getColorSpace();
                isWideGamut = colorSpace4.isWideGamut();
                if (isWideGamut) {
                    z5 = true;
                }
            }
        }
        colorSpace2 = ColorSpace.get(z5 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
        imageDecoder.setTargetColorSpace(colorSpace2);
    }
}
