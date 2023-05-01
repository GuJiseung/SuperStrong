package m4;

import java.util.Random;
/* loaded from: classes.dex */
public abstract class a extends c {
    @Override // m4.c
    public final int a() {
        return b().nextInt();
    }

    public abstract Random b();
}
