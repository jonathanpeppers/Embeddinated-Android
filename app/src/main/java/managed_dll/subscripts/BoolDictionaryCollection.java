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

public class BoolDictionaryCollection {
    public com.sun.jna.Pointer __object;

    public BoolDictionaryCollection(com.sun.jna.Pointer object) { this.__object = object; }

    public BoolDictionaryCollection() {
        __object = managed_dll.Native_managed_dll.INSTANCE.Subscripts_BoolDictionaryCollection_new();
        mono.embeddinator.Runtime.checkExceptions();
    }

    public void add(String key, boolean item) {
        managed_dll.Native_managed_dll.INSTANCE.Subscripts_BoolDictionaryCollection_Add(__object, key, (byte)(item? 1 : 0));
        mono.embeddinator.Runtime.checkExceptions();
    }

    public void remove(String key) {
        managed_dll.Native_managed_dll.INSTANCE.Subscripts_BoolDictionaryCollection_Remove(__object, key);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public int getCount() {
        int __ret = managed_dll.Native_managed_dll.INSTANCE.Subscripts_BoolDictionaryCollection_get_Count(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public boolean getItem(String key) {
        byte __ret = managed_dll.Native_managed_dll.INSTANCE.Subscripts_BoolDictionaryCollection_get_Item(__object, key);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret != 0;
    }

    public void setItem(String key, boolean value) {
        managed_dll.Native_managed_dll.INSTANCE.Subscripts_BoolDictionaryCollection_set_Item(__object, key, (byte)(value? 1 : 0));
        mono.embeddinator.Runtime.checkExceptions();
    }
}
