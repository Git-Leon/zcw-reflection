package com.zipcodewilmington.generic.reflectionutils;

import sun.reflect.generics.reflectiveObjects.TypeVariableImpl;
import sun.reflect.generics.tree.FieldTypeSignature;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author leon on 05/12/2018.
 */
public class ClassWrapper {
    private final TypeVariableImpl type;
    private final Object object;

    public ClassWrapper(Object o, int parameterizedIndex) {
        Class<?>  cls = o.getClass();
        Type superType = cls.getGenericSuperclass();
        ParameterizedType parameterizedClassType = (ParameterizedType)superType;
        Type[] parameterizedTypes = parameterizedClassType.getActualTypeArguments();
        Type typeOfClassParameterization = parameterizedTypes[parameterizedIndex];
        this.object = o;
        this.type = (TypeVariableImpl) typeOfClassParameterization;
    }

    public Field getBoundASTsAsField() {
        Field f = null;
        try {
            f = type.getClass().getDeclaredField("boundASTs");
            f.setAccessible(true);
        } catch (Throwable e) {
            throw new Error(e);
        }
        return f;
    }

    public FieldTypeSignatureWrapper getFieldTypeSignatureWrapper(){
        Field boundASTs = getBoundASTsAsField();
        FieldTypeSignature[] f;
        try {
            f = (FieldTypeSignature[]) boundASTs.get(type);
            return new FieldTypeSignatureWrapper(f);
        } catch (IllegalAccessException e) {
            throw new Error(e);
        }

    }
}
