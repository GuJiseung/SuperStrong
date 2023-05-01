LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_MODULE := helloNdk
FILES := find_su.c cal1inte.c cal2inte.c
LOCAL_SRC_FILES := $(FILES)
LOCAL_LDLIBS := -llog
include $(BUILD_SHARED_LIBRARY)