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

public class Parameters {
    public com.sun.jna.Pointer __object;

    public Parameters(com.sun.jna.Pointer object) { this.__object = object; }

    public Parameters() {
        __object = managed_dll.Native_managed_dll.INSTANCE.Methods_Parameters_new();
        mono.embeddinator.Runtime.checkExceptions();
    }

    public static String concat(String first, String second) {
        String __ret = managed_dll.Native_managed_dll.INSTANCE.Methods_Parameters_Concat(first, second);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public static void ref(mono.embeddinator.Ref<Boolean> _boolean, mono.embeddinator.Ref<String> string) {
        if (_boolean == null || _boolean.get() == null)
            throw new NullRefParameterException("_boolean");
        com.sun.jna.ptr.ByteByReference ___boolean = new com.sun.jna.ptr.ByteByReference(((byte) (_boolean.get() ? 1 : 0)));
        if (string == null)
            throw new NullRefParameterException("string");
        mono.embeddinator.GString __string = (string.get()) != null ? new mono.embeddinator.GString(string.get()) : new mono.embeddinator.GString();
        managed_dll.Native_managed_dll.INSTANCE.Methods_Parameters_Ref(___boolean, __string);
        mono.embeddinator.Runtime.checkExceptions();
        _boolean.set(___boolean.getValue() != 0);
        string.set(__string.getValue());
    }

    public static void out(String string, mono.embeddinator.Out<Integer> length, mono.embeddinator.Out<String> upper) {
        if (length == null)
            throw new NullRefParameterException("length");
        com.sun.jna.ptr.IntByReference __length = (length.get()) != null ? new com.sun.jna.ptr.IntByReference(length.get()) : new com.sun.jna.ptr.IntByReference();
        if (upper == null)
            throw new NullRefParameterException("upper");
        mono.embeddinator.GString __upper = (upper.get()) != null ? new mono.embeddinator.GString(upper.get()) : new mono.embeddinator.GString();
        managed_dll.Native_managed_dll.INSTANCE.Methods_Parameters_Out(string, __length, __upper);
        mono.embeddinator.Runtime.checkExceptions();
        length.set(__length.getValue());
        upper.set(__upper.getValue());
    }
}
