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

public class StringCollection {
    public com.sun.jna.Pointer __object;

    public StringCollection(com.sun.jna.Pointer object) { this.__object = object; }

    public StringCollection() {
        __object = managed_dll.Native_managed_dll.INSTANCE.Subscripts_StringCollection_new();
        mono.embeddinator.Runtime.checkExceptions();
    }

    public void add(String item) {
        managed_dll.Native_managed_dll.INSTANCE.Subscripts_StringCollection_Add(__object, item);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public void remove(String item) {
        managed_dll.Native_managed_dll.INSTANCE.Subscripts_StringCollection_Remove(__object, item);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public int getCount() {
        int __ret = managed_dll.Native_managed_dll.INSTANCE.Subscripts_StringCollection_get_Count(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public String getItem(int index) {
        String __ret = managed_dll.Native_managed_dll.INSTANCE.Subscripts_StringCollection_get_Item(__object, index);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public void setItem(int index, String value) {
        managed_dll.Native_managed_dll.INSTANCE.Subscripts_StringCollection_set_Item(__object, index, value);
        mono.embeddinator.Runtime.checkExceptions();
    }
}
