/**
 * ----------------------------------------------------------------------------
 * <auto-generated>
 * This is autogenerated code by Embeddinator-4000.
 * Do not edit this file or all your changes will be lost after re-generation.
 * </auto-generated>
 * ----------------------------------------------------------------------------
 */
package managed_dll.properties;

import mono.embeddinator.*;
import com.sun.jna.*;

public class DuplicateIndexedProperties {
    public com.sun.jna.Pointer __object;

    public DuplicateIndexedProperties(com.sun.jna.Pointer object) { this.__object = object; }

    public DuplicateIndexedProperties() {
        __object = managed_dll.Native_managed_dll.INSTANCE.Properties_DuplicateIndexedProperties_new();
        mono.embeddinator.Runtime.checkExceptions();
    }

    public int getItem(int i) {
        int __ret = managed_dll.Native_managed_dll.INSTANCE.Properties_DuplicateIndexedProperties_get_Item(__object, i);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public int getItem_1(String i) {
        int __ret = managed_dll.Native_managed_dll.INSTANCE.Properties_DuplicateIndexedProperties_get_Item_1(__object, i);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }
}
