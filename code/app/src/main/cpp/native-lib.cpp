#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_mx_ipn_exponivelsuperior_welcome_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
