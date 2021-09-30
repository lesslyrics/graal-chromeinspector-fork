//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.oracle.truffle.tools.chromeinspector.instrument;

import com.oracle.truffle.api.dsl.GeneratedBy;
import org.graalvm.options.OptionCategory;
import org.graalvm.options.OptionDescriptor;
import org.graalvm.options.OptionDescriptors;
import org.graalvm.options.OptionStability;

import java.util.Arrays;
import java.util.Iterator;

@GeneratedBy(InspectorInstrument.class)
final class InspectorInstrumentOptionDescriptors implements OptionDescriptors {
    InspectorInstrumentOptionDescriptors() {
    }

    public OptionDescriptor get(String optionName) {
        byte var3 = -1;
        switch(optionName.hashCode()) {
        case -1755853647:
            if (optionName.equals("inspect.Secure")) {
                var3 = 10;
            }
            break;
        case -1196687590:
            if (optionName.equals("inspect.SourcePath")) {
                var3 = 11;
            }
            break;
        case -357795017:
            if (optionName.equals("inspect.KeyStorePassword")) {
                var3 = 7;
            }
            break;
        case -158344225:
            if (optionName.equals("inspect.Path")) {
                var3 = 9;
            }
            break;
        case -136707193:
            if (optionName.equals("inspect.HideErrors")) {
                var3 = 2;
            }
            break;
        case -120188966:
            if (optionName.equals("inspect.Initialization")) {
                var3 = 3;
            }
            break;
        case 87726204:
            if (optionName.equals("inspect.KeyStore")) {
                var3 = 6;
            }
            break;
        case 168087927:
            if (optionName.equals("inspect.Internal")) {
                var3 = 4;
            }
            break;
        case 1026162134:
            if (optionName.equals("inspect.KeyStoreType")) {
                var3 = 8;
            }
            break;
        case 1611149600:
            if (optionName.equals("inspect.KeyPassword")) {
                var3 = 5;
            }
            break;
        case 1875793474:
            if (optionName.equals("inspect.Suspend")) {
                var3 = 12;
            }
            break;
        case 1957454356:
            if (optionName.equals("inspect")) {
                var3 = 0;
            }
            break;
        case 2013350899:
            if (optionName.equals("inspect.WaitAttached")) {
                var3 = 13;
            }
            break;
        case 2038128511:
            if (optionName.equals("inspect.Attach")) {
                var3 = 1;
            }
        }

        switch(var3) {
        case 0:
            return OptionDescriptor.newBuilder(InspectorInstrument.Inspect, "inspect").deprecated(false).help("Start the Chrome inspector on [[host:]port]. (default: <loopback address>:9229)").category(OptionCategory.USER).stability(OptionStability.STABLE).build();
        case 1:
            return OptionDescriptor.newBuilder(InspectorInstrument.Attach, "inspect.Attach").deprecated(false).help("Attach to an existing endpoint instead of creating a new one. (default:false)").category(OptionCategory.INTERNAL).stability(OptionStability.EXPERIMENTAL).build();
        case 2:
            return OptionDescriptor.newBuilder(InspectorInstrument.HideErrors, "inspect.HideErrors").deprecated(false).help("Hide internal errors that can occur as a result of debugger inspection. (default:false)").category(OptionCategory.EXPERT).stability(OptionStability.EXPERIMENTAL).build();
        case 3:
            return OptionDescriptor.newBuilder(InspectorInstrument.Initialization, "inspect.Initialization").deprecated(false).help("Inspect language initialization. (default:false)").category(OptionCategory.INTERNAL).stability(OptionStability.EXPERIMENTAL).build();
        case 4:
            return OptionDescriptor.newBuilder(InspectorInstrument.Internal, "inspect.Internal").deprecated(false).help("Inspect internal sources. (default:false)").category(OptionCategory.INTERNAL).stability(OptionStability.EXPERIMENTAL).build();
        case 5:
            return OptionDescriptor.newBuilder(InspectorInstrument.KeyPassword, "inspect.KeyPassword").deprecated(false).help("Password for recovering keys from a keystore. (default:javax.net.ssl.keyPassword system property, or keystore password)").category(OptionCategory.USER).stability(OptionStability.STABLE).build();
        case 6:
            return OptionDescriptor.newBuilder(InspectorInstrument.KeyStore, "inspect.KeyStore").deprecated(false).help("File path to keystore used for secure connection. (default:javax.net.ssl.keyStore system property)").category(OptionCategory.USER).stability(OptionStability.STABLE).build();
        case 7:
            return OptionDescriptor.newBuilder(InspectorInstrument.KeyStorePassword, "inspect.KeyStorePassword").deprecated(false).help("The keystore password. (default:javax.net.ssl.keyStorePassword system property)").category(OptionCategory.USER).stability(OptionStability.STABLE).build();
        case 8:
            return OptionDescriptor.newBuilder(InspectorInstrument.KeyStoreType, "inspect.KeyStoreType").deprecated(false).help("The keystore type. (default:javax.net.ssl.keyStoreType system property, or \"JKS\")").category(OptionCategory.USER).stability(OptionStability.STABLE).build();
        case 9:
            return OptionDescriptor.newBuilder(InspectorInstrument.Path, "inspect.Path").deprecated(false).help("Path to the chrome inspect. This path should be unpredictable. Do note that any website opened in your browser that has knowledge of the URL can connect to the debugger. A predictable path can thus be abused by a malicious website to execute arbitrary code on your computer, even if you are behind a firewall. (default: randomly generated)").category(OptionCategory.USER).stability(OptionStability.STABLE).build();
        case 10:
            return OptionDescriptor.newBuilder(InspectorInstrument.Secure, "inspect.Secure").deprecated(false).help("Use TLS/SSL. (default: false for loopback address, true otherwise)").category(OptionCategory.USER).stability(OptionStability.STABLE).build();
        case 11:
            return OptionDescriptor.newBuilder(InspectorInstrument.SourcePath, "inspect.SourcePath").deprecated(false).help("Specifies list of directories or ZIP/JAR files representing source path. (default:none)").category(OptionCategory.USER).stability(OptionStability.STABLE).build();
        case 12:
            return OptionDescriptor.newBuilder(InspectorInstrument.Suspend, "inspect.Suspend").deprecated(false).help("Suspend the execution at first executed source line. (default:true)").category(OptionCategory.USER).stability(OptionStability.STABLE).build();
        case 13:
            return OptionDescriptor.newBuilder(InspectorInstrument.WaitAttached, "inspect.WaitAttached").deprecated(false).help("Do not execute any source code until inspector client is attached. (default:false)").category(OptionCategory.USER).stability(OptionStability.STABLE).build();
        default:
            return null;
        }
    }

    public Iterator<OptionDescriptor> iterator() {
        return Arrays.asList(OptionDescriptor.newBuilder(InspectorInstrument.Inspect, "inspect").deprecated(false).help("Start the Chrome inspector on [[host:]port]. (default: <loopback address>:9229)").category(OptionCategory.USER).stability(OptionStability.STABLE).build(), OptionDescriptor.newBuilder(InspectorInstrument.Attach, "inspect.Attach").deprecated(false).help("Attach to an existing endpoint instead of creating a new one. (default:false)").category(OptionCategory.INTERNAL).stability(OptionStability.EXPERIMENTAL).build(), OptionDescriptor.newBuilder(InspectorInstrument.HideErrors, "inspect.HideErrors").deprecated(false).help("Hide internal errors that can occur as a result of debugger inspection. (default:false)").category(OptionCategory.EXPERT).stability(OptionStability.EXPERIMENTAL).build(), OptionDescriptor.newBuilder(InspectorInstrument.Initialization, "inspect.Initialization").deprecated(false).help("Inspect language initialization. (default:false)").category(OptionCategory.INTERNAL).stability(OptionStability.EXPERIMENTAL).build(), OptionDescriptor.newBuilder(InspectorInstrument.Internal, "inspect.Internal").deprecated(false).help("Inspect internal sources. (default:false)").category(OptionCategory.INTERNAL).stability(OptionStability.EXPERIMENTAL).build(), OptionDescriptor.newBuilder(InspectorInstrument.KeyPassword, "inspect.KeyPassword").deprecated(false).help("Password for recovering keys from a keystore. (default:javax.net.ssl.keyPassword system property, or keystore password)").category(OptionCategory.USER).stability(OptionStability.STABLE).build(), OptionDescriptor.newBuilder(InspectorInstrument.KeyStore, "inspect.KeyStore").deprecated(false).help("File path to keystore used for secure connection. (default:javax.net.ssl.keyStore system property)").category(OptionCategory.USER).stability(OptionStability.STABLE).build(), OptionDescriptor.newBuilder(InspectorInstrument.KeyStorePassword, "inspect.KeyStorePassword").deprecated(false).help("The keystore password. (default:javax.net.ssl.keyStorePassword system property)").category(OptionCategory.USER).stability(OptionStability.STABLE).build(), OptionDescriptor.newBuilder(InspectorInstrument.KeyStoreType, "inspect.KeyStoreType").deprecated(false).help("The keystore type. (default:javax.net.ssl.keyStoreType system property, or \"JKS\")").category(OptionCategory.USER).stability(OptionStability.STABLE).build(), OptionDescriptor.newBuilder(InspectorInstrument.Path, "inspect.Path").deprecated(false).help("Path to the chrome inspect. This path should be unpredictable. Do note that any website opened in your browser that has knowledge of the URL can connect to the debugger. A predictable path can thus be abused by a malicious website to execute arbitrary code on your computer, even if you are behind a firewall. (default: randomly generated)").category(OptionCategory.USER).stability(OptionStability.STABLE).build(), OptionDescriptor.newBuilder(InspectorInstrument.Secure, "inspect.Secure").deprecated(false).help("Use TLS/SSL. (default: false for loopback address, true otherwise)").category(OptionCategory.USER).stability(OptionStability.STABLE).build(), OptionDescriptor.newBuilder(InspectorInstrument.SourcePath, "inspect.SourcePath").deprecated(false).help("Specifies list of directories or ZIP/JAR files representing source path. (default:none)").category(OptionCategory.USER).stability(OptionStability.STABLE).build(), OptionDescriptor.newBuilder(InspectorInstrument.Suspend, "inspect.Suspend").deprecated(false).help("Suspend the execution at first executed source line. (default:true)").category(OptionCategory.USER).stability(OptionStability.STABLE).build(), OptionDescriptor.newBuilder(InspectorInstrument.WaitAttached, "inspect.WaitAttached").deprecated(false).help("Do not execute any source code until inspector client is attached. (default:false)").category(OptionCategory.USER).stability(OptionStability.STABLE).build()).iterator();
    }
}
