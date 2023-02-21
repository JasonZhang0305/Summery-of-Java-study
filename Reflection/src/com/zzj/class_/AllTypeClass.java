package com.zzj.class_;

import java.io.Serializable;

public class AllTypeClass {
    public static void main(String[] args) {
        Class<String> cls1 = String.class;
        Class<Serializable> serializableClass = Serializable.class;//Interface
        Class<Integer[]> aClass = Integer[].class;//Array
        Class<float[][]> aClass1 = float[][].class;// 2-d Array
        Class<Deprecated> deprecatedClass = Deprecated.class;//Annotation
        Class<Thread.State> stateClass = Thread.State.class;//Enum
        Class<Long> longClass = long.class;
        Class<Void> voidClass = void.class;
        Class<Class> classClass = Class.class;
    }
}
