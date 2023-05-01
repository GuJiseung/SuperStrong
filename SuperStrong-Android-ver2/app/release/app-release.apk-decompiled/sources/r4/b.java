package r4;

import java.io.Serializable;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class b implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    public final Pattern f5971b;

    public b() {
        Pattern compile = Pattern.compile("[\\x00-\\x20]*[+-]?(NaN|Infinity|((((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)([eE][+-]?(\\p{Digit}+))?)|(\\.((\\p{Digit}+))([eE][+-]?(\\p{Digit}+))?)|(((0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+)))[pP][+-]?(\\p{Digit}+)))[fFdD]?))[\\x00-\\x20]*");
        l4.f.e(compile, "compile(pattern)");
        this.f5971b = compile;
    }

    public final String toString() {
        String pattern = this.f5971b.toString();
        l4.f.e(pattern, "nativePattern.toString()");
        return pattern;
    }
}
