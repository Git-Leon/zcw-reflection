package com.zipcodewilmington.generic.group;

import com.zipcodewilmington.generic.identifiables.ActionFigure;
import com.zipcodewilmington.generic.identifiables.Person;
import com.zipcodewilmington.reflectionutils.ClassWrapper;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

/**
 * @author leon on 05/12/2018.
 */
public class TestParameterization {
    @Test
    public void testImplementation() {
        Assert.assertTrue(new Group<>() instanceof GroupInterface);
    }

    @Test
    public void testStringAndPersonParameterization() {
        Group<String, Person> personGroup = new Group<>();
        String expectedIdentityType = "java.io.Serializable";
        String expectedIdentifiableType = "com.zipcodewilmington.generic.identifiables.IdentifiableInterface";

        String actualIdentityType = getParameterizedType(personGroup, 0);
        String actualIdentifiableType = getParameterizedType(personGroup, 1);

        Assert.assertEquals(expectedIdentifiableType, actualIdentifiableType);
        Assert.assertEquals(expectedIdentityType, actualIdentityType);
    }


    @Test
    public void testLongAndActionFigureParameterization() {
        Group<Long, ActionFigure> group = new Group<>();
        String expectedIdentityType = "java.io.Serializable";
        String expectedIdentifiableType = "com.zipcodewilmington.generic.identifiables.IdentifiableInterface";

        String actualIdentityType = getParameterizedType(group, 0);
        String actualIdentifiableType = getParameterizedType(group, 1);

        Assert.assertEquals(expectedIdentifiableType, actualIdentifiableType);
        Assert.assertEquals(expectedIdentityType, actualIdentityType);
    }

    public String getParameterizedType(Object o, int parameterizedIndex) {
        return new ClassWrapper(o, parameterizedIndex).getParameterizedType();
    }
}
