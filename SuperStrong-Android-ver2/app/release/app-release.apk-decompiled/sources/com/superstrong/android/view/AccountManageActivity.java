package com.superstrong.android.view;

import a4.l;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.c;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.superstrong.android.R;
import com.superstrong.android.view.AccountManageActivity;
import l4.f;
/* loaded from: classes.dex */
public final class AccountManageActivity extends c {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f3531x = 0;

    @Override // androidx.fragment.app.r, androidx.activity.ComponentActivity, v.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_account_manage);
        final Intent intent = new Intent(this, ChpasswdActivity.class);
        final Intent intent2 = new Intent(this, ChpasswdActivity.class);
        final Intent intent3 = new Intent(this, ChpasswdActivity.class);
        View findViewById = findViewById(R.id.navigationView);
        f.e(findViewById, "findViewById(R.id.navigationView)");
        ((BottomNavigationView) findViewById).setOnNavigationItemSelectedListener(new l(this));
        ((TextView) findViewById(R.id.manage_chpass)).setOnClickListener(new View.OnClickListener() { // from class: a4.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = AccountManageActivity.f3531x;
                AccountManageActivity accountManageActivity = AccountManageActivity.this;
                l4.f.f(accountManageActivity, "this$0");
                Intent intent4 = intent;
                l4.f.f(intent4, "$intentChpass");
                accountManageActivity.startActivity(intent4);
            }
        });
        ((TextView) findViewById(R.id.manage_withdrawal)).setOnClickListener(new View.OnClickListener() { // from class: a4.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = AccountManageActivity.f3531x;
                AccountManageActivity accountManageActivity = AccountManageActivity.this;
                l4.f.f(accountManageActivity, "this$0");
                Intent intent4 = intent2;
                l4.f.f(intent4, "$intentWithdrawal");
                accountManageActivity.startActivity(intent4);
            }
        });
        ((TextView) findViewById(R.id.manage_qna)).setOnClickListener(new View.OnClickListener() { // from class: a4.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = AccountManageActivity.f3531x;
                AccountManageActivity accountManageActivity = AccountManageActivity.this;
                l4.f.f(accountManageActivity, "this$0");
                Intent intent4 = intent3;
                l4.f.f(intent4, "$intentQna");
                accountManageActivity.startActivity(intent4);
            }
        });
    }
}
