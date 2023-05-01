package com.superstrong.android.view;

import a4.e;
import a4.j;
import a4.l;
import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.activity.k;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.c;
import androidx.fragment.app.r;
import androidx.lifecycle.i0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import b4.g;
import b4.h;
import b4.s;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.d;
import com.superstrong.android.R;
import f3.a;
import java.util.ArrayList;
import l4.f;
import z3.o;
/* loaded from: classes.dex */
public final class WalletActivity extends r {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f3559z = 0;

    /* renamed from: w  reason: collision with root package name */
    public final String[] f3560w = {"잔금", "거래내용"};

    /* renamed from: x  reason: collision with root package name */
    public o f3561x;

    /* renamed from: y  reason: collision with root package name */
    public h f3562y;

    public final o B() {
        o oVar = this.f3561x;
        if (oVar != null) {
            return oVar;
        }
        f.k("binding");
        throw null;
    }

    @Override // androidx.fragment.app.r, androidx.activity.ComponentActivity, v.h, android.app.Activity
    @SuppressLint({"MissingInflatedId"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LayoutInflater layoutInflater = getLayoutInflater();
        int i6 = o.f7045x;
        DataBinderMapperImpl dataBinderMapperImpl = c.f1305a;
        o oVar = (o) ViewDataBinding.s(layoutInflater, R.layout.activity_wallet);
        f.e(oVar, "inflate(layoutInflater)");
        this.f3561x = oVar;
        setContentView(B().f1298h);
        h hVar = (h) new i0(this).a(h.class);
        f.f(hVar, "<set-?>");
        this.f3562y = hVar;
        o B = B();
        if (this.f3562y != null) {
            B.x();
            j jVar = new j(this);
            View findViewById = findViewById(R.id.navigationView);
            f.e(findViewById, "findViewById(R.id.navigationView)");
            ((BottomNavigationView) findViewById).setOnNavigationItemSelectedListener(new l(this));
            s sVar = new s(this);
            ViewPager2 viewPager2 = B().f7050w;
            f.e(viewPager2, "binding.viewPager");
            viewPager2.setNestedScrollingEnabled(true);
            viewPager2.setAdapter(sVar);
            SharedPreferences sharedPreferences = getSharedPreferences("strong", 0);
            String string = sharedPreferences.getString("ID", "");
            String string2 = sharedPreferences.getString("pub_ad", "");
            String string3 = sharedPreferences.getString("jwt_token", "");
            String string4 = sharedPreferences.getString("key", "");
            f.c(string);
            Log.d("kkkkkkkkkkkkkkkkkkkk", string);
            f.c(string3);
            Log.d("kkkkkkkkkkkkkkkkkkkk", string3);
            f.c(string4);
            Log.d("kkkkkkkkkkkkkkkkkkkk", string4);
            B().f7049v.setText(string);
            B().f7048t.setText(string2);
            h hVar2 = this.f3562y;
            if (hVar2 != null) {
                hVar2.f2464g.j(Boolean.TRUE);
                kotlinx.coroutines.internal.f.b(k.k(hVar2), new g(hVar2, string, string3, string4, null));
                TabLayout tabLayout = B().u;
                f.e(tabLayout, "binding.tabLayout1");
                d dVar = new d(tabLayout, viewPager2, new i0.d(5, this));
                if (!dVar.f3384e) {
                    RecyclerView.d<?> adapter = viewPager2.getAdapter();
                    dVar.f3383d = adapter;
                    if (adapter != null) {
                        dVar.f3384e = true;
                        viewPager2.f2210d.f2240a.add(new d.c(tabLayout));
                        d.C0028d c0028d = new d.C0028d(viewPager2, true);
                        ArrayList<TabLayout.c> arrayList = tabLayout.M;
                        if (!arrayList.contains(c0028d)) {
                            arrayList.add(c0028d);
                        }
                        dVar.f3383d.f1892a.registerObserver(new d.a());
                        dVar.a();
                        tabLayout.k(viewPager2.getCurrentItem(), 0.0f, true, true);
                        ImageView imageView = B().f7046q;
                        f.e(imageView, "binding.imgPayment");
                        ImageView imageView2 = B().s;
                        f.e(imageView2, "binding.imgTimecoin");
                        ImageView imageView3 = B().f7047r;
                        f.e(imageView3, "binding.imgSwap");
                        imageView.setOnClickListener(new e(9, this));
                        imageView2.setOnClickListener(new m3.c(12, this));
                        imageView3.setOnClickListener(new a(8, this));
                        h hVar3 = this.f3562y;
                        if (hVar3 != null) {
                            hVar3.f2464g.e(this, new m3.j(5, jVar));
                            h hVar4 = this.f3562y;
                            if (hVar4 != null) {
                                hVar4.f2465h.e(this, new a4.h(3, this));
                                return;
                            } else {
                                f.k("viewModel");
                                throw null;
                            }
                        }
                        f.k("viewModel");
                        throw null;
                    }
                    throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
                }
                throw new IllegalStateException("TabLayoutMediator is already attached");
            }
            f.k("viewModel");
            throw null;
        }
        f.k("viewModel");
        throw null;
    }
}
