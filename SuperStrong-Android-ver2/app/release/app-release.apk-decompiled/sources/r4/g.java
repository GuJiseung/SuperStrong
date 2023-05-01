package r4;
/* loaded from: classes.dex */
public class g extends f {
    public static String n(String str) {
        l4.f.f(str, "<this>");
        l4.f.f(str, "missingDelimiterValue");
        int lastIndexOf = str.lastIndexOf(46, str.length() - 1);
        if (lastIndexOf != -1) {
            String substring = str.substring(lastIndexOf + 1, str.length());
            l4.f.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }
}
