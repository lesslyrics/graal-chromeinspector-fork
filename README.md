# Graal-chromeinspector-fork
This is the fork to the official  [Graal repository](https://github.com/oracle/graal) aimed to provide customization to the chromeinspector tool. 
- ScriptsHandler class was modified in order to remove redundant in our case unique names for the technically same files;
- InspectorDebugger and InspectServerSession classes were modify to incorporate breakpoints listener logic;
- BreakpointsListener and BreakpointsListenerBasicImpl classes were created.
