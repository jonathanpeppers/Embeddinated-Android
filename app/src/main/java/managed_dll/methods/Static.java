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

public class Static {
    public com.sun.jna.Pointer __object;

    public Static(com.sun.jna.Pointer object) { this.__object = object; }

    public static managed_dll.methods.Static create(int id) {
        com.sun.jna.Pointer __ret = managed_dll.Native_managed_dll.INSTANCE.Methods_Static_Create(id);
        mono.embeddinator.Runtime.checkExceptions();
        return (__ret == com.sun.jna.Pointer.NULL ? null : new managed_dll.methods.Static(__ret));
    }

    public int getId() {
        int __ret = managed_dll.Native_managed_dll.INSTANCE.Methods_Static_get_Id(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }
}
