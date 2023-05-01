package com.superstrong.android;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.superstrong.android.view.lallaaaalllaa;



public class mmaaaq extends AppCompatActivity {
    static {
        System.loadLibrary("helloNdk");
    }
    String pfodspfvsv = "Frida";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        uuuu uuuu = new uuuu(mmaaaq.this);

        ciiicu qqwe = new ciiicu(mmaaaq.this);

//        eeieiie(); // 에뮬레이터 확인
//        r_c rc = new r_c();
//        fsfsfs();
//        rc.rc(this);
//        uuuu.bu();
//        String aadc = uuuu.ef();
//        qqwe.fqqevc();
        startActivity(new Intent(this, lallaaaalllaa.class));


//        if(aadc.equals(pfodspfvsv)){
//            int zero_div = 100;
//            int oil = zero_div * (-1) + 100;
//            int result = zero_div / oil;
//        }
    }

    private void eeieiie(){
        String architecture = System.getProperty("os.arch");
        boolean qweqwwe = Build.FINGERPRINT.startsWith("generic")
                || architecture.contains("x86")
                || architecture.contains("i686")
                || Build.MODEL.contains("google_sdk")
                || Build.MODEL.toLowerCase().contains("droid4x")
                || Build.MODEL.contains("Emulator")
                || Build.MODEL.contains("Android SDK built for x86")
                || Build.MANUFACTURER.contains("Genymotion")
                || Build.HARDWARE.equals("goldfish")
                || Build.HARDWARE.equals("vbox86")
                || Build.HARDWARE.toLowerCase().contains("nox")
                || Build.PRODUCT.equals("sdk")
                || Build.PRODUCT.equals("google_sdk")
                || Build.PRODUCT.equals("sdk_x86")
                || Build.PRODUCT.equals("vbox86p")
                || Build.PRODUCT.toLowerCase().contains("windroye")
                || Build.PRODUCT.toLowerCase().contains("nox")
                || Build.BRAND.toLowerCase().contains("windroy")
                || Build.BOARD.toLowerCase().contains("nox")
                || Build.BOOTLOADER.toLowerCase().contains("nox")
                || Build.SERIAL.toLowerCase().contains("nox")
                || Build.MANUFACTURER.contains("Genymotion");

        if(qweqwwe){
            int zero_div = 100;
            try {
                throw new RuntimeException("에뮬레이터 발견. 프로그램을 강제로 종료합니다.");
            } catch (RuntimeException e) {
                int oil = zero_div * (-1) + 100;
                int result = zero_div / oil;
//                System.exit(1);
            }
        }
    }
    /* -------------------------------------------------------------- */
    // 후킹이 어디에 붙어?
    // compile -> bin -> MEM BUF ( ~~bin~~ )<-hook(isEmulator <- false 집어 넣어라) 오 isEmulator 여기 있구나! 니 false 되라! )
    // -> isEmulator 오 나는 false 구나!
    public native void fsfsfs();

}


