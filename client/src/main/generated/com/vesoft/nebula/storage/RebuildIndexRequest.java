/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.storage;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.facebook.thrift.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class RebuildIndexRequest implements TBase, java.io.Serializable, Cloneable, Comparable<RebuildIndexRequest> {
  private static final TStruct STRUCT_DESC = new TStruct("RebuildIndexRequest");
  private static final TField SPACE_ID_FIELD_DESC = new TField("space_id", TType.I32, (short)1);
  private static final TField PARTS_FIELD_DESC = new TField("parts", TType.LIST, (short)2);
  private static final TField INDEX_ID_FIELD_DESC = new TField("index_id", TType.I32, (short)3);
  private static final TField IS_OFFLINE_FIELD_DESC = new TField("is_offline", TType.BOOL, (short)4);

  public int space_id;
  public List<Integer> parts;
  public int index_id;
  public boolean is_offline;
  public static final int SPACE_ID = 1;
  public static final int PARTS = 2;
  public static final int INDEX_ID = 3;
  public static final int IS_OFFLINE = 4;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments
  private static final int __SPACE_ID_ISSET_ID = 0;
  private static final int __INDEX_ID_ISSET_ID = 1;
  private static final int __IS_OFFLINE_ISSET_ID = 2;
  private BitSet __isset_bit_vector = new BitSet(3);

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(SPACE_ID, new FieldMetaData("space_id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(PARTS, new FieldMetaData("parts", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.I32))));
    tmpMetaDataMap.put(INDEX_ID, new FieldMetaData("index_id", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(IS_OFFLINE, new FieldMetaData("is_offline", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(RebuildIndexRequest.class, metaDataMap);
  }

  public RebuildIndexRequest() {
  }

  public RebuildIndexRequest(
    int space_id,
    List<Integer> parts,
    int index_id,
    boolean is_offline)
  {
    this();
    this.space_id = space_id;
    setSpace_idIsSet(true);
    this.parts = parts;
    this.index_id = index_id;
    setIndex_idIsSet(true);
    this.is_offline = is_offline;
    setIs_offlineIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RebuildIndexRequest(RebuildIndexRequest other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.space_id = TBaseHelper.deepCopy(other.space_id);
    if (other.isSetParts()) {
      this.parts = TBaseHelper.deepCopy(other.parts);
    }
    this.index_id = TBaseHelper.deepCopy(other.index_id);
    this.is_offline = TBaseHelper.deepCopy(other.is_offline);
  }

  public RebuildIndexRequest deepCopy() {
    return new RebuildIndexRequest(this);
  }

  @Deprecated
  public RebuildIndexRequest clone() {
    return new RebuildIndexRequest(this);
  }

  public int  getSpace_id() {
    return this.space_id;
  }

  public RebuildIndexRequest setSpace_id(int space_id) {
    this.space_id = space_id;
    setSpace_idIsSet(true);
    return this;
  }

  public void unsetSpace_id() {
    __isset_bit_vector.clear(__SPACE_ID_ISSET_ID);
  }

  // Returns true if field space_id is set (has been assigned a value) and false otherwise
  public boolean isSetSpace_id() {
    return __isset_bit_vector.get(__SPACE_ID_ISSET_ID);
  }

  public void setSpace_idIsSet(boolean value) {
    __isset_bit_vector.set(__SPACE_ID_ISSET_ID, value);
  }

  public List<Integer>  getParts() {
    return this.parts;
  }

  public RebuildIndexRequest setParts(List<Integer> parts) {
    this.parts = parts;
    return this;
  }

  public void unsetParts() {
    this.parts = null;
  }

  // Returns true if field parts is set (has been assigned a value) and false otherwise
  public boolean isSetParts() {
    return this.parts != null;
  }

  public void setPartsIsSet(boolean value) {
    if (!value) {
      this.parts = null;
    }
  }

  public int  getIndex_id() {
    return this.index_id;
  }

  public RebuildIndexRequest setIndex_id(int index_id) {
    this.index_id = index_id;
    setIndex_idIsSet(true);
    return this;
  }

  public void unsetIndex_id() {
    __isset_bit_vector.clear(__INDEX_ID_ISSET_ID);
  }

  // Returns true if field index_id is set (has been assigned a value) and false otherwise
  public boolean isSetIndex_id() {
    return __isset_bit_vector.get(__INDEX_ID_ISSET_ID);
  }

  public void setIndex_idIsSet(boolean value) {
    __isset_bit_vector.set(__INDEX_ID_ISSET_ID, value);
  }

  public boolean  isIs_offline() {
    return this.is_offline;
  }

  public RebuildIndexRequest setIs_offline(boolean is_offline) {
    this.is_offline = is_offline;
    setIs_offlineIsSet(true);
    return this;
  }

  public void unsetIs_offline() {
    __isset_bit_vector.clear(__IS_OFFLINE_ISSET_ID);
  }

  // Returns true if field is_offline is set (has been assigned a value) and false otherwise
  public boolean isSetIs_offline() {
    return __isset_bit_vector.get(__IS_OFFLINE_ISSET_ID);
  }

  public void setIs_offlineIsSet(boolean value) {
    __isset_bit_vector.set(__IS_OFFLINE_ISSET_ID, value);
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case SPACE_ID:
      if (value == null) {
        unsetSpace_id();
      } else {
        setSpace_id((Integer)value);
      }
      break;

    case PARTS:
      if (value == null) {
        unsetParts();
      } else {
        setParts((List<Integer>)value);
      }
      break;

    case INDEX_ID:
      if (value == null) {
        unsetIndex_id();
      } else {
        setIndex_id((Integer)value);
      }
      break;

    case IS_OFFLINE:
      if (value == null) {
        unsetIs_offline();
      } else {
        setIs_offline((Boolean)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case SPACE_ID:
      return new Integer(getSpace_id());

    case PARTS:
      return getParts();

    case INDEX_ID:
      return new Integer(getIndex_id());

    case IS_OFFLINE:
      return new Boolean(isIs_offline());

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case SPACE_ID:
      return isSetSpace_id();
    case PARTS:
      return isSetParts();
    case INDEX_ID:
      return isSetIndex_id();
    case IS_OFFLINE:
      return isSetIs_offline();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RebuildIndexRequest)
      return this.equals((RebuildIndexRequest)that);
    return false;
  }

  public boolean equals(RebuildIndexRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_space_id = true;
    boolean that_present_space_id = true;
    if (this_present_space_id || that_present_space_id) {
      if (!(this_present_space_id && that_present_space_id))
        return false;
      if (!TBaseHelper.equalsNobinary(this.space_id, that.space_id))
        return false;
    }

    boolean this_present_parts = true && this.isSetParts();
    boolean that_present_parts = true && that.isSetParts();
    if (this_present_parts || that_present_parts) {
      if (!(this_present_parts && that_present_parts))
        return false;
      if (!TBaseHelper.equalsNobinary(this.parts, that.parts))
        return false;
    }

    boolean this_present_index_id = true;
    boolean that_present_index_id = true;
    if (this_present_index_id || that_present_index_id) {
      if (!(this_present_index_id && that_present_index_id))
        return false;
      if (!TBaseHelper.equalsNobinary(this.index_id, that.index_id))
        return false;
    }

    boolean this_present_is_offline = true;
    boolean that_present_is_offline = true;
    if (this_present_is_offline || that_present_is_offline) {
      if (!(this_present_is_offline && that_present_is_offline))
        return false;
      if (!TBaseHelper.equalsNobinary(this.is_offline, that.is_offline))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_space_id = true;
    builder.append(present_space_id);
    if (present_space_id)
      builder.append(space_id);

    boolean present_parts = true && (isSetParts());
    builder.append(present_parts);
    if (present_parts)
      builder.append(parts);

    boolean present_index_id = true;
    builder.append(present_index_id);
    if (present_index_id)
      builder.append(index_id);

    boolean present_is_offline = true;
    builder.append(present_is_offline);
    if (present_is_offline)
      builder.append(is_offline);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(RebuildIndexRequest other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSpace_id()).compareTo(other.isSetSpace_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(space_id, other.space_id);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetParts()).compareTo(other.isSetParts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(parts, other.parts);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetIndex_id()).compareTo(other.isSetIndex_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(index_id, other.index_id);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetIs_offline()).compareTo(other.isSetIs_offline());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(is_offline, other.is_offline);
    if (lastComparison != 0) {
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case SPACE_ID:
          if (field.type == TType.I32) {
            this.space_id = iprot.readI32();
            setSpace_idIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case PARTS:
          if (field.type == TType.LIST) {
            {
              TList _list224 = iprot.readListBegin();
              this.parts = new ArrayList<Integer>(Math.max(0, _list224.size));
              for (int _i225 = 0; 
                   (_list224.size < 0) ? iprot.peekList() : (_i225 < _list224.size); 
                   ++_i225)
              {
                int _elem226;
                _elem226 = iprot.readI32();
                this.parts.add(_elem226);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case INDEX_ID:
          if (field.type == TType.I32) {
            this.index_id = iprot.readI32();
            setIndex_idIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case IS_OFFLINE:
          if (field.type == TType.BOOL) {
            this.is_offline = iprot.readBool();
            setIs_offlineIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(SPACE_ID_FIELD_DESC);
    oprot.writeI32(this.space_id);
    oprot.writeFieldEnd();
    if (this.parts != null) {
      oprot.writeFieldBegin(PARTS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.I32, this.parts.size()));
        for (int _iter227 : this.parts)        {
          oprot.writeI32(_iter227);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(INDEX_ID_FIELD_DESC);
    oprot.writeI32(this.index_id);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(IS_OFFLINE_FIELD_DESC);
    oprot.writeBool(this.is_offline);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(DEFAULT_PRETTY_PRINT);
  }

  @Override
  public String toString(boolean prettyPrint) {
    return toString(1, prettyPrint);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("RebuildIndexRequest");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("space_id");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getSpace_id(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("parts");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getParts() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getParts(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("index_id");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getIndex_id(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("is_offline");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. isIs_offline(), indent + 1, prettyPrint));
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

