package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import androidx.appcompat.widget.z0;
import com.superstrong.android.R;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f796b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    public static j f797c;

    /* renamed from: a  reason: collision with root package name */
    public z0 f798a;

    /* loaded from: classes.dex */
    public class a implements z0.b {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f799a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b  reason: collision with root package name */
        public final int[] f800b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c  reason: collision with root package name */
        public final int[] f801c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};

        /* renamed from: d  reason: collision with root package name */
        public final int[] f802d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e  reason: collision with root package name */
        public final int[] f803e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

        /* renamed from: f  reason: collision with root package name */
        public final int[] f804f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        public static boolean a(int[] iArr, int i6) {
            for (int i7 : iArr) {
                if (i7 == i6) {
                    return true;
                }
            }
            return false;
        }

        public static ColorStateList b(Context context, int i6) {
            int c6 = e1.c(context, R.attr.colorControlHighlight);
            return new ColorStateList(new int[][]{e1.f766b, e1.f768d, e1.f767c, e1.f770f}, new int[]{e1.b(context, R.attr.colorButtonNormal), y.a.b(c6, i6), y.a.b(c6, i6), i6});
        }

        public static void d(Drawable drawable, int i6, PorterDuff.Mode mode) {
            int[] iArr = p0.f875a;
            Drawable mutate = drawable.mutate();
            if (mode == null) {
                mode = j.f796b;
            }
            mutate.setColorFilter(j.c(i6, mode));
        }

        public final ColorStateList c(Context context, int i6) {
            if (i6 == R.drawable.abc_edit_text_material) {
                return w.a.a(context, R.color.abc_tint_edittext);
            }
            if (i6 == R.drawable.abc_switch_track_mtrl_alpha) {
                return w.a.a(context, R.color.abc_tint_switch_track);
            }
            if (i6 == R.drawable.abc_switch_thumb_material) {
                int[][] iArr = new int[3];
                int[] iArr2 = new int[3];
                ColorStateList d6 = e1.d(context, R.attr.colorSwitchThumbNormal);
                if (d6 != null && d6.isStateful()) {
                    int[] iArr3 = e1.f766b;
                    iArr[0] = iArr3;
                    iArr2[0] = d6.getColorForState(iArr3, 0);
                    iArr[1] = e1.f769e;
                    iArr2[1] = e1.c(context, R.attr.colorControlActivated);
                    iArr[2] = e1.f770f;
                    iArr2[2] = d6.getDefaultColor();
                } else {
                    iArr[0] = e1.f766b;
                    iArr2[0] = e1.b(context, R.attr.colorSwitchThumbNormal);
                    iArr[1] = e1.f769e;
                    iArr2[1] = e1.c(context, R.attr.colorControlActivated);
                    iArr[2] = e1.f770f;
                    iArr2[2] = e1.c(context, R.attr.colorSwitchThumbNormal);
                }
                return new ColorStateList(iArr, iArr2);
            } else if (i6 == R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, e1.c(context, R.attr.colorButtonNormal));
            } else {
                if (i6 == R.drawable.abc_btn_borderless_material) {
                    return b(context, 0);
                }
                if (i6 == R.drawable.abc_btn_colored_material) {
                    return b(context, e1.c(context, R.attr.colorAccent));
                }
                if (i6 != R.drawable.abc_spinner_mtrl_am_alpha && i6 != R.drawable.abc_spinner_textfield_background_material) {
                    if (a(this.f800b, i6)) {
                        return e1.d(context, R.attr.colorControlNormal);
                    }
                    if (a(this.f803e, i6)) {
                        return w.a.a(context, R.color.abc_tint_default);
                    }
                    if (a(this.f804f, i6)) {
                        return w.a.a(context, R.color.abc_tint_btn_checkable);
                    }
                    if (i6 == R.drawable.abc_seekbar_thumb_material) {
                        return w.a.a(context, R.color.abc_tint_seek_thumb);
                    }
                    return null;
                }
                return w.a.a(context, R.color.abc_tint_spinner);
            }
        }
    }

    public static synchronized j a() {
        j jVar;
        synchronized (j.class) {
            if (f797c == null) {
                d();
            }
            jVar = f797c;
        }
        return jVar;
    }

    public static synchronized PorterDuffColorFilter c(int i6, PorterDuff.Mode mode) {
        PorterDuffColorFilter g2;
        synchronized (j.class) {
            g2 = z0.g(i6, mode);
        }
        return g2;
    }

    public static synchronized void d() {
        synchronized (j.class) {
            if (f797c == null) {
                j jVar = new j();
                f797c = jVar;
                jVar.f798a = z0.c();
                z0 z0Var = f797c.f798a;
                a aVar = new a();
                synchronized (z0Var) {
                    z0Var.f1022e = aVar;
                }
            }
        }
    }

    public static void e(Drawable drawable, h1 h1Var, int[] iArr) {
        boolean z5;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = z0.f1015f;
        int[] state = drawable.getState();
        int[] iArr2 = p0.f875a;
        if (drawable.mutate() == drawable) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z6 = h1Var.f789d;
        if (!z6 && !h1Var.f788c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (z6) {
            colorStateList = h1Var.f786a;
        } else {
            colorStateList = null;
        }
        if (h1Var.f788c) {
            mode = h1Var.f787b;
        } else {
            mode = z0.f1015f;
        }
        if (colorStateList != null && mode != null) {
            porterDuffColorFilter = z0.g(colorStateList.getColorForState(iArr, 0), mode);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i6) {
        return this.f798a.e(context, i6);
    }
}
