package com.github.junlong.trace;

/**
 * app trace
 * @author junlong
 */
public class Trace {
    private String className;
    private String methodName;
    private String fileName;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "Trace{" +
                "className='" + className + '\'' +
                ", methodName='" + methodName + '\'' +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}
