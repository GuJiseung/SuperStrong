package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.m;
import com.superstrong.android.R;
import f0.g0;
/* loaded from: classes.dex */
public class CheckableImageButton extends m implements Checkable {

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f3261h = {16842912};

    /* renamed from: e  reason: collision with root package name */
    public boolean f3262e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3263f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3264g;

    /* loaded from: classes.dex */
    public static class a extends l0.a {
        public static final Parcelable.Creator<a> CREATOR = new C0025a();

        /* renamed from: d  reason: collision with root package name */
        public boolean f3265d;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0025a implements Parcelable.ClassLoaderCreator<a> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new a(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new a[i6];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3265d = parcel.readInt() == 1;
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // l0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeParcelable(this.f5073b, i6);
            parcel.writeInt(this.f3265d ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.imageButtonStyle);
        this.f3263f = true;
        this.f3264g = true;
        g0.l(this, new z2.a(this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f3262e;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i6) {
        return this.f3262e ? View.mergeDrawableStates(super.onCreateDrawableState(i6 + 1), f3261h) : super.onCreateDrawableState(i6);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f5073b);
        setChecked(aVar.f3265d);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f3265d = this.f3262e;
        return aVar;
    }

    public void setCheckable(boolean z5) {
        if (this.f3263f != z5) {
            this.f3263f = z5;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z5) {
        if (!this.f3263f || this.f3262e == z5) {
            return;
        }
        this.f3262e = z5;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z5) {
        this.f3264g = z5;
    }

    @Override // android.view.View
    public void setPressed(boolean z5) {
        if (this.f3264g) {
            super.setPressed(z5);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f3262e);
    }
}
