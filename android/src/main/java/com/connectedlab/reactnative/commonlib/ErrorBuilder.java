package com.connectedlab.reactnative.commonlib;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

import org.apache.commons.lang3.exception.ExceptionUtils;

/**
 * Builds errors.
 */
public class ErrorBuilder {

    /**
     * @return error like object with keys "name", "message", "stack".
     */
    public WritableMap toJavaScriptError(Throwable exception) {
        WritableMap error = Arguments.createMap();
        error.putString("name", exception.getClass().getSimpleName());
        error.putString("message", exception.toString());
        error.putString("stack", ExceptionUtils.getStackTrace(exception));
        return error;
    }

    /**
     * @see #toJavaScriptError(Throwable)
     */
    public WritableMap toJavaScriptError(String message) {
        return toJavaScriptError(new RuntimeException(message));
    }
}
