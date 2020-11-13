// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: io/flights/cabin_codes/cabin_codes.proto

package com.passkit.grpc.Flights.CabinCodes;

public final class CabinCodes {
  private CabinCodes() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * Compartment Code descriptions represent most frequently used classes. Airlines have discretion on how they use these codes.
   * </pre>
   *
   * Protobuf enum {@code cabin_codes.CompartmentCode}
   */
  public enum CompartmentCode
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Compartment code not provided
     * </pre>
     *
     * <code>NONE = 0;</code>
     */
    NONE(0),
    /**
     * <pre>
     * First class suite (previously supersonic)
     * </pre>
     *
     * <code>R = 1;</code>
     */
    R(1),
    /**
     * <pre>
     * First class premium
     * </pre>
     *
     * <code>P = 2;</code>
     */
    P(2),
    /**
     * <pre>
     * First class
     * </pre>
     *
     * <code>F = 3;</code>
     */
    F(3),
    /**
     * <pre>
     * First class discounted
     * </pre>
     *
     * <code>A = 4;</code>
     */
    A(4),
    /**
     * <pre>
     * Business class premium
     * </pre>
     *
     * <code>J = 5;</code>
     */
    J(5),
    /**
     * <pre>
     * Business class
     * </pre>
     *
     * <code>C = 6;</code>
     */
    C(6),
    /**
     * <pre>
     * Business class discounted
     * </pre>
     *
     * <code>D = 7;</code>
     */
    D(7),
    /**
     * <pre>
     * Business class discounted
     * </pre>
     *
     * <code>I = 8;</code>
     */
    I(8),
    /**
     * <pre>
     * Business class discounted
     * </pre>
     *
     * <code>Z = 9;</code>
     */
    Z(9),
    /**
     * <pre>
     * Premium economy
     * </pre>
     *
     * <code>W = 10;</code>
     */
    W(10),
    /**
     * <pre>
     * Premium economy discounted
     * </pre>
     *
     * <code>E = 11;</code>
     */
    E(11),
    /**
     * <pre>
     * Economy
     * </pre>
     *
     * <code>S = 12;</code>
     */
    S(12),
    /**
     * <pre>
     * Economy
     * </pre>
     *
     * <code>Y = 13;</code>
     */
    Y(13),
    /**
     * <pre>
     * Economy discounted
     * </pre>
     *
     * <code>B = 14;</code>
     */
    B(14),
    /**
     * <pre>
     * Economy discounted
     * </pre>
     *
     * <code>H = 15;</code>
     */
    H(15),
    /**
     * <pre>
     * Economy discounted
     * </pre>
     *
     * <code>K = 16;</code>
     */
    K(16),
    /**
     * <pre>
     * Economy discounted
     * </pre>
     *
     * <code>L = 17;</code>
     */
    L(17),
    /**
     * <pre>
     * Economy discounted
     * </pre>
     *
     * <code>M = 18;</code>
     */
    M(18),
    /**
     * <pre>
     * Economy discounted
     * </pre>
     *
     * <code>N = 19;</code>
     */
    N(19),
    /**
     * <pre>
     * Economy discounted
     * </pre>
     *
     * <code>O = 20;</code>
     */
    O(20),
    /**
     * <pre>
     * Economy discounted
     * </pre>
     *
     * <code>Q = 21;</code>
     */
    Q(21),
    /**
     * <pre>
     * Premium economy discounted / Economy discounted
     * </pre>
     *
     * <code>T = 22;</code>
     */
    T(22),
    /**
     * <pre>
     * Economy discounted
     * </pre>
     *
     * <code>V = 23;</code>
     */
    V(23),
    /**
     * <pre>
     * Economy discounted
     * </pre>
     *
     * <code>X = 24;</code>
     */
    X(24),
    /**
     * <pre>
     * Conditional reservation
     * </pre>
     *
     * <code>G = 25;</code>
     */
    G(25),
    /**
     * <pre>
     * Shuttle service
     * </pre>
     *
     * <code>U = 26;</code>
     */
    U(26),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Compartment code not provided
     * </pre>
     *
     * <code>NONE = 0;</code>
     */
    public static final int NONE_VALUE = 0;
    /**
     * <pre>
     * First class suite (previously supersonic)
     * </pre>
     *
     * <code>R = 1;</code>
     */
    public static final int R_VALUE = 1;
    /**
     * <pre>
     * First class premium
     * </pre>
     *
     * <code>P = 2;</code>
     */
    public static final int P_VALUE = 2;
    /**
     * <pre>
     * First class
     * </pre>
     *
     * <code>F = 3;</code>
     */
    public static final int F_VALUE = 3;
    /**
     * <pre>
     * First class discounted
     * </pre>
     *
     * <code>A = 4;</code>
     */
    public static final int A_VALUE = 4;
    /**
     * <pre>
     * Business class premium
     * </pre>
     *
     * <code>J = 5;</code>
     */
    public static final int J_VALUE = 5;
    /**
     * <pre>
     * Business class
     * </pre>
     *
     * <code>C = 6;</code>
     */
    public static final int C_VALUE = 6;
    /**
     * <pre>
     * Business class discounted
     * </pre>
     *
     * <code>D = 7;</code>
     */
    public static final int D_VALUE = 7;
    /**
     * <pre>
     * Business class discounted
     * </pre>
     *
     * <code>I = 8;</code>
     */
    public static final int I_VALUE = 8;
    /**
     * <pre>
     * Business class discounted
     * </pre>
     *
     * <code>Z = 9;</code>
     */
    public static final int Z_VALUE = 9;
    /**
     * <pre>
     * Premium economy
     * </pre>
     *
     * <code>W = 10;</code>
     */
    public static final int W_VALUE = 10;
    /**
     * <pre>
     * Premium economy discounted
     * </pre>
     *
     * <code>E = 11;</code>
     */
    public static final int E_VALUE = 11;
    /**
     * <pre>
     * Economy
     * </pre>
     *
     * <code>S = 12;</code>
     */
    public static final int S_VALUE = 12;
    /**
     * <pre>
     * Economy
     * </pre>
     *
     * <code>Y = 13;</code>
     */
    public static final int Y_VALUE = 13;
    /**
     * <pre>
     * Economy discounted
     * </pre>
     *
     * <code>B = 14;</code>
     */
    public static final int B_VALUE = 14;
    /**
     * <pre>
     * Economy discounted
     * </pre>
     *
     * <code>H = 15;</code>
     */
    public static final int H_VALUE = 15;
    /**
     * <pre>
     * Economy discounted
     * </pre>
     *
     * <code>K = 16;</code>
     */
    public static final int K_VALUE = 16;
    /**
     * <pre>
     * Economy discounted
     * </pre>
     *
     * <code>L = 17;</code>
     */
    public static final int L_VALUE = 17;
    /**
     * <pre>
     * Economy discounted
     * </pre>
     *
     * <code>M = 18;</code>
     */
    public static final int M_VALUE = 18;
    /**
     * <pre>
     * Economy discounted
     * </pre>
     *
     * <code>N = 19;</code>
     */
    public static final int N_VALUE = 19;
    /**
     * <pre>
     * Economy discounted
     * </pre>
     *
     * <code>O = 20;</code>
     */
    public static final int O_VALUE = 20;
    /**
     * <pre>
     * Economy discounted
     * </pre>
     *
     * <code>Q = 21;</code>
     */
    public static final int Q_VALUE = 21;
    /**
     * <pre>
     * Premium economy discounted / Economy discounted
     * </pre>
     *
     * <code>T = 22;</code>
     */
    public static final int T_VALUE = 22;
    /**
     * <pre>
     * Economy discounted
     * </pre>
     *
     * <code>V = 23;</code>
     */
    public static final int V_VALUE = 23;
    /**
     * <pre>
     * Economy discounted
     * </pre>
     *
     * <code>X = 24;</code>
     */
    public static final int X_VALUE = 24;
    /**
     * <pre>
     * Conditional reservation
     * </pre>
     *
     * <code>G = 25;</code>
     */
    public static final int G_VALUE = 25;
    /**
     * <pre>
     * Shuttle service
     * </pre>
     *
     * <code>U = 26;</code>
     */
    public static final int U_VALUE = 26;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static CompartmentCode valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CompartmentCode forNumber(int value) {
      switch (value) {
        case 0: return NONE;
        case 1: return R;
        case 2: return P;
        case 3: return F;
        case 4: return A;
        case 5: return J;
        case 6: return C;
        case 7: return D;
        case 8: return I;
        case 9: return Z;
        case 10: return W;
        case 11: return E;
        case 12: return S;
        case 13: return Y;
        case 14: return B;
        case 15: return H;
        case 16: return K;
        case 17: return L;
        case 18: return M;
        case 19: return N;
        case 20: return O;
        case 21: return Q;
        case 22: return T;
        case 23: return V;
        case 24: return X;
        case 25: return G;
        case 26: return U;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CompartmentCode>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CompartmentCode> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CompartmentCode>() {
            public CompartmentCode findValueByNumber(int number) {
              return CompartmentCode.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.passkit.grpc.Flights.CabinCodes.CabinCodes.getDescriptor().getEnumTypes().get(0);
    }

    private static final CompartmentCode[] VALUES = values();

    public static CompartmentCode valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private CompartmentCode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:cabin_codes.CompartmentCode)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(io/flights/cabin_codes/cabin_codes.pro" +
      "to\022\013cabin_codes*\321\001\n\017CompartmentCode\022\010\n\004N" +
      "ONE\020\000\022\005\n\001R\020\001\022\005\n\001P\020\002\022\005\n\001F\020\003\022\005\n\001A\020\004\022\005\n\001J\020\005" +
      "\022\005\n\001C\020\006\022\005\n\001D\020\007\022\005\n\001I\020\010\022\005\n\001Z\020\t\022\005\n\001W\020\n\022\005\n\001E" +
      "\020\013\022\005\n\001S\020\014\022\005\n\001Y\020\r\022\005\n\001B\020\016\022\005\n\001H\020\017\022\005\n\001K\020\020\022\005\n" +
      "\001L\020\021\022\005\n\001M\020\022\022\005\n\001N\020\023\022\005\n\001O\020\024\022\005\n\001Q\020\025\022\005\n\001T\020\026\022" +
      "\005\n\001V\020\027\022\005\n\001X\020\030\022\005\n\001G\020\031\022\005\n\001U\020\032Bu\n#com.passk" +
      "it.grpc.Flights.CabinCodesZ7stash.passki" +
      "t.com/io/model/sdk/go/io/flights/cabinco" +
      "des\252\002\024PKFlights.CabinCodesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
