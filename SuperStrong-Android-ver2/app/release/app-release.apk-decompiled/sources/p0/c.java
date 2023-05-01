package p0;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;
import androidx.emoji2.text.f;
/* loaded from: classes.dex */
public final class c extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f5689a;

    /* renamed from: b  reason: collision with root package name */
    public final a f5690b;

    /* loaded from: classes.dex */
    public static class a {
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0050, code lost:
            if (java.lang.Character.isHighSurrogate(r5) != false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0080, code lost:
            if (r11 != false) goto L90;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x008d, code lost:
            if (java.lang.Character.isLowSurrogate(r5) != false) goto L67;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static boolean a(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
            /*
                Method dump skipped, instructions count: 252
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p0.c.a.a(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        boolean z5;
        int i6;
        a aVar = new a();
        this.f5689a = editText;
        this.f5690b = aVar;
        if (androidx.emoji2.text.f.f1317j != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            androidx.emoji2.text.f a6 = androidx.emoji2.text.f.a();
            if ((a6.b() == 1) && editorInfo != null) {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                f.a aVar2 = a6.f1322e;
                aVar2.getClass();
                Bundle bundle = editorInfo.extras;
                o0.b bVar = aVar2.f1327c.f1366a;
                int a7 = bVar.a(4);
                if (a7 != 0) {
                    i6 = bVar.f5503b.getInt(a7 + bVar.f5502a);
                } else {
                    i6 = 0;
                }
                bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i6);
                Bundle bundle2 = editorInfo.extras;
                aVar2.f1328a.getClass();
                bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i6, int i7) {
        Editable editableText = this.f5689a.getEditableText();
        this.f5690b.getClass();
        if (!a.a(this, editableText, i6, i7, false) && !super.deleteSurroundingText(i6, i7)) {
            return false;
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i6, int i7) {
        Editable editableText = this.f5689a.getEditableText();
        this.f5690b.getClass();
        if (a.a(this, editableText, i6, i7, true) || super.deleteSurroundingTextInCodePoints(i6, i7)) {
            return true;
        }
        return false;
    }
}
