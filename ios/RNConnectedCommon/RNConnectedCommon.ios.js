/**
 * @providesModule RNConnectedCommon
 * @flow
 */
'use strict';

var NativeRNConnectedCommon = require('NativeModules').RNConnectedCommon;

/**
 * High-level docs for the RNConnectedCommon iOS API can be written here.
 */

var RNConnectedCommon = {
  test: function() {
    NativeRNConnectedCommon.test();
  }
};

module.exports = RNConnectedCommon;
