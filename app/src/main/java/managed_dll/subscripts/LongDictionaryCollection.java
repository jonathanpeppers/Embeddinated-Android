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

public class LongDictionaryCollection {
    public com.sun.jna.Pointer __object;

    public LongDictionaryCollection(com.sun.jna.Pointer object) { this.__object = object; }

    public LongDictionaryCollection() {
        __object = managed_dll.Native_managed_dll.INSTANCE.Subscripts_LongDictionaryCollection_new();
        mono.embeddinator.Runtime.checkExceptions();
    }

    public void add(String key, long item) {
        managed_dll.Native_managed_dll.INSTANCE.Subscripts_LongDictionaryCollection_Add(__object, key, item);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public void remove(String key) {
        managed_dll.Native_managed_dll.INSTANCE.Subscripts_LongDictionaryCollection_Remove(__object, key);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public int getCount() {
        int __ret = managed_dll.Native_managed_dll.INSTANCE.Subscripts_LongDictionaryCollection_get_Count(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public long getItem(String key) {
        long __ret = managed_dll.Native_managed_dll.INSTANCE.Subscripts_LongDictionaryCollection_get_Item(__object, key);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public void setItem(String key, long value) {
        managed_dll.Native_managed_dll.INSTANCE.Subscripts_LongDictionaryCollection_set_Item(__object, key, value);
        mono.embeddinator.Runtime.checkExceptions();
    }
}
