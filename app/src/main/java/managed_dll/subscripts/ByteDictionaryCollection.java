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

public class ByteDictionaryCollection {
    public com.sun.jna.Pointer __object;

    public ByteDictionaryCollection(com.sun.jna.Pointer object) { this.__object = object; }

    public ByteDictionaryCollection() {
        __object = managed_dll.Native_managed_dll.INSTANCE.Subscripts_ByteDictionaryCollection_new();
        mono.embeddinator.Runtime.checkExceptions();
    }

    public void add(String key, UnsignedByte item) {
        managed_dll.Native_managed_dll.INSTANCE.Subscripts_ByteDictionaryCollection_Add(__object, key, item);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public void remove(String key) {
        managed_dll.Native_managed_dll.INSTANCE.Subscripts_ByteDictionaryCollection_Remove(__object, key);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public int getCount() {
        int __ret = managed_dll.Native_managed_dll.INSTANCE.Subscripts_ByteDictionaryCollection_get_Count(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public UnsignedByte getItem(String key) {
        UnsignedByte __ret = managed_dll.Native_managed_dll.INSTANCE.Subscripts_ByteDictionaryCollection_get_Item(__object, key);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public void setItem(String key, UnsignedByte value) {
        managed_dll.Native_managed_dll.INSTANCE.Subscripts_ByteDictionaryCollection_set_Item(__object, key, value);
        mono.embeddinator.Runtime.checkExceptions();
    }
}
