package com.zipcodewilmington.generic.identifiables;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 06/12/2018.
 */
public class PersonTest {
    @Test
    public void testImplementation() {
        Assert.assertTrue(new Person() instanceof IdentifiableInterface);
    }

    @Test
    public void testGetIdentityType() {
        Assert.assertEquals(new Person().getIdentityType(), String.class);
    }
}
