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

public final class Type_Int32 {
    public com.sun.jna.Pointer __object;

    public Type_Int32(com.sun.jna.Pointer object) { this.__object = object; }

    public static int getMax() {
        int __ret = managed_dll.Native_managed_dll.INSTANCE.Type_Int32_get_Max();
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public static int getMin() {
        int __ret = managed_dll.Native_managed_dll.INSTANCE.Type_Int32_get_Min();
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }
}