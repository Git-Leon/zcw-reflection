package com.zipcodewilmington.generic.reflectionutils;

import com.github.git_leon.collectionutils.maps.IntrospectiveMap;
import sun.reflect.generics.tree.ClassTypeSignature;
import sun.reflect.generics.tree.FieldTypeSignature;
import sun.reflect.generics.tree.SimpleClassTypeSignature;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 05/12/2018.
 */
public class FieldTypeSignatureWrapper {
    private final FieldTypeSignature[] fieldTypeSignatures;

    public FieldTypeSignatureWrapper(FieldTypeSignature[] f) {
        this.fieldTypeSignatures = f;
    }

    public String getUpperBoundOfType() {
        String fieldName;
        try {
            FieldTypeSignature fieldTypeSignature = fieldTypeSignatures[0];
            Class<? extends FieldTypeSignature> clss = fieldTypeSignature.getClass();
            Field field = clss.getDeclaredField("path");
            field.setAccessible(true);
            List<? extends SimpleClassTypeSignature> list = (List<? extends SimpleClassTypeSignature>) field.get(fieldTypeSignature);
            Map m = new IntrospectiveMap(list.get(0));

            fieldName = m.get("name").toString();
            System.out.println(fieldName);
            for (SimpleClassTypeSignature s : list) {

            }
        } catch (Throwable e) {
            throw new Error(e);
        }
        return fieldName;
    }
}
