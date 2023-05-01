package com.superstrong.android;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.a;
import androidx.databinding.b;
import java.util.ArrayList;
import java.util.List;
import z3.d;
import z3.i;
import z3.k;
import z3.p;
/* loaded from: classes.dex */
public class DataBinderMapperImpl extends a {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f3530a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(5);
        f3530a = sparseIntArray;
        sparseIntArray.put(R.layout.activity_chpasswd, 1);
        sparseIntArray.put(R.layout.activity_login, 2);
        sparseIntArray.put(R.layout.activity_signup, 3);
        sparseIntArray.put(R.layout.activity_splash, 4);
        sparseIntArray.put(R.layout.activity_wallet, 5);
    }

    @Override // androidx.databinding.a
    public final List<a> a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.a
    public final ViewDataBinding b(b bVar, View view, int i6) {
        int i7 = f3530a.get(i6);
        if (i7 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                if (i7 == 1) {
                    if ("layout/activity_chpasswd_0".equals(tag)) {
                        return new z3.b(bVar, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_chpasswd is invalid. Received: " + tag);
                } else if (i7 == 2) {
                    if ("layout/activity_login_0".equals(tag)) {
                        return new d(bVar, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
                } else if (i7 == 3) {
                    if ("layout/activity_signup_0".equals(tag)) {
                        return new i(bVar, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_signup is invalid. Received: " + tag);
                } else if (i7 == 4) {
                    if ("layout/activity_splash_0".equals(tag)) {
                        return new k(bVar, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
                } else if (i7 != 5) {
                    return null;
                } else {
                    if ("layout/activity_wallet_0".equals(tag)) {
                        return new p(bVar, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_wallet is invalid. Received: " + tag);
                }
            }
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }
}
