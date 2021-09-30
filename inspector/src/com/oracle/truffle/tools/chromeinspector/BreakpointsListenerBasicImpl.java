package com.oracle.truffle.tools.chromeinspector;

import com.oracle.truffle.api.debug.Breakpoint;
import com.oracle.truffle.api.debug.DebuggerSession;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

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
        logger.info("BREAKPOINTS LISTENER: onBreakpointResume");
    }

    /**
     * Listens to the inspector breakpoints create events
     */
    @Override
    public void onBreakpointCreate(int breakpointsNumber, String newBreakpointId) {
        logger.info("BREAKPOINTS LISTENER: onBreakpointCreate. Number of breakpoints: $breakpointsNumber, New Breakpoint Id: $newBreakpointId");
    }


    /**
     *
     * Listens to the inspector breakpoints dispose events
     */
    @Override
    public void onBreakpointDispose(String id, int sessionCount, List<Breakpoint> allPossibleBreakpoints) {
        logger.info("BREAKPOINTS LISTENER: onBreakpointDispose. Breakpoint Id: $id, session count: $sessionCount");
    }


    @Override
    public void onBreakpointDispose(String errorMsg) {
        logger.info("BREAKPOINTS LISTENER: onBreakpointDispose error $errorMsg");
    }

}
