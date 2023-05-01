package p0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.f;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class d implements InputFilter {

    /* renamed from: b  reason: collision with root package name */
    public final TextView f5691b;

    /* renamed from: c  reason: collision with root package name */
    public a f5692c;

    /* loaded from: classes.dex */
    public static class a extends f.e {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference f5693a;

        /* renamed from: b  reason: collision with root package name */
        public final WeakReference f5694b;

        public a(TextView textView, d dVar) {
            this.f5693a = new WeakReference(textView);
            this.f5694b = new WeakReference(dVar);
        }

        @Override // androidx.emoji2.text.f.e
        public final void a() {
            boolean z5;
            int length;
            InputFilter[] filters;
            TextView textView = (TextView) this.f5693a.get();
            InputFilter inputFilter = (InputFilter) this.f5694b.get();
            if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
                for (InputFilter inputFilter2 : filters) {
                    if (inputFilter2 == inputFilter) {
                        z5 = true;
                        break;
                    }
                }
            }
            z5 = false;
            if (z5 && textView.isAttachedToWindow()) {
                CharSequence text = textView.getText();
                androidx.emoji2.text.f a6 = androidx.emoji2.text.f.a();
                if (text == null) {
                    length = 0;
                } else {
                    a6.getClass();
                    length = text.length();
                }
                CharSequence f6 = a6.f(0, length, text);
                if (text == f6) {
                    return;
                }
                int selectionStart = Selection.getSelectionStart(f6);
                int selectionEnd = Selection.getSelectionEnd(f6);
                textView.setText(f6);
                if (f6 instanceof Spannable) {
                    Spannable spannable = (Spannable) f6;
                    if (selectionStart >= 0 && selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionStart, selectionEnd);
                    } else if (selectionStart >= 0) {
                        Selection.setSelection(spannable, selectionStart);
                    } else if (selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionEnd);
                    }
                }
            }
        }
    }

    public d(TextView textView) {
        this.f5691b = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i6, int i7, Spanned spanned, int i8, int i9) {
        TextView textView = this.f5691b;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b6 = androidx.emoji2.text.f.a().b();
        if (b6 != 0) {
            boolean z5 = true;
            if (b6 != 1) {
                if (b6 != 3) {
                    return charSequence;
                }
            } else {
                if (i9 == 0 && i8 == 0 && spanned.length() == 0 && charSequence == textView.getText()) {
                    z5 = false;
                }
                if (z5 && charSequence != null) {
                    if (i6 != 0 || i7 != charSequence.length()) {
                        charSequence = charSequence.subSequence(i6, i7);
                    }
                    return androidx.emoji2.text.f.a().f(0, charSequence.length(), charSequence);
                }
                return charSequence;
            }
        }
        androidx.emoji2.text.f a6 = androidx.emoji2.text.f.a();
        if (this.f5692c == null) {
            this.f5692c = new a(textView, this);
        }
        a6.g(this.f5692c);
        return charSequence;
    }
}
