/**
 * ----------------------------------------------------------------------------
 * <auto-generated>
 * This is autogenerated code by Embeddinator-4000.
 * Do not edit this file or all your changes will be lost after re-generation.
 * </auto-generated>
 * ----------------------------------------------------------------------------
 */
package managed_dll.methods;

import mono.embeddinator.*;
import com.sun.jna.*;

public final class SomeExtensions {
    public com.sun.jna.Pointer __object;

    public SomeExtensions(com.sun.jna.Pointer object) { this.__object = object; }

    public static int countNonNull(managed_dll.methods.Collection collection) {
        int __ret = managed_dll.Native_managed_dll.INSTANCE.Methods_SomeExtensions_CountNonNull(collection == null ? null : collection.__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public static int countNull(managed_dll.methods.Collection collection) {
        int __ret = managed_dll.Native_managed_dll.INSTANCE.Methods_SomeExtensions_CountNull(collection == null ? null : collection.__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public static boolean isEmptyButNotNull(String string) {
        byte __ret = managed_dll.Native_managed_dll.INSTANCE.Methods_SomeExtensions_IsEmptyButNotNull(string);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret != 0;
    }

    public static int increment(int value) {
        int __ret = managed_dll.Native_managed_dll.INSTANCE.Methods_SomeExtensions_Increment(value);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public static String notAnExtensionMethod() {
        String __ret = managed_dll.Native_managed_dll.INSTANCE.Methods_SomeExtensions_NotAnExtensionMethod();
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }
}
