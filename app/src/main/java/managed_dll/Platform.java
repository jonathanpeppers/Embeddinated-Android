/**
 * ----------------------------------------------------------------------------
 * <auto-generated>
 * This is autogenerated code by Embeddinator-4000.
 * Do not edit this file or all your changes will be lost after re-generation.
 * </auto-generated>
 * ----------------------------------------------------------------------------
 */
package managed_dll;

import mono.embeddinator.*;
import com.sun.jna.*;

public final class Platform {
    public com.sun.jna.Pointer __object;

    public Platform(com.sun.jna.Pointer object) { this.__object = object; }

    public static boolean getIsWindows() {
        byte __ret = managed_dll.Native_managed_dll.INSTANCE.Platform_get_IsWindows();
        mono.embeddinator.Runtime.checkExceptions();
        return __ret != 0;
    }

    public static int getExitCode() {
        int __ret = managed_dll.Native_managed_dll.INSTANCE.Platform_get_ExitCode();
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public static void setExitCode(int value) {
        managed_dll.Native_managed_dll.INSTANCE.Platform_set_ExitCode(value);
        mono.embeddinator.Runtime.checkExceptions();
    }
}
