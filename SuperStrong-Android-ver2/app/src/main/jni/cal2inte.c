#include "com_example_test_MainActivity.h"
#include <jni.h>
#include "cal1inte.h"
#include <stdio.h>
#include <stdlib.h>

JNIEXPORT jstring JNICALL Java_com_superstrong_android_ciiicu_chs(JNIEnv *env, jobject instance){
    char* str = "1141";
    char *check1 = Check(str);  // 반환값 포인터 변수로 저장
    jstring result = (*env)->NewStringUTF(env, check1); // C 문자열을 Java 문자열로 변환
    free(check1);  // 동적 할당된 메모리 해제
    return result;
}
