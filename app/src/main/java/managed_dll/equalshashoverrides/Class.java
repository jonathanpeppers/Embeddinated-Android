/**
 * ----------------------------------------------------------------------------
 * <auto-generated>
 * This is autogenerated code by Embeddinator-4000.
 * Do not edit this file or all your changes will be lost after re-generation.
 * </auto-generated>
 * ----------------------------------------------------------------------------
 */
package managed_dll.equalshashoverrides;

import mono.embeddinator.*;
import com.sun.jna.*;

public class Class {
    public com.sun.jna.Pointer __object;

    public Class(com.sun.jna.Pointer object) { this.__object = object; }

    public Class(int x) {
        __object = managed_dll.Native_managed_dll.INSTANCE.EqualsHashOverrides_Class_new(x);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public int getX() {
        int __ret = managed_dll.Native_managed_dll.INSTANCE.EqualsHashOverrides_Class_get_X(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public void setX(int value) {
        managed_dll.Native_managed_dll.INSTANCE.EqualsHashOverrides_Class_set_X(__object, value);
        mono.embeddinator.Runtime.checkExceptions();
    }
}
