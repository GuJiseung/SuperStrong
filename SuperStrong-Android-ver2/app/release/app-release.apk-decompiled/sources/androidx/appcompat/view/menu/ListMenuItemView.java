package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.j1;
import com.superstrong.android.R;
import f0.g0;
import f0.r0;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: b  reason: collision with root package name */
    public h f353b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f354c;

    /* renamed from: d  reason: collision with root package name */
    public RadioButton f355d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f356e;

    /* renamed from: f  reason: collision with root package name */
    public CheckBox f357f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f358g;

    /* renamed from: h  reason: collision with root package name */
    public ImageView f359h;

    /* renamed from: i  reason: collision with root package name */
    public ImageView f360i;

    /* renamed from: j  reason: collision with root package name */
    public LinearLayout f361j;

    /* renamed from: k  reason: collision with root package name */
    public final Drawable f362k;

    /* renamed from: l  reason: collision with root package name */
    public final int f363l;

    /* renamed from: m  reason: collision with root package name */
    public final Context f364m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f365n;

    /* renamed from: o  reason: collision with root package name */
    public final Drawable f366o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f367p;

    /* renamed from: q  reason: collision with root package name */
    public LayoutInflater f368q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f369r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j1 m5 = j1.m(getContext(), attributeSet, c.b.s, R.attr.listMenuViewStyle);
        this.f362k = m5.e(5);
        this.f363l = m5.i(1, -1);
        this.f365n = m5.a(7, false);
        this.f364m = context;
        this.f366o = m5.e(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.f367p = obtainStyledAttributes.hasValue(0);
        m5.n();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f368q == null) {
            this.f368q = LayoutInflater.from(getContext());
        }
        return this.f368q;
    }

    private void setSubMenuArrowVisible(boolean z5) {
        ImageView imageView = this.f359h;
        if (imageView != null) {
            imageView.setVisibility(z5 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f360i;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f360i.getLayoutParams();
        rect.top = this.f360i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
        if (r0 == false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0111  */
    @Override // androidx.appcompat.view.menu.k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(androidx.appcompat.view.menu.h r11) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.c(androidx.appcompat.view.menu.h):void");
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.f353b;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        g0.d.q(this, this.f362k);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f356e = textView;
        int i6 = this.f363l;
        if (i6 != -1) {
            textView.setTextAppearance(this.f364m, i6);
        }
        this.f358g = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f359h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f366o);
        }
        this.f360i = (ImageView) findViewById(R.id.group_divider);
        this.f361j = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i6, int i7) {
        if (this.f354c != null && this.f365n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f354c.getLayoutParams();
            int i8 = layoutParams.height;
            if (i8 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i8;
            }
        }
        super.onMeasure(i6, i7);
    }

    public void setCheckable(boolean z5) {
        boolean z6;
        CompoundButton compoundButton;
        View view;
        if (!z5 && this.f355d == null && this.f357f == null) {
            return;
        }
        if ((this.f353b.f472x & 4) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            if (this.f355d == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f355d = radioButton;
                LinearLayout linearLayout = this.f361j;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f355d;
            view = this.f357f;
        } else {
            if (this.f357f == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f357f = checkBox;
                LinearLayout linearLayout2 = this.f361j;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f357f;
            view = this.f355d;
        }
        if (z5) {
            compoundButton.setChecked(this.f353b.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view != null && view.getVisibility() != 8) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        CheckBox checkBox2 = this.f357f;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f355d;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z5) {
        boolean z6;
        CompoundButton compoundButton;
        if ((this.f353b.f472x & 4) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            if (this.f355d == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f355d = radioButton;
                LinearLayout linearLayout = this.f361j;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f355d;
        } else {
            if (this.f357f == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f357f = checkBox;
                LinearLayout linearLayout2 = this.f361j;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f357f;
        }
        compoundButton.setChecked(z5);
    }

    public void setForceShowIcon(boolean z5) {
        this.f369r = z5;
        this.f365n = z5;
    }

    public void setGroupDividerEnabled(boolean z5) {
        ImageView imageView = this.f360i;
        if (imageView != null) {
            imageView.setVisibility((this.f367p || !z5) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f353b.f464n.getClass();
        boolean z5 = this.f369r;
        if (!z5 && !this.f365n) {
            return;
        }
        ImageView imageView = this.f354c;
        if (imageView == null && drawable == null && !this.f365n) {
            return;
        }
        if (imageView == null) {
            ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
            this.f354c = imageView2;
            LinearLayout linearLayout = this.f361j;
            if (linearLayout != null) {
                linearLayout.addView(imageView2, 0);
            } else {
                addView(imageView2, 0);
            }
        }
        if (drawable == null && !this.f365n) {
            this.f354c.setVisibility(8);
            return;
        }
        ImageView imageView3 = this.f354c;
        if (!z5) {
            drawable = null;
        }
        imageView3.setImageDrawable(drawable);
        if (this.f354c.getVisibility() != 0) {
            this.f354c.setVisibility(0);
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i6;
        TextView textView;
        if (charSequence != null) {
            this.f356e.setText(charSequence);
            if (this.f356e.getVisibility() == 0) {
                return;
            }
            textView = this.f356e;
            i6 = 0;
        } else {
            i6 = 8;
            if (this.f356e.getVisibility() == 8) {
                return;
            }
            textView = this.f356e;
        }
        textView.setVisibility(i6);
    }
}
