package com.bumptech.glide;

import c2.a;
import com.bumptech.glide.m;
/* loaded from: classes.dex */
public abstract class m<CHILD extends m<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: b  reason: collision with root package name */
    public final a.C0020a f2872b = c2.a.f2751a;

    /* renamed from: a */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e6) {
            throw new RuntimeException(e6);
        }
    }
}
