/**
 * ----------------------------------------------------------------------------
 * <auto-generated>
 * This is autogenerated code by Embeddinator-4000.
 * Do not edit this file or all your changes will be lost after re-generation.
 * </auto-generated>
 * ----------------------------------------------------------------------------
 */
package managed_dll.subscripts;

import mono.embeddinator.*;
import com.sun.jna.*;

public class DoubleCollection {
    public com.sun.jna.Pointer __object;

    public DoubleCollection(com.sun.jna.Pointer object) { this.__object = object; }

    public DoubleCollection() {
        __object = managed_dll.Native_managed_dll.INSTANCE.Subscripts_DoubleCollection_new();
        mono.embeddinator.Runtime.checkExceptions();
    }

    public void add(double item) {
        managed_dll.Native_managed_dll.INSTANCE.Subscripts_DoubleCollection_Add(__object, item);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public void remove(double item) {
        managed_dll.Native_managed_dll.INSTANCE.Subscripts_DoubleCollection_Remove(__object, item);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public int getCount() {
        int __ret = managed_dll.Native_managed_dll.INSTANCE.Subscripts_DoubleCollection_get_Count(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public double getItem(int index) {
        double __ret = managed_dll.Native_managed_dll.INSTANCE.Subscripts_DoubleCollection_get_Item(__object, index);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public void setItem(int index, double value) {
        managed_dll.Native_managed_dll.INSTANCE.Subscripts_DoubleCollection_set_Item(__object, index, value);
        mono.embeddinator.Runtime.checkExceptions();
    }
}
