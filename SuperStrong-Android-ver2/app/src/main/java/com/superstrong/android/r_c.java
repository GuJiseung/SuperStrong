package com.superstrong.android;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;

public class r_c extends mmaaaq {
    int iq0 = 100;
    int oil = iq0 * (-1) + 100;
    public void rc(Context context){

        int check = 0;
        String[] packages = new String[]{
                "com.noshufou.android.su",
                "com.noshufou.android.su.elite",
                "eu.chainfire.supersu",
                "com.koushikdutta.superuser",
                "com.thirdparty.superuser",
                "com.yellowes.su",
                "com.topjohnwu.magisk",
                "com.kingroot.kinguser",
                "com.kingo.root",
                "com.smedialink.oneclickroot",
                "com.zhiqupk.root.global",
                "com.alephzain.framaroot",
                "com.koushikdutta.rommanager",
                "com.koushikdutta.rommanager.license",
                "com.dimonvideo.luckypatcher",
                "com.chelpus.lackypatch",
                "com.ramdroid.appquarantine",
                "com.ramdroid.appquarantinepro",
                "com.android.vending.billing.InAppBillingService.COIN",
                "com.android.vending.billing.InAppBillingService.LUCK",
                "com.chelpus.luckypatcher",
                "com.blackmartalpha",
                "org.blackmart.market",
                "com.allinone.free",
                "com.repodroid.app",
                "org.creeplays.hack",
                "com.baseappfull.fwd",
                "com.zmapp",
                "com.dv.marketmod.installer",
                "org.mobilism.android",
                "com.android.wp.net.log",
                "com.android.camera.update",
                "cc.madkite.freedom",
                "com.solohsu.android.edxp.manager",
                "org.meowcat.edxposed.manager",
                "com.xmodgame",
                "com.cih.game_cih",
                "com.charles.lpoqasert",
                "catch_.me_.if_.you_.can_",
                "com.devadvance.rootcloak",
                "com.devadvance.rootcloakplus",
                "de.robv.android.xposed.installer",
                "com.saurik.substrate",
                "com.zachspong.temprootremovejb",
                "com.amphoras.hidemyroot",
                "com.amphoras.hidemyrootadfree",
                "com.formyhm.hiderootPremium",
                "com.formyhm.hideroot"
        }; // 의심 패키지 배열

 //       Intent intent = new Intent(context, ErrorPage.class);

        PackageManager pm = context.getPackageManager();
        for (String packageName : packages) {
            try { // 패키지명 검사 부분
                ApplicationInfo appInfo = pm.getApplicationInfo(packageName, PackageManager.GET_META_DATA);
                Log.d("PackageInfo", "Package <" + packageName + "> is installed");
                Log.d("ApplicationInfo", "Package Name: " + appInfo.packageName);
                Log.d("ApplicationInfo", "Source Dir: " + appInfo.sourceDir);
                Log.d("ApplicationInfo", "Data Dir: " + appInfo.dataDir);

                // check += 1;
                try {
                    throw new RuntimeException("프로그램을 강제로 종료합니다.");
                } catch (RuntimeException e) {
                    int result = iq0 / oil;
                }

            } catch (PackageManager.NameNotFoundException e) {
                //check = 0;
            }
        }

        String buildTags = android.os.Build.TAGS;
        if (buildTags != null && buildTags.contains("test-keys")) {
            try {
                throw new RuntimeException("프로그램을 강제로 종료합니다.");
            } catch (RuntimeException e) {
                int result = iq0 / oil;
                // System.exit(1);
            }
            // check += 1;
        } else {
            // check = 0;
        }
    }

}
