package g;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;
/* loaded from: classes.dex */
public class h implements Window.Callback {

    /* renamed from: b  reason: collision with root package name */
    public final Window.Callback f4089b;

    /* loaded from: classes.dex */
    public static class a {
        public static boolean a(Window.Callback callback, SearchEvent searchEvent) {
            return callback.onSearchRequested(searchEvent);
        }

        public static ActionMode b(Window.Callback callback, ActionMode.Callback callback2, int i6) {
            return callback.onWindowStartingActionMode(callback2, i6);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i6) {
            callback.onProvideKeyboardShortcuts(list, menu, i6);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static void a(Window.Callback callback, boolean z5) {
            callback.onPointerCaptureChanged(z5);
        }
    }

    public h(Window.Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f4089b = callback;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f4089b.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f4089b.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f4089b.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f4089b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f4089b.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f4089b.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f4089b.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f4089b.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f4089b.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i6, Menu menu) {
        return this.f4089b.onCreatePanelMenu(i6, menu);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i6) {
        return this.f4089b.onCreatePanelView(i6);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f4089b.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i6, MenuItem menuItem) {
        return this.f4089b.onMenuItemSelected(i6, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i6, Menu menu) {
        return this.f4089b.onMenuOpened(i6, menu);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i6, Menu menu) {
        this.f4089b.onPanelClosed(i6, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z5) {
        c.a(this.f4089b, z5);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i6, View view, Menu menu) {
        return this.f4089b.onPreparePanel(i6, view, menu);
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i6) {
        b.a(this.f4089b, list, menu, i6);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f4089b.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return a.a(this.f4089b, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f4089b.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z5) {
        this.f4089b.onWindowFocusChanged(z5);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i6) {
        return a.b(this.f4089b, callback, i6);
    }
}
