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

public class ShortDictionaryCollection {
    public com.sun.jna.Pointer __object;

    public ShortDictionaryCollection(com.sun.jna.Pointer object) { this.__object = object; }

    public ShortDictionaryCollection() {
        __object = managed_dll.Native_managed_dll.INSTANCE.Subscripts_ShortDictionaryCollection_new();
        mono.embeddinator.Runtime.checkExceptions();
    }

    public void add(String key, short item) {
        managed_dll.Native_managed_dll.INSTANCE.Subscripts_ShortDictionaryCollection_Add(__object, key, item);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public void remove(String key) {
        managed_dll.Native_managed_dll.INSTANCE.Subscripts_ShortDictionaryCollection_Remove(__object, key);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public int getCount() {
        int __ret = managed_dll.Native_managed_dll.INSTANCE.Subscripts_ShortDictionaryCollection_get_Count(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public short getItem(String key) {
        short __ret = managed_dll.Native_managed_dll.INSTANCE.Subscripts_ShortDictionaryCollection_get_Item(__object, key);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public void setItem(String key, short value) {
        managed_dll.Native_managed_dll.INSTANCE.Subscripts_ShortDictionaryCollection_set_Item(__object, key, value);
        mono.embeddinator.Runtime.checkExceptions();
    }
}
