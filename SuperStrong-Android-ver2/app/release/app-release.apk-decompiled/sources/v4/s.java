package v4;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class s {

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f6478d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: e  reason: collision with root package name */
    public static final Pattern f6479e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a  reason: collision with root package name */
    public final String f6480a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6481b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final String f6482c;

    public s(String str, String str2, @Nullable String str3) {
        this.f6480a = str;
        this.f6481b = str2;
        this.f6482c = str3;
    }

    public static s a(String str) {
        Matcher matcher = f6478d.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
        }
        String group = matcher.group(1);
        Locale locale = Locale.US;
        String lowerCase = group.toLowerCase(locale);
        matcher.group(2).toLowerCase(locale);
        Matcher matcher2 = f6479e.matcher(str);
        String str2 = null;
        for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + str.substring(end) + "\" for: \"" + str + '\"');
            }
            String group2 = matcher2.group(1);
            if (group2 != null && group2.equalsIgnoreCase("charset")) {
                String group3 = matcher2.group(2);
                if (group3 == null) {
                    group3 = matcher2.group(3);
                } else if (group3.startsWith("'") && group3.endsWith("'") && group3.length() > 2) {
                    group3 = group3.substring(1, group3.length() - 1);
                }
                if (str2 != null && !group3.equalsIgnoreCase(str2)) {
                    throw new IllegalArgumentException("Multiple charsets defined: \"" + str2 + "\" and: \"" + group3 + "\" for: \"" + str + '\"');
                }
                str2 = group3;
            }
        }
        return new s(str, lowerCase, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof s) && ((s) obj).f6480a.equals(this.f6480a);
    }

    public final int hashCode() {
        return this.f6480a.hashCode();
    }

    public final String toString() {
        return this.f6480a;
    }
}
