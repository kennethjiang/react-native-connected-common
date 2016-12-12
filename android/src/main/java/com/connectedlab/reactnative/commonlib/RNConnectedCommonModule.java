
package com.connectedlab.reactnative.commonlib;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNConnectedCommonModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNConnectedCommonModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNConnectedCommon";
  }
}