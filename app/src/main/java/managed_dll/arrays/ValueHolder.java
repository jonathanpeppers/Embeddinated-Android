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

public class ValueHolder {
    public com.sun.jna.Pointer __object;

    public ValueHolder(com.sun.jna.Pointer object) { this.__object = object; }

    public ValueHolder(int intValue) {
        __object = managed_dll.Native_managed_dll.INSTANCE.Arrays_ValueHolder_new(intValue);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public int getIntValue() {
        int __ret = managed_dll.Native_managed_dll.INSTANCE.Arrays_ValueHolder_get_IntValue(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }
}
