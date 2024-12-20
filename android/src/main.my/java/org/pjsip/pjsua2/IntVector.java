/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class IntVector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected IntVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IntVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_IntVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public IntVector() {
    this(pjsua2JNI.new_IntVector__SWIG_0(), true);
  }

  public IntVector(long n) {
    this(pjsua2JNI.new_IntVector__SWIG_1(n), true);
  }

  public long size() {
    return pjsua2JNI.IntVector_size(swigCPtr, this);
  }

  public long capacity() {
    return pjsua2JNI.IntVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    pjsua2JNI.IntVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return pjsua2JNI.IntVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    pjsua2JNI.IntVector_clear(swigCPtr, this);
  }

  public void add(int x) {
    pjsua2JNI.IntVector_add(swigCPtr, this, x);
  }

  public int get(int i) {
    return pjsua2JNI.IntVector_get(swigCPtr, this, i);
  }

  public void set(int i, int val) {
    pjsua2JNI.IntVector_set(swigCPtr, this, i, val);
  }

}
