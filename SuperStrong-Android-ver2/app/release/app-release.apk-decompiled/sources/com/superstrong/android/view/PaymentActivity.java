package com.superstrong.android.view;

import a4.e;
import a4.l;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.i0;
import androidx.lifecycle.s;
import b4.o;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.superstrong.android.R;
import l4.f;
import z3.g;
/* loaded from: classes.dex */
public final class PaymentActivity extends androidx.appcompat.app.c {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f3537z = 0;

    /* renamed from: x  reason: collision with root package name */
    public g f3538x;

    /* renamed from: y  reason: collision with root package name */
    public o f3539y;

    /* loaded from: classes.dex */
    public static final class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i6, long j5) {
            PaymentActivity paymentActivity = PaymentActivity.this;
            if (i6 == 0 || i6 == 1 || i6 == 2) {
                int i7 = PaymentActivity.f3537z;
                paymentActivity.getClass();
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
            o oVar = PaymentActivity.this.f3539y;
            if (oVar != null) {
                oVar.f2473d.j(String.valueOf(charSequence));
            } else {
                f.k("paymentVModel");
                throw null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
        @Override // android.text.TextWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            /*
                r0 = this;
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r2 = 0
                r4.b r3 = r4.c.f5972a     // Catch: java.lang.NumberFormatException -> L1f
                r3.getClass()     // Catch: java.lang.NumberFormatException -> L1f
                java.util.regex.Pattern r3 = r3.f5971b     // Catch: java.lang.NumberFormatException -> L1f
                java.util.regex.Matcher r3 = r3.matcher(r1)     // Catch: java.lang.NumberFormatException -> L1f
                boolean r3 = r3.matches()     // Catch: java.lang.NumberFormatException -> L1f
                if (r3 == 0) goto L1f
                double r3 = java.lang.Double.parseDouble(r1)     // Catch: java.lang.NumberFormatException -> L1f
                java.lang.Double r1 = java.lang.Double.valueOf(r3)     // Catch: java.lang.NumberFormatException -> L1f
                goto L20
            L1f:
                r1 = r2
            L20:
                if (r1 != 0) goto L28
                r3 = 0
                java.lang.Double r1 = java.lang.Double.valueOf(r3)
            L28:
                com.superstrong.android.view.PaymentActivity r3 = com.superstrong.android.view.PaymentActivity.this
                b4.o r3 = r3.f3539y
                if (r3 == 0) goto L34
                androidx.lifecycle.s<java.lang.Double> r2 = r3.f2474e
                r2.j(r1)
                return
            L34:
                java.lang.String r1 = "paymentVModel"
                l4.f.k(r1)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.superstrong.android.view.PaymentActivity.c.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements AdapterView.OnItemSelectedListener {
        public d() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i6, long j5) {
            String str;
            Object itemAtPosition;
            if (adapterView != null && (itemAtPosition = adapterView.getItemAtPosition(i6)) != null) {
                str = itemAtPosition.toString();
            } else {
                str = null;
            }
            o oVar = PaymentActivity.this.f3539y;
            if (oVar != null) {
                s<String> sVar = oVar.f2475f;
                if (str == null) {
                    str = "";
                }
                sVar.j(str);
                return;
            }
            f.k("paymentVModel");
            throw null;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
            o oVar = PaymentActivity.this.f3539y;
            if (oVar != null) {
                oVar.f2473d.j("");
            } else {
                f.k("paymentVModel");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.r, androidx.activity.ComponentActivity, v.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_payment);
        this.f3539y = (o) new i0(this).a(o.class);
        int i6 = R.id.navigationView;
        View findViewById = findViewById(R.id.navigationView);
        f.e(findViewById, "findViewById(R.id.navigationView)");
        ((BottomNavigationView) findViewById).setOnNavigationItemSelectedListener(new l(this));
        View inflate = getLayoutInflater().inflate(R.layout.activity_payment, (ViewGroup) null, false);
        int i7 = R.id.btn_back;
        ImageView imageView = (ImageView) c.a.k(inflate, R.id.btn_back);
        if (imageView != null) {
            i7 = R.id.edit_coin;
            EditText editText = (EditText) c.a.k(inflate, R.id.edit_coin);
            if (editText != null) {
                i7 = R.id.linearLayout;
                if (((LinearLayout) c.a.k(inflate, R.id.linearLayout)) != null) {
                    if (((BottomNavigationView) c.a.k(inflate, R.id.navigationView)) != null) {
                        i6 = R.id.next_button;
                        Button button = (Button) c.a.k(inflate, R.id.next_button);
                        if (button != null) {
                            i6 = R.id.sample_EditText;
                            EditText editText2 = (EditText) c.a.k(inflate, R.id.sample_EditText);
                            if (editText2 != null) {
                                i6 = R.id.spinner;
                                Spinner spinner = (Spinner) c.a.k(inflate, R.id.spinner);
                                if (spinner != null) {
                                    i6 = R.id.textView3;
                                    if (((TextView) c.a.k(inflate, R.id.textView3)) != null) {
                                        i6 = R.id.toolbar;
                                        if (((Toolbar) c.a.k(inflate, R.id.toolbar)) != null) {
                                            i6 = R.id.toolbar_line;
                                            if (c.a.k(inflate, R.id.toolbar_line) != null) {
                                                i6 = R.id.toolbar_title;
                                                if (((TextView) c.a.k(inflate, R.id.toolbar_title)) != null) {
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                    this.f3538x = new g(constraintLayout, imageView, editText, button, editText2, spinner);
                                                    setContentView(constraintLayout);
                                                    g gVar = this.f3538x;
                                                    if (gVar != null) {
                                                        gVar.f7029a.setOnClickListener(new f3.a(2, this));
                                                        g gVar2 = this.f3538x;
                                                        if (gVar2 != null) {
                                                            gVar2.f7033e.setAdapter((SpinnerAdapter) ArrayAdapter.createFromResource(this, R.array.itemList, 17367048));
                                                            g gVar3 = this.f3538x;
                                                            if (gVar3 != null) {
                                                                gVar3.f7033e.setOnItemSelectedListener(new a());
                                                                g gVar4 = this.f3538x;
                                                                if (gVar4 != null) {
                                                                    gVar4.f7031c.setOnClickListener(new e(2, this));
                                                                    g gVar5 = this.f3538x;
                                                                    if (gVar5 != null) {
                                                                        gVar5.f7032d.addTextChangedListener(new b());
                                                                        g gVar6 = this.f3538x;
                                                                        if (gVar6 != null) {
                                                                            gVar6.f7030b.addTextChangedListener(new c());
                                                                            g gVar7 = this.f3538x;
                                                                            if (gVar7 != null) {
                                                                                gVar7.f7033e.setOnItemSelectedListener(new d());
                                                                                return;
                                                                            }
                                                                            f.k("binding");
                                                                            throw null;
                                                                        }
                                                                        f.k("binding");
                                                                        throw null;
                                                                    }
                                                                    f.k("binding");
                                                                    throw null;
                                                                }
                                                                f.k("binding");
                                                                throw null;
                                                            }
                                                            f.k("binding");
                                                            throw null;
                                                        }
                                                        f.k("binding");
                                                        throw null;
                                                    }
                                                    f.k("binding");
                                                    throw null;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
                }
            }
        }
        i6 = i7;
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
    }
}
