// find_su.c
// Created by user on 2023-04-04.
//
#include <com_example_test_MainActivity.h>
#include <jni.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>

// 슈퍼유저 권한을 얻었는 지 확인하는 코드

JNIEXPORT void JNICALL
Java_com_superstrong_android_mmaaaq_fsfsfs(JNIEnv *env, jobject instance) {
    FILE *fp;
    char buf[512];

    // su, magisk, busybox 바이너리 찾아서 있으면 루팅되어있음.
    int is_su_exist = system("which su 2>&1") == 0;
    int is_magisk_exist = system("which magisk 2>&1") == 0;
    int is_busybox_exist = system("which busybox 2>&1") == 0;

    if(is_su_exist || is_magisk_exist || is_busybox_exist) {
        abort();
        // return (*env)->NewStringUTF(env, "root");
    }
    else { // 위의 바이너리를 찾을 수 없을 때
        // getuid 명령어를 사용해서 현재 사용자의 UID가 0인지 확인
        if(getuid() == 0) {
            abort();
            // return (*env)->NewStringUTF(env, "root");
        }
        // shell에서 su 명령어를 사용할 수 있는 지 확인
        else if (system("su") == 0) {
            abort();
            // return (*env)->NewStringUTF(env, "root");
        }
        fp = popen("id", "r");
        // adb shell 명령어를 통해 root 권한을 얻었는 지 확인
        while (fgets(buf, sizeof(buf), fp) != NULL) {
            if (strstr(buf, "uid=0(root) gid=0(root)")) {
                abort();
                // return (*env)->NewStringUTF(env, "root");
            }
        }
        pclose(fp);
    }
}
