/**
 * ----------------------------------------------------------------------------
 * <auto-generated>
 * This is autogenerated code by Embeddinator-4000.
 * Do not edit this file or all your changes will be lost after re-generation.
 * </auto-generated>
 * ----------------------------------------------------------------------------
 */
package managed_dll;

import mono.embeddinator.*;
import com.sun.jna.*;

public class ExposeExtraTypes {
    public com.sun.jna.Pointer __object;

    public ExposeExtraTypes(com.sun.jna.Pointer object) { this.__object = object; }

    public ExposeExtraTypes() {
        __object = managed_dll.Native_managed_dll.INSTANCE.ExposeExtraTypes_new();
        mono.embeddinator.Runtime.checkExceptions();
    }
}
