/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula;


import java.lang.reflect.*;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import com.facebook.thrift.IntRangeSet;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({ "unused" })
public class NullType {
  public static final int __NULL__ = 0;
  public static final int NaN = 1;
  public static final int BAD_DATA = 2;
  public static final int BAD_TYPE = 3;
  public static final int ERR_OVERFLOW = 4;
  public static final int UNKNOWN_PROP = 5;
  public static final int DIV_BY_ZERO = 6;
  public static final int OUT_OF_RANGE = 7;

  public static final IntRangeSet VALID_VALUES;
  public static final Map<Integer, String> VALUES_TO_NAMES = new HashMap<Integer, String>();

  static {
    try {
      Class<?> klass = NullType.class;
      for (Field f : klass.getDeclaredFields()) {
        if (f.getType() == Integer.TYPE) {
          VALUES_TO_NAMES.put(f.getInt(null), f.getName());
        }
      }
    } catch (ReflectiveOperationException e) {
      throw new AssertionError(e);
    }

    int[] values = new int[VALUES_TO_NAMES.size()];
    int i = 0;
    for (Integer v : VALUES_TO_NAMES.keySet()) {
      values[i++] = v;
    }

    VALID_VALUES = new IntRangeSet(values);
  }
}