#include <jni.h>
#include <string>

extern "C" {

JNIEXPORT jstring JNICALL
Java_abhi_library_compose_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

JNIEXPORT jstring JNICALL
Java_abhi_library_compose_MainActivity_anotherStringReturn(JNIEnv *env, jobject /* this */) {
    std::string helloString = "Hello from the android another method";
    return env->NewStringUTF(helloString.c_str());
}


}