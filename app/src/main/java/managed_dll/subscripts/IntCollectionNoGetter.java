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

public class IntCollectionNoGetter {
    public com.sun.jna.Pointer __object;

    public IntCollectionNoGetter(com.sun.jna.Pointer object) { this.__object = object; }

    public IntCollectionNoGetter() {
        __object = managed_dll.Native_managed_dll.INSTANCE.Subscripts_IntCollectionNoGetter_new();
        mono.embeddinator.Runtime.checkExceptions();
    }

    public void setItem(int index, int value) {
        managed_dll.Native_managed_dll.INSTANCE.Subscripts_IntCollectionNoGetter_set_Item(__object, index, value);
        mono.embeddinator.Runtime.checkExceptions();
    }
}
