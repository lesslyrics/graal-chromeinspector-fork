//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.oracle.truffle.tools.chromeinspector.instrument;

import com.oracle.truffle.api.dsl.GeneratedBy;
import com.oracle.truffle.api.instrumentation.TruffleInstrument;
import com.oracle.truffle.api.instrumentation.TruffleInstrument.Provider;
import com.oracle.truffle.api.instrumentation.TruffleInstrument.Registration;
import java.util.Arrays;
import java.util.Collection;

@GeneratedBy(TypeProfileInstrument.class)
@Registration(
    id = "TypeProfileInstrument",
    internal = true
)
public final class TypeProfileInstrumentProvider implements Provider {
    public TypeProfileInstrumentProvider() {
    }

    public String getInstrumentClassName() {
        return "com.oracle.truffle.tools.chromeinspector.instrument.TypeProfileInstrument";
    }

    public TruffleInstrument create() {
        return new TypeProfileInstrument();
    }

    public Collection<String> getServicesClassNames() {
        return Arrays.asList("com.oracle.truffle.tools.chromeinspector.instrument.Enabler", "com.oracle.truffle.tools.chromeinspector.TypeHandler$Provider");
    }
}
