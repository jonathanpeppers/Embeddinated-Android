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

public class FloatDictionaryCollection {
    public com.sun.jna.Pointer __object;

    public FloatDictionaryCollection(com.sun.jna.Pointer object) { this.__object = object; }

    public FloatDictionaryCollection() {
        __object = managed_dll.Native_managed_dll.INSTANCE.Subscripts_FloatDictionaryCollection_new();
        mono.embeddinator.Runtime.checkExceptions();
    }

    public void add(String key, float item) {
        managed_dll.Native_managed_dll.INSTANCE.Subscripts_FloatDictionaryCollection_Add(__object, key, item);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public void remove(String key) {
        managed_dll.Native_managed_dll.INSTANCE.Subscripts_FloatDictionaryCollection_Remove(__object, key);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public int getCount() {
        int __ret = managed_dll.Native_managed_dll.INSTANCE.Subscripts_FloatDictionaryCollection_get_Count(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public float getItem(String key) {
        float __ret = managed_dll.Native_managed_dll.INSTANCE.Subscripts_FloatDictionaryCollection_get_Item(__object, key);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public void setItem(String key, float value) {
        managed_dll.Native_managed_dll.INSTANCE.Subscripts_FloatDictionaryCollection_set_Item(__object, key, value);
        mono.embeddinator.Runtime.checkExceptions();
    }
}
