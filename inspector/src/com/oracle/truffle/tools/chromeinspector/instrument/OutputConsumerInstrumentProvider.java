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

@GeneratedBy(OutputConsumerInstrument.class)
@Registration(
    id = "OutputProviderInstrument",
    internal = true
)
public final class OutputConsumerInstrumentProvider implements Provider {
    public OutputConsumerInstrumentProvider() {
    }

    public String getInstrumentClassName() {
        return "com.oracle.truffle.tools.chromeinspector.instrument.OutputConsumerInstrument";
    }

    public TruffleInstrument create() {
        return new OutputConsumerInstrument();
    }

    public Collection<String> getServicesClassNames() {
        return Arrays.asList("com.oracle.truffle.tools.chromeinspector.instrument.Enabler", "com.oracle.truffle.tools.chromeinspector.OutputHandler$Provider");
    }
}
