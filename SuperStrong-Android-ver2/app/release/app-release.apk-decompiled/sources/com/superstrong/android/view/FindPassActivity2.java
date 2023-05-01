package com.superstrong.android.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.c;
import com.superstrong.android.R;
import l4.f;
/* loaded from: classes.dex */
public final class FindPassActivity2 extends c {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f3536x = 0;

    @Override // androidx.fragment.app.r, androidx.activity.ComponentActivity, v.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_findpass2);
        View findViewById = findViewById(R.id.confirm_button);
        f.e(findViewById, "findViewById(R.id.confirm_button)");
        ((Button) findViewById).setOnClickListener(new m3.c(5, this));
    }
}
