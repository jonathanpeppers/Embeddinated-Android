/**
 * ----------------------------------------------------------------------------
 * <auto-generated>
 * This is autogenerated code by Embeddinator-4000.
 * Do not edit this file or all your changes will be lost after re-generation.
 * </auto-generated>
 * ----------------------------------------------------------------------------
 */
package managed_dll.interfaces;

import mono.embeddinator.*;
import com.sun.jna.*;

public class ExposeIFormatProvider {
    public com.sun.jna.Pointer __object;

    public ExposeIFormatProvider(com.sun.jna.Pointer object) { this.__object = object; }

    public ExposeIFormatProvider() {
        __object = managed_dll.Native_managed_dll.INSTANCE.Interfaces_ExposeIFormatProvider_new();
        mono.embeddinator.Runtime.checkExceptions();
    }
}
