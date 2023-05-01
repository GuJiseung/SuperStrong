//
// Created by user on 2023-04-13.
//
// "d262a55e8f8b671980470a4e488f9e12c81f9235ade2efb41a59"
#include "cal1inte.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char* Check(char *str[]){
    char Str[] = "a183abc8b";
    char buffer[100];  // 충분한 크기 동적 할당
    char *ptr = NULL;  // 초기화

    int num = strtol(str, &ptr, 8);  // ptr 주소를 전달

    sprintf(buffer, "%d", num);

    char* result = malloc(sizeof(Str) + sizeof(buffer) + 1);
    strcpy(result, Str);
    strcat(result, buffer);

    return result;
}