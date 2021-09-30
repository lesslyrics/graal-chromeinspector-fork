package com.oracle.truffle.tools.chromeinspector

import com.oracle.truffle.api.debug.Breakpoint
import com.oracle.truffle.api.debug.SuspendedEvent

class BreakpointsListenerBasicImpl: BreakpointsListener {

    override fun onBreakpointPause(suspendedEvent: SuspendedEvent) {
        println("BREAKPOINTS LISTENER: onBreakpointPaused. Number of breakpoints: ${suspendedEvent.breakpoints.size} ")
    }

    override fun onBreakpointResume(suspendedEvent: SuspendedEvent) {
        println("BREAKPOINTS LISTENER: onBreakpointResume. Number of breakpoints: ${suspendedEvent.breakpoints.size}")
    }

    override fun onBreakpointCreate(breakpointsNumber: Int, newBreakpointId: String?) {
        println("BREAKPOINTS LISTENER: onBreakpointCreate. Number of breakpoints: $breakpointsNumber, New Breakpoint Id: $newBreakpointId")
    }


    override fun onBreakpointDispose(id: String?, sessionCount: Int, allPossibleBreakpoints: MutableList<Breakpoint>?) {
        println("BREAKPOINTS LISTENER: onBreakpointDispose. Breakpoint Id: $id, session count: $sessionCount")
    }

    override fun onBreakpointDispose(errorMsg: String?) {
        println("BREAKPOINTS LISTENER: onBreakpointDispose error $errorMsg")
    }
}
