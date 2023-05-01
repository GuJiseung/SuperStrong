package com.superstrong.android;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class uuuu {
    private Context mContext;
    int iq2 = 100;
    public uuuu(Context context){
        mContext = context;
    }

    public void bu(){

        if(Settings.Global.getInt(mContext.getContentResolver(), Settings.Global.ADB_ENABLED, 0) == 1){
            // 디바이스의 일반적인 정보 같은 것들을 저장하는 데이터베이스
            // 로직은 Settings.Secure 과 비슷하게 돌아감
            try {
                throw new RuntimeException("USB 디버깅 발견. 프로그램을 강제로 종료합니다.");
            } catch (RuntimeException e) {
                int oil = iq2 * (-1) + 100;
                int result = iq2 / oil;
            }
        }

        if(Settings.Secure.getInt(mContext.getContentResolver(), Settings.Global.ADB_ENABLED, 0) == 1){
            // 디바이스의 개인 정보 같은 것들을 저장하는 데이터베이스
            // Settings.Secure 라는 Class의 ADB_ENABLED 상수를 이용
            // 0이면 Not debugged, 1이면 Debugging 되어 있음.
            // getInt 로 위의 값을 가져와서 판단할 수 있음.
            try {
                throw new RuntimeException("USB 디버깅 발견. 프로그램을 강제로 종료합니다.");
            } catch (RuntimeException e) {
                int oil = iq2 * (-1) + 100;
                int result = iq2 / oil;
            }
        }

        if(android.os.Debug.isDebuggerConnected()){
            // 위의 isDebuggerConnected 는 디버깅 중에만 true 를 반환함.
            // 따라서, 반환값에 따라 USB 디버깅 유무 확인 가능
            try {
                throw new RuntimeException("USB 디버깅 발견. 프로그램을 강제로 종료합니다.");
            } catch (RuntimeException e) {
                int oil = iq2 * (-1) + 100;
                int result = iq2 / oil;
            }
        }

    }

    public static String ef(){
        int iq3 = 100;
        @SuppressLint("DefaultLocale") String cmd = String.format("cat /proc/net/unix %d", android.os.Process.myPid());
        try{
            Process process = Runtime.getRuntime().exec(cmd);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while((line = reader.readLine()) != null){
                if (line.contains("frida")){
                    try {
                        throw new RuntimeException("프리다 발견. 프로그램을 강제로 종료합니다.");
                    } catch (RuntimeException e) {
                        return "Frida";
                    }
                }
            }
            reader.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }

}

