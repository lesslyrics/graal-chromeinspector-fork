package com.oracle.truffle.tools.chromeinspector;

import com.oracle.truffle.api.debug.Breakpoint;
import com.oracle.truffle.api.debug.DebuggerSession;

import java.util.List;

public class BreakpointsListenerBasicImpl implements BreakpointsListener {

    private static Logger logger = LogManager.getLogger(BreakpointsListenerBasicImpl.class);

    /**
     * Listens to the inspector breakpoints pause events
     */
    @Override
    public void onBreakpointPause(DebuggerSession session) {
        logger.info("BREAKPOINTS LISTENER: onBreakpointPaused");
    }

    /**
     * Listens to the inspector breakpoints resume events
     */
    @Override
    public void onBreakpointResume(DebuggerSession session) {
    }

    /**
     * Listens to the inspector breakpoints create events
     */
    @Override
    public void onBreakpointCreate(int breakpointsNumber, String newBreakpointId) {
    }


    /**
     *
     * Listens to the inspector breakpoints dispose events
     */
    @Override
    public void onBreakpointDispose(String id, int sessionCount, List<Breakpoint> allPossibleBreakpoints) {
    }


    @Override
    public void onBreakpointDispose(String errorMsg) {
    }

}
