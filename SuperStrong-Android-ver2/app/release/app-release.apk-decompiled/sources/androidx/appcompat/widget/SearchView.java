package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.superstrong.android.R;
import f0.g0;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class SearchView extends t0 implements g.b {

    /* renamed from: h0  reason: collision with root package name */
    public static final o f595h0;
    public final Rect A;
    public final Rect B;
    public final int[] C;
    public final int[] D;
    public final ImageView E;
    public final Drawable F;
    public final int G;
    public final int H;
    public final Intent I;
    public final Intent J;
    public final CharSequence K;
    public View.OnFocusChangeListener L;
    public View.OnClickListener M;
    public boolean N;
    public boolean O;
    public k0.a P;
    public boolean Q;
    public CharSequence R;
    public boolean S;
    public boolean T;
    public int U;
    public boolean V;
    public CharSequence W;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f596a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f597b0;

    /* renamed from: c0  reason: collision with root package name */
    public SearchableInfo f598c0;

    /* renamed from: d0  reason: collision with root package name */
    public Bundle f599d0;

    /* renamed from: e0  reason: collision with root package name */
    public final b f600e0;

    /* renamed from: f0  reason: collision with root package name */
    public final c f601f0;

    /* renamed from: g0  reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f602g0;

    /* renamed from: q  reason: collision with root package name */
    public final SearchAutoComplete f603q;

    /* renamed from: r  reason: collision with root package name */
    public final View f604r;
    public final View s;

    /* renamed from: t  reason: collision with root package name */
    public final View f605t;
    public final ImageView u;

    /* renamed from: v  reason: collision with root package name */
    public final ImageView f606v;

    /* renamed from: w  reason: collision with root package name */
    public final ImageView f607w;

    /* renamed from: x  reason: collision with root package name */
    public final ImageView f608x;

    /* renamed from: y  reason: collision with root package name */
    public final View f609y;

    /* renamed from: z  reason: collision with root package name */
    public q f610z;

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends androidx.appcompat.widget.d {

        /* renamed from: f  reason: collision with root package name */
        public int f611f;

        /* renamed from: g  reason: collision with root package name */
        public SearchView f612g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f613h;

        /* renamed from: i  reason: collision with root package name */
        public final a f614i;

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f613h) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f613h = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, 0);
            this.f614i = new a();
            this.f611f = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i6 = configuration.screenWidthDp;
            int i7 = configuration.screenHeightDp;
            if (i6 < 960 || i7 < 720 || configuration.orientation != 2) {
                if (i6 < 600) {
                    return (i6 < 640 || i7 < 480) ? 160 : 192;
                }
                return 192;
            }
            return 256;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                k.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            o oVar = SearchView.f595h0;
            oVar.getClass();
            o.a();
            Method method = oVar.f628c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f611f <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.d, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f613h) {
                a aVar = this.f614i;
                removeCallbacks(aVar);
                post(aVar);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z5, int i6, Rect rect) {
            super.onFocusChanged(z5, i6, rect);
            SearchView searchView = this.f612g;
            searchView.w(searchView.O);
            searchView.post(searchView.f600e0);
            if (searchView.f603q.hasFocus()) {
                searchView.l();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i6, KeyEvent keyEvent) {
            if (i6 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f612g.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i6, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z5) {
            super.onWindowFocusChanged(z5);
            if (z5 && this.f612g.hasFocus() && getVisibility() == 0) {
                boolean z6 = true;
                this.f613h = true;
                Context context = getContext();
                o oVar = SearchView.f595h0;
                if (context.getResources().getConfiguration().orientation != 2) {
                    z6 = false;
                }
                if (z6) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z5) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            a aVar = this.f614i;
            if (!z5) {
                this.f613h = false;
                removeCallbacks(aVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (!inputMethodManager.isActive(this)) {
                this.f613h = true;
            } else {
                this.f613h = false;
                removeCallbacks(aVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f612g = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i6) {
            super.setThreshold(i6);
            this.f611f = i6;
        }
    }

    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.f603q.getText();
            searchView.W = text;
            boolean z5 = !TextUtils.isEmpty(text);
            searchView.v(z5);
            boolean z6 = !z5;
            int i9 = 8;
            if (searchView.V && !searchView.O && z6) {
                searchView.f606v.setVisibility(8);
                i9 = 0;
            }
            searchView.f608x.setVisibility(i9);
            searchView.r();
            searchView.u();
            charSequence.toString();
            searchView.getClass();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SearchView.this.s();
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            k0.a aVar = SearchView.this.P;
            if (aVar instanceof d1) {
                aVar.c(null);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z5) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.L;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z5);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
            SearchView searchView = SearchView.this;
            View view2 = searchView.f609y;
            if (view2.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.s.getPaddingLeft();
                Rect rect = new Rect();
                boolean a6 = s1.a(searchView);
                int dimensionPixelSize = searchView.N ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                SearchAutoComplete searchAutoComplete = searchView.f603q;
                searchAutoComplete.getDropDownBackground().getPadding(rect);
                searchAutoComplete.setDropDownHorizontalOffset(a6 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String flattenToShortString;
            SearchView searchView = SearchView.this;
            ImageView imageView = searchView.u;
            SearchAutoComplete searchAutoComplete = searchView.f603q;
            if (view == imageView) {
                searchView.w(false);
                searchAutoComplete.requestFocus();
                searchAutoComplete.setImeVisibility(true);
                View.OnClickListener onClickListener = searchView.M;
                if (onClickListener != null) {
                    onClickListener.onClick(searchView);
                }
            } else if (view == searchView.f607w) {
                searchView.m();
            } else if (view == searchView.f606v) {
                searchView.q();
            } else if (view == searchView.f608x) {
                SearchableInfo searchableInfo = searchView.f598c0;
                if (searchableInfo != null) {
                    try {
                        if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                            Intent intent = new Intent(searchView.I);
                            ComponentName searchActivity = searchableInfo.getSearchActivity();
                            if (searchActivity == null) {
                                flattenToShortString = null;
                            } else {
                                flattenToShortString = searchActivity.flattenToShortString();
                            }
                            intent.putExtra("calling_package", flattenToShortString);
                            searchView.getContext().startActivity(intent);
                        } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            searchView.getContext().startActivity(searchView.k(searchView.J, searchableInfo));
                        }
                    } catch (ActivityNotFoundException unused) {
                        Log.w("SearchView", "Could not find voice search activity");
                    }
                }
            } else if (view == searchAutoComplete) {
                searchView.l();
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements View.OnKeyListener {
        public g() {
        }

        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i6, KeyEvent keyEvent) {
            boolean z5;
            int length;
            SearchView searchView = SearchView.this;
            if (searchView.f598c0 == null) {
                return false;
            }
            SearchAutoComplete searchAutoComplete = searchView.f603q;
            if (searchAutoComplete.isPopupShowing() && searchAutoComplete.getListSelection() != -1) {
                if (searchView.f598c0 == null || searchView.P == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                    return false;
                }
                if (i6 != 66 && i6 != 84 && i6 != 61) {
                    if (i6 != 21 && i6 != 22) {
                        if (i6 != 19) {
                            return false;
                        }
                        searchAutoComplete.getListSelection();
                        return false;
                    }
                    if (i6 == 21) {
                        length = 0;
                    } else {
                        length = searchAutoComplete.length();
                    }
                    searchAutoComplete.setSelection(length);
                    searchAutoComplete.setListSelection(0);
                    searchAutoComplete.clearListSelection();
                    searchAutoComplete.a();
                } else {
                    searchView.n(searchAutoComplete.getListSelection());
                }
                return true;
            }
            if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i6 != 66) {
                return false;
            }
            view.cancelLongPress();
            searchView.getContext().startActivity(searchView.j("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i6, KeyEvent keyEvent) {
            SearchView.this.q();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i6, long j5) {
            SearchView.this.n(i6);
        }
    }

    /* loaded from: classes.dex */
    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i6, long j5) {
            SearchView.this.o(i6);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: classes.dex */
    public static class k {
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        public static void b(SearchAutoComplete searchAutoComplete, int i6) {
            searchAutoComplete.setInputMethodMode(i6);
        }
    }

    /* loaded from: classes.dex */
    public interface l {
    }

    /* loaded from: classes.dex */
    public interface m {
    }

    /* loaded from: classes.dex */
    public interface n {
    }

    /* loaded from: classes.dex */
    public static class o {

        /* renamed from: a  reason: collision with root package name */
        public final Method f626a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f627b;

        /* renamed from: c  reason: collision with root package name */
        public final Method f628c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public o() {
            this.f626a = null;
            this.f627b = null;
            this.f628c = null;
            a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f626a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f627b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f628c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    /* loaded from: classes.dex */
    public static class p extends l0.a {
        public static final Parcelable.Creator<p> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        public boolean f629d;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<p> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new p(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new p[i6];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }
        }

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f629d = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public p(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f629d + "}";
        }

        @Override // l0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeParcelable(this.f5073b, i6);
            parcel.writeValue(Boolean.valueOf(this.f629d));
        }
    }

    /* loaded from: classes.dex */
    public static class q extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final View f630a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f631b;

        /* renamed from: c  reason: collision with root package name */
        public final Rect f632c;

        /* renamed from: d  reason: collision with root package name */
        public final Rect f633d;

        /* renamed from: e  reason: collision with root package name */
        public final int f634e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f635f;

        public q(Rect rect, Rect rect2, SearchAutoComplete searchAutoComplete) {
            super(rect, searchAutoComplete);
            int scaledTouchSlop = ViewConfiguration.get(searchAutoComplete.getContext()).getScaledTouchSlop();
            this.f634e = scaledTouchSlop;
            Rect rect3 = new Rect();
            this.f631b = rect3;
            Rect rect4 = new Rect();
            this.f633d = rect4;
            Rect rect5 = new Rect();
            this.f632c = rect5;
            rect3.set(rect);
            rect4.set(rect);
            int i6 = -scaledTouchSlop;
            rect4.inset(i6, i6);
            rect5.set(rect2);
            this.f630a = searchAutoComplete;
        }

        @Override // android.view.TouchDelegate
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z5;
            float f6;
            int i6;
            boolean z6;
            int x5 = (int) motionEvent.getX();
            int y5 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z7 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z6 = this.f635f;
                    if (z6 && !this.f633d.contains(x5, y5)) {
                        z7 = z6;
                        z5 = false;
                    }
                } else {
                    if (action == 3) {
                        z6 = this.f635f;
                        this.f635f = false;
                    }
                    z5 = true;
                    z7 = false;
                }
                z7 = z6;
                z5 = true;
            } else {
                if (this.f631b.contains(x5, y5)) {
                    this.f635f = true;
                    z5 = true;
                }
                z5 = true;
                z7 = false;
            }
            if (z7) {
                Rect rect = this.f632c;
                View view = this.f630a;
                if (!z5 || rect.contains(x5, y5)) {
                    f6 = x5 - rect.left;
                    i6 = y5 - rect.top;
                } else {
                    f6 = view.getWidth() / 2;
                    i6 = view.getHeight() / 2;
                }
                motionEvent.setLocation(f6, i6);
                return view.dispatchTouchEvent(motionEvent);
            }
            return false;
        }
    }

    static {
        f595h0 = Build.VERSION.SDK_INT < 29 ? new o() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.A = new Rect();
        this.B = new Rect();
        this.C = new int[2];
        this.D = new int[2];
        this.f600e0 = new b();
        this.f601f0 = new c();
        this.f602g0 = new WeakHashMap<>();
        f fVar = new f();
        g gVar = new g();
        h hVar = new h();
        i iVar = new i();
        j jVar = new j();
        a aVar = new a();
        int[] iArr = c.b.f2687v;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i6, 0);
        j1 j1Var = new j1(context, obtainStyledAttributes);
        f0.g0.k(this, context, iArr, attributeSet, obtainStyledAttributes, i6);
        LayoutInflater.from(context).inflate(j1Var.i(17, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f603q = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f604r = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.s = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f605t = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.u = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f606v = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f607w = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f608x = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.E = imageView5;
        g0.d.q(findViewById, j1Var.e(18));
        g0.d.q(findViewById2, j1Var.e(23));
        imageView.setImageDrawable(j1Var.e(21));
        imageView2.setImageDrawable(j1Var.e(13));
        imageView3.setImageDrawable(j1Var.e(10));
        imageView4.setImageDrawable(j1Var.e(26));
        imageView5.setImageDrawable(j1Var.e(21));
        this.F = j1Var.e(20);
        o1.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.G = j1Var.i(24, R.layout.abc_search_dropdown_item_icons_2line);
        this.H = j1Var.i(11, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(aVar);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(gVar);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(j1Var.a(16, true));
        int d6 = j1Var.d(2, -1);
        if (d6 != -1) {
            setMaxWidth(d6);
        }
        this.K = j1Var.k(12);
        this.R = j1Var.k(19);
        int h6 = j1Var.h(6, -1);
        if (h6 != -1) {
            setImeOptions(h6);
        }
        int h7 = j1Var.h(5, -1);
        if (h7 != -1) {
            setInputType(h7);
        }
        setFocusable(j1Var.a(1, true));
        j1Var.n();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.I = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.J = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f609y = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        w(this.N);
        t();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f603q;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.T = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f603q;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.T = false;
    }

    public int getImeOptions() {
        return this.f603q.getImeOptions();
    }

    public int getInputType() {
        return this.f603q.getInputType();
    }

    public int getMaxWidth() {
        return this.U;
    }

    public CharSequence getQuery() {
        return this.f603q.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.R;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f598c0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.K : getContext().getText(this.f598c0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.H;
    }

    public int getSuggestionRowLayout() {
        return this.G;
    }

    public k0.a getSuggestionsAdapter() {
        return this.P;
    }

    public final Intent j(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.W);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f599d0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f598c0.getSearchActivity());
        return intent;
    }

    public final Intent k(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f599d0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void l() {
        int i6 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f603q;
        if (i6 >= 29) {
            k.a(searchAutoComplete);
            return;
        }
        o oVar = f595h0;
        oVar.getClass();
        o.a();
        Method method = oVar.f626a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        oVar.getClass();
        o.a();
        Method method2 = oVar.f627b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public final void m() {
        SearchAutoComplete searchAutoComplete = this.f603q;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.N) {
            clearFocus();
            w(true);
        }
    }

    public final void n(int i6) {
        int i7;
        Uri parse;
        String i8;
        Cursor cursor = this.P.f4728d;
        if (cursor != null && cursor.moveToPosition(i6)) {
            Intent intent = null;
            try {
                int i9 = d1.f742y;
                String i10 = d1.i(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (i10 == null) {
                    i10 = this.f598c0.getSuggestIntentAction();
                }
                if (i10 == null) {
                    i10 = "android.intent.action.SEARCH";
                }
                String i11 = d1.i(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (i11 == null) {
                    i11 = this.f598c0.getSuggestIntentData();
                }
                if (i11 != null && (i8 = d1.i(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    i11 = i11 + "/" + Uri.encode(i8);
                }
                if (i11 == null) {
                    parse = null;
                } else {
                    parse = Uri.parse(i11);
                }
                intent = j(i10, parse, d1.i(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), d1.i(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e6) {
                try {
                    i7 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i7 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i7 + " returned exception.", e6);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e7) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e7);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f603q;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void o(int i6) {
        String d6;
        Editable text = this.f603q.getText();
        Cursor cursor = this.P.f4728d;
        if (cursor != null) {
            if (cursor.moveToPosition(i6) && (d6 = this.P.d(cursor)) != null) {
                setQuery(d6);
            } else {
                setQuery(text);
            }
        }
    }

    @Override // g.b
    public final void onActionViewCollapsed() {
        SearchAutoComplete searchAutoComplete = this.f603q;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.W = "";
        clearFocus();
        w(true);
        searchAutoComplete.setImeOptions(this.f597b0);
        this.f596a0 = false;
    }

    @Override // g.b
    public final void onActionViewExpanded() {
        if (this.f596a0) {
            return;
        }
        this.f596a0 = true;
        SearchAutoComplete searchAutoComplete = this.f603q;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f597b0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f600e0);
        post(this.f601f0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.t0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        super.onLayout(z5, i6, i7, i8, i9);
        if (z5) {
            SearchAutoComplete searchAutoComplete = this.f603q;
            int[] iArr = this.C;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.D;
            getLocationInWindow(iArr2);
            int i10 = iArr[1] - iArr2[1];
            int i11 = iArr[0] - iArr2[0];
            Rect rect = this.A;
            rect.set(i11, i10, searchAutoComplete.getWidth() + i11, searchAutoComplete.getHeight() + i10);
            int i12 = rect.left;
            int i13 = rect.right;
            int i14 = i9 - i7;
            Rect rect2 = this.B;
            rect2.set(i12, 0, i13, i14);
            q qVar = this.f610z;
            if (qVar == null) {
                q qVar2 = new q(rect2, rect, searchAutoComplete);
                this.f610z = qVar2;
                setTouchDelegate(qVar2);
                return;
            }
            qVar.f631b.set(rect2);
            Rect rect3 = qVar.f633d;
            rect3.set(rect2);
            int i15 = -qVar.f634e;
            rect3.inset(i15, i15);
            qVar.f632c.set(rect);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (r0 <= 0) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    @Override // androidx.appcompat.widget.t0, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.O
            if (r0 == 0) goto L8
            super.onMeasure(r4, r5)
            return
        L8:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L2a
            if (r0 == 0) goto L20
            if (r0 == r2) goto L1b
            goto L37
        L1b:
            int r0 = r3.U
            if (r0 <= 0) goto L37
            goto L2e
        L20:
            int r4 = r3.U
            if (r4 <= 0) goto L25
            goto L37
        L25:
            int r4 = r3.getPreferredWidth()
            goto L37
        L2a:
            int r0 = r3.U
            if (r0 <= 0) goto L2f
        L2e:
            goto L33
        L2f:
            int r0 = r3.getPreferredWidth()
        L33:
            int r4 = java.lang.Math.min(r0, r4)
        L37:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L49
            if (r0 == 0) goto L44
            goto L51
        L44:
            int r5 = r3.getPreferredHeight()
            goto L51
        L49:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L51:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.f5073b);
        w(pVar.f629d);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.f629d = this.O;
        return pVar;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z5) {
        super.onWindowFocusChanged(z5);
        post(this.f600e0);
    }

    public final void p(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void q() {
        SearchAutoComplete searchAutoComplete = this.f603q;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f598c0 != null) {
                getContext().startActivity(j("android.intent.action.SEARCH", null, null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public final void r() {
        boolean z5 = true;
        boolean z6 = !TextUtils.isEmpty(this.f603q.getText());
        if (!z6 && (!this.N || this.f596a0)) {
            z5 = false;
        }
        int i6 = z5 ? 0 : 8;
        ImageView imageView = this.f607w;
        imageView.setVisibility(i6);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(z6 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i6, Rect rect) {
        if (this.T || !isFocusable()) {
            return false;
        }
        if (!this.O) {
            boolean requestFocus = this.f603q.requestFocus(i6, rect);
            if (requestFocus) {
                w(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i6, rect);
    }

    public final void s() {
        int[] iArr = this.f603q.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.s.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f605t.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public void setAppSearchData(Bundle bundle) {
        this.f599d0 = bundle;
    }

    public void setIconified(boolean z5) {
        if (z5) {
            m();
            return;
        }
        w(false);
        SearchAutoComplete searchAutoComplete = this.f603q;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.M;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z5) {
        if (this.N == z5) {
            return;
        }
        this.N = z5;
        w(z5);
        t();
    }

    public void setImeOptions(int i6) {
        this.f603q.setImeOptions(i6);
    }

    public void setInputType(int i6) {
        this.f603q.setInputType(i6);
    }

    public void setMaxWidth(int i6) {
        this.U = i6;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.L = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.M = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.R = charSequence;
        t();
    }

    public void setQueryRefinementEnabled(boolean z5) {
        int i6;
        this.S = z5;
        k0.a aVar = this.P;
        if (aVar instanceof d1) {
            d1 d1Var = (d1) aVar;
            if (z5) {
                i6 = 2;
            } else {
                i6 = 1;
            }
            d1Var.f748q = i6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0095, code lost:
        if (getContext().getPackageManager().resolveActivity(r3, 65536) != null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSearchableInfo(android.app.SearchableInfo r8) {
        /*
            r7 = this;
            r7.f598c0 = r8
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r7.f603q
            r1 = 1
            r2 = 65536(0x10000, float:9.18355E-41)
            r3 = 0
            if (r8 == 0) goto L68
            int r8 = r8.getSuggestThreshold()
            r0.setThreshold(r8)
            android.app.SearchableInfo r8 = r7.f598c0
            int r8 = r8.getImeOptions()
            r0.setImeOptions(r8)
            android.app.SearchableInfo r8 = r7.f598c0
            int r8 = r8.getInputType()
            r4 = r8 & 15
            if (r4 != r1) goto L34
            r4 = -65537(0xfffffffffffeffff, float:NaN)
            r8 = r8 & r4
            android.app.SearchableInfo r4 = r7.f598c0
            java.lang.String r4 = r4.getSuggestAuthority()
            if (r4 == 0) goto L34
            r8 = r8 | r2
            r4 = 524288(0x80000, float:7.34684E-40)
            r8 = r8 | r4
        L34:
            r0.setInputType(r8)
            k0.a r8 = r7.P
            if (r8 == 0) goto L3e
            r8.c(r3)
        L3e:
            android.app.SearchableInfo r8 = r7.f598c0
            java.lang.String r8 = r8.getSuggestAuthority()
            if (r8 == 0) goto L65
            androidx.appcompat.widget.d1 r8 = new androidx.appcompat.widget.d1
            android.content.Context r4 = r7.getContext()
            android.app.SearchableInfo r5 = r7.f598c0
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r6 = r7.f602g0
            r8.<init>(r4, r7, r5, r6)
            r7.P = r8
            r0.setAdapter(r8)
            k0.a r8 = r7.P
            androidx.appcompat.widget.d1 r8 = (androidx.appcompat.widget.d1) r8
            boolean r4 = r7.S
            if (r4 == 0) goto L62
            r4 = 2
            goto L63
        L62:
            r4 = r1
        L63:
            r8.f748q = r4
        L65:
            r7.t()
        L68:
            android.app.SearchableInfo r8 = r7.f598c0
            if (r8 == 0) goto L98
            boolean r8 = r8.getVoiceSearchEnabled()
            if (r8 == 0) goto L98
            android.app.SearchableInfo r8 = r7.f598c0
            boolean r8 = r8.getVoiceSearchLaunchWebSearch()
            if (r8 == 0) goto L7d
            android.content.Intent r3 = r7.I
            goto L87
        L7d:
            android.app.SearchableInfo r8 = r7.f598c0
            boolean r8 = r8.getVoiceSearchLaunchRecognizer()
            if (r8 == 0) goto L87
            android.content.Intent r3 = r7.J
        L87:
            if (r3 == 0) goto L98
            android.content.Context r8 = r7.getContext()
            android.content.pm.PackageManager r8 = r8.getPackageManager()
            android.content.pm.ResolveInfo r8 = r8.resolveActivity(r3, r2)
            if (r8 == 0) goto L98
            goto L99
        L98:
            r1 = 0
        L99:
            r7.V = r1
            if (r1 == 0) goto La2
            java.lang.String r8 = "nm"
            r0.setPrivateImeOptions(r8)
        La2:
            boolean r8 = r7.O
            r7.w(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z5) {
        this.Q = z5;
        w(this.O);
    }

    public void setSuggestionsAdapter(k0.a aVar) {
        this.P = aVar;
        this.f603q.setAdapter(aVar);
    }

    public final void t() {
        Drawable drawable;
        SpannableStringBuilder queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z5 = this.N;
        SearchAutoComplete searchAutoComplete = this.f603q;
        if (z5 && (drawable = this.F) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void u() {
        boolean z5;
        int i6 = 0;
        if ((this.Q || this.V) && !this.O) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5 || (this.f606v.getVisibility() != 0 && this.f608x.getVisibility() != 0)) {
            i6 = 8;
        }
        this.f605t.setVisibility(i6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x001e, code lost:
        if (r2.V == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.Q
            if (r0 == 0) goto L21
            r1 = 0
            if (r0 != 0) goto Lb
            boolean r0 = r2.V
            if (r0 == 0) goto L11
        Lb:
            boolean r0 = r2.O
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = r1
        L12:
            if (r0 == 0) goto L21
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L21
            if (r3 != 0) goto L23
            boolean r3 = r2.V
            if (r3 != 0) goto L21
            goto L23
        L21:
            r1 = 8
        L23:
            android.widget.ImageView r3 = r2.f606v
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.v(boolean):void");
    }

    public final void w(boolean z5) {
        int i6;
        int i7;
        int i8;
        this.O = z5;
        int i9 = 0;
        if (z5) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        boolean z6 = !TextUtils.isEmpty(this.f603q.getText());
        this.u.setVisibility(i6);
        v(z6);
        if (z5) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        this.f604r.setVisibility(i7);
        ImageView imageView = this.E;
        if (imageView.getDrawable() != null && !this.N) {
            i8 = 0;
        } else {
            i8 = 8;
        }
        imageView.setVisibility(i8);
        r();
        boolean z7 = !z6;
        if (this.V && !this.O && z7) {
            this.f606v.setVisibility(8);
        } else {
            i9 = 8;
        }
        this.f608x.setVisibility(i9);
        u();
    }
}
