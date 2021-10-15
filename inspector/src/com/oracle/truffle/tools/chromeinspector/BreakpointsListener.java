package com.oracle.truffle.tools.chromeinspector;

import com.oracle.truffle.api.debug.Breakpoint;
import com.oracle.truffle.api.debug.DebuggerSession;

import java.util.List;

public interface BreakpointsListener {

    boolean canSuspend(DebuggerSession session);

    /**
     * Listens to the inspector breakpoints pause events
     */
    void onBreakpointSuspend(DebuggerSession session);

    /**
     * Listens to the inspector breakpoints resume events
     */
    void onBreakpointResume(DebuggerSession session);

    /**
     * Listens to the inspector breakpoints create events
     */
    void onBreakpointCreate(int breakpointsNumber, String newBreakpointId);

    /**
     *
     * Listens to the inspector breakpoints dispose events
     */
    void onBreakpointDispose(String id, int sessionCount, List<Breakpoint> allPossibleBreakpoints);

    void onBreakpointDispose(String errorMsg);

}
