/**
 * ----------------------------------------------------------------------------
 * <auto-generated>
 * This is autogenerated code by Embeddinator-4000.
 * Do not edit this file or all your changes will be lost after re-generation.
 * </auto-generated>
 * ----------------------------------------------------------------------------
 */
package managed_dll.arrays;

import mono.embeddinator.*;
import com.sun.jna.*;

public final class ArrayTypes {
    public com.sun.jna.Pointer __object;

    public ArrayTypes(com.sun.jna.Pointer object) { this.__object = object; }

    public static int sumByteArray(UnsignedByte[] array) {
        int __ret = managed_dll.Native_managed_dll.INSTANCE.Arrays_ArrayTypes_SumByteArray(null);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public static int[] returnsIntArray() {
        int[] __ret = managed_dll.Native_managed_dll.INSTANCE.Arrays_ArrayTypes_ReturnsIntArray();
        mono.embeddinator.Runtime.checkExceptions();
        return null;
    }

    public static String[] returnsStringArray() {
        String[] __ret = managed_dll.Native_managed_dll.INSTANCE.Arrays_ArrayTypes_ReturnsStringArray();
        mono.embeddinator.Runtime.checkExceptions();
        return null;
    }
}
