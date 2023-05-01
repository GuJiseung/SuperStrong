package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, Object> f2810a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap f2811a = new HashMap();
    }

    public h(a aVar) {
        this.f2810a = Collections.unmodifiableMap(new HashMap(aVar.f2811a));
    }
}
