/**
 * ----------------------------------------------------------------------------
 * <auto-generated>
 * This is autogenerated code by Embeddinator-4000.
 * Do not edit this file or all your changes will be lost after re-generation.
 * </auto-generated>
 * ----------------------------------------------------------------------------
 */
package managed_dll.enums;

import mono.embeddinator.*;
import com.sun.jna.*;

public final class Enumer {
    public com.sun.jna.Pointer __object;

    public Enumer(com.sun.jna.Pointer object) { this.__object = object; }

    public static managed_dll.enums.ByteFlags test(managed_dll.enums.ByteEnum b, mono.embeddinator.Ref<managed_dll.enums.IntEnum> i, mono.embeddinator.Out<managed_dll.enums.ShortEnum> s) {
        UnsignedByte __b = b.getValue();
        if (i == null || i.get() == null)
            throw new NullRefParameterException("i");
        com.sun.jna.ptr.IntByReference __i = new com.sun.jna.ptr.IntByReference(i.get().getValue());
        if (s == null)
            throw new NullRefParameterException("s");
        com.sun.jna.ptr.ShortByReference __s = new com.sun.jna.ptr.ShortByReference(s.get().getValue());
        int __ret = managed_dll.Native_managed_dll.INSTANCE.Enums_Enumer_Test(__b, __i, __s);
        mono.embeddinator.Runtime.checkExceptions();
        i.set(IntEnum.fromOrdinal(__i.getValue()));
        s.set(ShortEnum.fromOrdinal(__s.getValue()));
        return ByteFlags.fromOrdinal(__ret);
    }
}
