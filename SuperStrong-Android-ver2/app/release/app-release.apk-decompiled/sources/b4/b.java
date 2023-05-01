package b4;

import android.content.SharedPreferences;
import android.util.Base64;
import java.nio.charset.Charset;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static String f2431a;

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f2432b;

    static {
        byte[] bytes = "0123456789012345".getBytes(r4.a.f5970a);
        l4.f.e(bytes, "this as java.lang.String).getBytes(charset)");
        f2432b = bytes;
    }

    public static String a(String str) {
        l4.f.f(str, "str");
        try {
            byte[] decode = Base64.decode(str, 0);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f2432b);
            String str2 = f2431a;
            if (str2 == null) {
                l4.f.k("secretKey");
                throw null;
            }
            Charset forName = Charset.forName("UTF-8");
            l4.f.e(forName, "forName(\"UTF-8\")");
            byte[] bytes = str2.getBytes(forName);
            l4.f.e(bytes, "this as java.lang.String).getBytes(charset)");
            SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            byte[] doFinal = cipher.doFinal(decode);
            l4.f.e(doFinal, "cipher.doFinal(textBytes)");
            Charset forName2 = Charset.forName("UTF-8");
            l4.f.e(forName2, "forName(\"UTF-8\")");
            return new String(doFinal, forName2);
        } catch (Exception e6) {
            e6.printStackTrace();
            return str;
        }
    }

    public static String b(String str) {
        try {
            Charset forName = Charset.forName("UTF-8");
            l4.f.e(forName, "forName(charsetName)");
            byte[] bytes = str.getBytes(forName);
            l4.f.e(bytes, "this as java.lang.String).getBytes(charset)");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f2432b);
            String str2 = f2431a;
            if (str2 == null) {
                l4.f.k("secretKey");
                throw null;
            }
            Charset forName2 = Charset.forName("UTF-8");
            l4.f.e(forName2, "forName(charsetName)");
            byte[] bytes2 = str2.getBytes(forName2);
            l4.f.e(bytes2, "this as java.lang.String).getBytes(charset)");
            SecretKeySpec secretKeySpec = new SecretKeySpec(bytes2, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            String encodeToString = Base64.encodeToString(cipher.doFinal(bytes), 0);
            l4.f.e(encodeToString, "encodeToString(cipher.do…xtBytes), Base64.DEFAULT)");
            return encodeToString;
        } catch (Exception e6) {
            e6.printStackTrace();
            return str;
        }
    }

    public static void c(androidx.appcompat.app.c cVar) {
        SharedPreferences sharedPreferences = cVar.getSharedPreferences("strong", 0);
        l4.f.e(sharedPreferences, "context.getSharedPrefere…g\", Context.MODE_PRIVATE)");
        String string = sharedPreferences.getString("key", "");
        f2431a = string != null ? string : "";
    }
}
