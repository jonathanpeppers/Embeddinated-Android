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

public class MyNextException extends managed_dll.MyException {
    public MyNextException(com.sun.jna.Pointer object) { super(object); }

    public MyNextException() {
        super((com.sun.jna.Pointer)null);
        __object = managed_dll.Native_managed_dll.INSTANCE.MyNextException_new();
        mono.embeddinator.Runtime.checkExceptions();
    }
}