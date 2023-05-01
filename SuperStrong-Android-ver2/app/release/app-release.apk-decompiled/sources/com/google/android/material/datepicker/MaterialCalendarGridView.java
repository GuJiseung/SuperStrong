package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.superstrong.android.R;
import java.util.Calendar;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MaterialCalendarGridView extends GridView {

    /* renamed from: b  reason: collision with root package name */
    public final Calendar f3082b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3083c;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f3082b = e0.d(null);
        if (q.U(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f3083c = q.V(getContext(), R.attr.nestedScrollable);
        f0.g0.l(this, new p());
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: a */
    public final w getAdapter2() {
        return (w) super.getAdapter();
    }

    public final View b(int i6) {
        return getChildAt(i6 - getFirstVisiblePosition());
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        w adapter2 = getAdapter2();
        d<?> dVar = adapter2.f3183c;
        c cVar = adapter2.f3185e;
        int max = Math.max(adapter2.b(), getFirstVisiblePosition());
        int min = Math.min((adapter2.b() + adapter2.f3182b.f3177f) - 1, getLastVisiblePosition());
        adapter2.getItem(max);
        adapter2.getItem(min);
        for (e0.c<Long, Long> cVar2 : dVar.d()) {
            cVar2.getClass();
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z5, int i6, Rect rect) {
        int b6;
        if (z5) {
            if (i6 == 33) {
                w adapter2 = getAdapter2();
                b6 = (adapter2.b() + adapter2.f3182b.f3177f) - 1;
            } else if (i6 == 130) {
                b6 = getAdapter2().b();
            } else {
                super.onFocusChanged(true, i6, rect);
                return;
            }
            setSelection(b6);
            return;
        }
        super.onFocusChanged(false, i6, rect);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i6, KeyEvent keyEvent) {
        if (super.onKeyDown(i6, keyEvent)) {
            if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().b()) {
                return true;
            }
            if (19 == i6) {
                setSelection(getAdapter2().b());
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i6, int i7) {
        if (!this.f3083c) {
            super.onMeasure(i6, i7);
            return;
        }
        super.onMeasure(i6, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof w)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), w.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i6) {
        if (i6 < getAdapter2().b()) {
            i6 = getAdapter2().b();
        }
        super.setSelection(i6);
    }
}
