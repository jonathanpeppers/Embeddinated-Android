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

public class NestedClass {
    public com.sun.jna.Pointer __object;

    public NestedClass(com.sun.jna.Pointer object) { this.__object = object; }

    public NestedClass() {
        __object = managed_dll.Native_managed_dll.INSTANCE.NestedClasses_NestedClass_new();
        mono.embeddinator.Runtime.checkExceptions();
    }

    public int addition(int x, int y) {
        int __ret = managed_dll.Native_managed_dll.INSTANCE.NestedClasses_NestedClass_Addition(__object, x, y);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public int get_X() {
        int __ret = managed_dll.Native_managed_dll.INSTANCE.NestedClasses_NestedClass_get_X(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public void set_X(int value) {
        managed_dll.Native_managed_dll.INSTANCE.NestedClasses_NestedClass_set_X(__object, value);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public int get_Y() {
        int __ret = managed_dll.Native_managed_dll.INSTANCE.NestedClasses_NestedClass_get_Y(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public void set_Y(int value) {
        managed_dll.Native_managed_dll.INSTANCE.NestedClasses_NestedClass_set_Y(__object, value);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public int get_Sum() {
        int __ret = managed_dll.Native_managed_dll.INSTANCE.NestedClasses_NestedClass_get_Sum(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public void set_Sum(int value) {
        managed_dll.Native_managed_dll.INSTANCE.NestedClasses_NestedClass_set_Sum(__object, value);
        mono.embeddinator.Runtime.checkExceptions();
    }
}