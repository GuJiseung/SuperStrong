package a4;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.superstrong.android.R;
import com.superstrong.android.view.AccountManageActivity;
import com.superstrong.android.view.WalletActivity;
/* loaded from: classes.dex */
public final class l implements BottomNavigationView.b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f191a;

    public l(Context context) {
        l4.f.f(context, "context");
        this.f191a = context;
    }

    @Override // b3.g.b
    public final boolean a(MenuItem menuItem) {
        Intent intent;
        l4.f.f(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        Context context = this.f191a;
        if (itemId == R.id.navigation_account) {
            intent = new Intent(context, AccountManageActivity.class);
        } else if (itemId != R.id.navigation_home) {
            return false;
        } else {
            intent = new Intent(context, WalletActivity.class);
        }
        context.startActivity(intent);
        return true;
    }
}
