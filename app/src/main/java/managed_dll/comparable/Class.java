/**
 * ----------------------------------------------------------------------------
 * <auto-generated>
 * This is autogenerated code by Embeddinator-4000.
 * Do not edit this file or all your changes will be lost after re-generation.
 * </auto-generated>
 * ----------------------------------------------------------------------------
 */
package managed_dll.comparable;

import mono.embeddinator.*;
import com.sun.jna.*;

public class Class implements mscorlib_dll.system.IComparable {
    public com.sun.jna.Pointer __object;

    public Class(com.sun.jna.Pointer object) { this.__object = object; }

    @Override
    public com.sun.jna.Pointer __getObject() { return this.__object; }

    public Class(int i) {
        __object = managed_dll.Native_managed_dll.INSTANCE.Comparable_Class_new(i);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public int getInteger() {
        int __ret = managed_dll.Native_managed_dll.INSTANCE.Comparable_Class_get_Integer(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }
}
