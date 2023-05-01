package q1;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import i1.g;
import i1.h;
import i1.i;
import i1.j;
import r1.d;
import r1.e;
import r1.l;
import r1.m;
import r1.r;
/* loaded from: classes.dex */
public abstract class b<T> implements j<ImageDecoder.Source, T> {

    /* renamed from: a  reason: collision with root package name */
    public final r f5805a;

    public b() {
        if (r.f5934j == null) {
            synchronized (r.class) {
                if (r.f5934j == null) {
                    r.f5934j = new r();
                }
            }
        }
        this.f5805a = r.f5934j;
    }

    @Override // i1.j
    public final /* bridge */ /* synthetic */ boolean b(ImageDecoder.Source source, h hVar) {
        return true;
    }

    @Override // i1.j
    /* renamed from: c */
    public final e a(ImageDecoder.Source source, int i6, int i7, h hVar) {
        boolean z5;
        Bitmap decodeBitmap;
        i1.b bVar = (i1.b) hVar.c(m.f5916f);
        l lVar = (l) hVar.c(l.f5914f);
        g<Boolean> gVar = m.f5919i;
        if (hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue()) {
            z5 = true;
        } else {
            z5 = false;
        }
        d dVar = (d) this;
        decodeBitmap = ImageDecoder.decodeBitmap(source, new a(this, i6, i7, z5, bVar, lVar, (i) hVar.c(m.f5917g)));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i6 + "x" + i7 + "]");
        }
        return new e(decodeBitmap, dVar.f5895b);
    }
}
