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

public final class Factory {
    public com.sun.jna.Pointer __object;

    public Factory(com.sun.jna.Pointer object) { this.__object = object; }

    public static managed_dll.methods.Item createItem(int id) {
        com.sun.jna.Pointer __ret = managed_dll.Native_managed_dll.INSTANCE.Methods_Factory_CreateItem(id);
        mono.embeddinator.Runtime.checkExceptions();
        return (__ret == com.sun.jna.Pointer.NULL ? null : new managed_dll.methods.Item(__ret));
    }

    public static managed_dll.methods.Item returnNull() {
        com.sun.jna.Pointer __ret = managed_dll.Native_managed_dll.INSTANCE.Methods_Factory_ReturnNull();
        mono.embeddinator.Runtime.checkExceptions();
        return (__ret == com.sun.jna.Pointer.NULL ? null : new managed_dll.methods.Item(__ret));
    }
}
