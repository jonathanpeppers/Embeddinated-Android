/**
 * ----------------------------------------------------------------------------
 * <auto-generated>
 * This is autogenerated code by Embeddinator-4000.
 * Do not edit this file or all your changes will be lost after re-generation.
 * </auto-generated>
 * ----------------------------------------------------------------------------
 */
package managed_dll.nestedclasses;

import mono.embeddinator.*;
import com.sun.jna.*;

public class ParentClass {
    public com.sun.jna.Pointer __object;

    public ParentClass(com.sun.jna.Pointer object) { this.__object = object; }

    public ParentClass() {
        __object = managed_dll.Native_managed_dll.INSTANCE.NestedClasses_ParentClass_new();
        mono.embeddinator.Runtime.checkExceptions();
    }

    public managed_dll.nestedclasses.NestedClass getNested() {
        com.sun.jna.Pointer __ret = managed_dll.Native_managed_dll.INSTANCE.NestedClasses_ParentClass_get_Nested(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return (__ret == com.sun.jna.Pointer.NULL ? null : new managed_dll.nestedclasses.NestedClass(__ret));
    }

    public void setNested(managed_dll.nestedclasses.NestedClass value) {
        managed_dll.Native_managed_dll.INSTANCE.NestedClasses_ParentClass_set_Nested(__object, value == null ? null : value.__object);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public int addNumbers(int x, int y) {
        int __ret = managed_dll.Native_managed_dll.INSTANCE.NestedClasses_ParentClass_AddNumbers(__object, x, y);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public int getSum() {
        int __ret = managed_dll.Native_managed_dll.INSTANCE.NestedClasses_ParentClass_get_Sum(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }
}
