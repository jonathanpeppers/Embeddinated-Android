/**
 * ----------------------------------------------------------------------------
 * <auto-generated>
 * This is autogenerated code by Embeddinator-4000.
 * Do not edit this file or all your changes will be lost after re-generation.
 * </auto-generated>
 * ----------------------------------------------------------------------------
 */
package managed_dll.fields;

import mono.embeddinator.*;
import com.sun.jna.*;

public class Class {
    public com.sun.jna.Pointer __object;

    public Class(com.sun.jna.Pointer object) { this.__object = object; }

    public Class(boolean enabled) {
        __object = managed_dll.Native_managed_dll.INSTANCE.Fields_Class_new((byte)(enabled? 1 : 0));
        mono.embeddinator.Runtime.checkExceptions();
    }

    public static long get_MaxLong() {
        long __ret = managed_dll.Native_managed_dll.INSTANCE.Fields_Class_get_MaxLong();
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public static void set_MaxLong(long value) {
        managed_dll.Native_managed_dll.INSTANCE.Fields_Class_set_MaxLong(value);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public static managed_dll.fields.Class get_Scratch() {
        com.sun.jna.Pointer __ret = managed_dll.Native_managed_dll.INSTANCE.Fields_Class_get_Scratch();
        mono.embeddinator.Runtime.checkExceptions();
        return (__ret == com.sun.jna.Pointer.NULL ? null : new managed_dll.fields.Class(__ret));
    }

    public static void set_Scratch(managed_dll.fields.Class value) {
        managed_dll.Native_managed_dll.INSTANCE.Fields_Class_set_Scratch(value == null ? null : value.__object);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public static int get_Integer() {
        int __ret = managed_dll.Native_managed_dll.INSTANCE.Fields_Class_get_Integer();
        mono.embeddinator.Runtime.checkExceptions();
        return __ret;
    }

    public static void set_Integer(int value) {
        managed_dll.Native_managed_dll.INSTANCE.Fields_Class_set_Integer(value);
        mono.embeddinator.Runtime.checkExceptions();
    }

    public boolean get_Boolean() {
        byte __ret = managed_dll.Native_managed_dll.INSTANCE.Fields_Class_get_Boolean(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return __ret != 0;
    }

    public void set_Boolean(boolean value) {
        managed_dll.Native_managed_dll.INSTANCE.Fields_Class_set_Boolean(__object, (byte)(value? 1 : 0));
        mono.embeddinator.Runtime.checkExceptions();
    }

    public managed_dll.fields.Struct get_Structure() {
        com.sun.jna.Pointer __ret = managed_dll.Native_managed_dll.INSTANCE.Fields_Class_get_Structure(__object);
        mono.embeddinator.Runtime.checkExceptions();
        return (__ret == com.sun.jna.Pointer.NULL ? null : new managed_dll.fields.Struct(__ret));
    }

    public void set_Structure(managed_dll.fields.Struct value) {
        managed_dll.Native_managed_dll.INSTANCE.Fields_Class_set_Structure(__object, value == null ? null : value.__object);
        mono.embeddinator.Runtime.checkExceptions();
    }
}