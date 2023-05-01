package b4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.superstrong.android.R;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class f extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    public final JSONArray f2444b;

    public f(Context context, JSONArray jSONArray) {
        l4.f.f(jSONArray, "items");
        this.f2444b = jSONArray;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f2444b.length();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i6) {
        JSONObject jSONObject = this.f2444b.getJSONObject(i6);
        l4.f.e(jSONObject, "items.getJSONObject(position)");
        return jSONObject;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i6) {
        return i6;
    }

    @Override // android.widget.Adapter
    public final View getView(int i6, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(viewGroup != null ? viewGroup.getContext() : null).inflate(R.layout.item_log, viewGroup, false);
        }
        JSONObject jSONObject = this.f2444b.getJSONObject(i6);
        TextView textView = view != null ? (TextView) view.findViewById(R.id.send_or_rec) : null;
        l4.f.c(textView);
        textView.setText(jSONObject.getString("status"));
        TextView textView2 = view != null ? (TextView) view.findViewById(R.id.coin_name) : null;
        l4.f.c(textView2);
        textView2.setText(jSONObject.getString("coin_name"));
        TextView textView3 = view != null ? (TextView) view.findViewById(R.id.coin_quantity) : null;
        l4.f.c(textView3);
        textView3.setText(String.valueOf(jSONObject.getDouble("amount")));
        TextView textView4 = view != null ? (TextView) view.findViewById(R.id.log_time) : null;
        l4.f.c(textView4);
        textView4.setText(jSONObject.getString("date"));
        TextView textView5 = view != null ? (TextView) view.findViewById(R.id.log_address) : null;
        l4.f.c(textView5);
        textView5.setText(jSONObject.getString("interaction_address"));
        return view;
    }
}
