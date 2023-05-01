package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class c0 extends LinearLayoutManager {
    public c0(int i6) {
        super(i6);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public final void z0(RecyclerView recyclerView, int i6) {
        b0 b0Var = new b0(recyclerView.getContext());
        b0Var.f1944a = i6;
        A0(b0Var);
    }
}
