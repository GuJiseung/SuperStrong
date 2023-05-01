package com.superstrong.android;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ciiicu {
    private final mmaaaq mActivity;
    int iq4 = 100;
    String abcdefg = chs();
    String hijklmn = "d262a55e8f8b671980470a4e488f9e12c81f9235ade2efb41a59"; // 실행 한 번 해보고 다시 입력

    public ciiicu(mmaaaq activity) {
        mActivity = activity;
    }

    public void fqqevc(){
        String hash_str = checkIntegrity(mActivity);
        String FINAL = abcdefg + hijklmn;
        if (FINAL.equals(hash_str)) {
            Log.i("mmaaaq", "Machine code: " + FINAL);
            Log.d("hash: ", "Hash of machine code: " + hash_str);
        } else {
            Log.i("mmaaaq", "Mismatch code: " + hash_str + " and " + FINAL);
            try {
                throw new RuntimeException("리패키징 발견. 프로그램을 강제로 종료합니다.");
            } catch (RuntimeException e) {
                int oil = iq4 * (-1) + 100;
                int result = iq4 / oil;
            }
        }
    }

    private static String checkIntegrity(Context context) {
        String packageName = context.getPackageName();
        Signature[] signatures;
        try {
            signatures = context.getPackageManager().getPackageInfo(packageName, PackageManager.GET_SIGNATURES).signatures;
        } catch (PackageManager.NameNotFoundException e) {
            return "";
        }

        StringBuilder signatureString = new StringBuilder();
        for (Signature signature : signatures) {
            signatureString.append(signature.toCharsString());
        }

        int bin_str = 0;
        for (int i = 0; i < signatureString.length(); i++) {
            bin_str = (bin_str << 16) | signatureString.charAt(i);
        }

        int g = bin_str;

        String hash_str = getSHA256HexString(g);

        return hash_str;
    }

    private static String getSHA256HexString(int g) {
        String hexString = null;
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(Integer.toString(g).getBytes("UTF-8"));
            StringBuilder hexBuilder = new StringBuilder();
            for (byte b : hash) {
                hexBuilder.append(String.format("%02x", b));
            }
            hexString = hexBuilder.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return hexString;
    }

    public native String chs();
}
