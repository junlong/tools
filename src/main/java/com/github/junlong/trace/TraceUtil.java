package com.github.junlong.trace;

import java.util.ArrayList;
import java.util.List;

public class TraceUtil {
    /**
     * print stack trace
     */
    public static List<Trace> trace() {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();

        List<Trace> traces = new ArrayList<Trace>(elements.length);
        for (StackTraceElement e : elements) {
            Trace trace = new Trace();
            trace.setClassName(e.getClassName());
            trace.setFileName(e.getFileName());
            trace.setMethodName(e.getMethodName());
            traces.add(trace);
        }

        return traces;
    }
}
