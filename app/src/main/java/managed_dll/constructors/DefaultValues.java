/**
 * ----------------------------------------------------------------------------
 * <auto-generated>
 * This is autogenerated code by Embeddinator-4000.
 * Do not edit this file or all your changes will be lost after re-generation.
 * </auto-generated>
 * ----------------------------------------------------------------------------
 */
package managed_dll.constructors;

import mono.embeddinator.*;
import com.sun.jna.*;

public class DefaultValues {
    public com.sun.jna.Pointer __object;

    public DefaultValues(com.sun.jna.Pointer object) { this.__object = object; }

    public DefaultValues(UnsignedByte b, short s, int i, long l) {
        __object = managed_dll.Native_managed_dll.INSTANCE.Constructors_DefaultValues_new(b, s, i, l);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public DefaultValues(int nonDefault, String s, float f, double d, managed_dll.enums.ByteEnum e) {
        UnsignedByte __e = e.getValue();
        __object = managed_dll.Native_managed_dll.INSTANCE.Constructors_DefaultValues_new_1(nonDefault, s, f, d, __e);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public boolean getIsDefault() {
        byte __ret = managed_dll.Native_managed_dll.INSTANCE.Constructors_DefaultValues_get_IsDefault(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret != 0;
    }
}
