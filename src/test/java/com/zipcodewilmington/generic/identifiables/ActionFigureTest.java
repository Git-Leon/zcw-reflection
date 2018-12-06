package com.zipcodewilmington.generic.identifiables;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author leon on 06/12/2018.
 */
public class ActionFigureTest {
    ActionFigure actionFigure = new ActionFigure();

    @Test
    public void testImplementation() {
        Assert.assertTrue(actionFigure instanceof IdentifiableInterface);
    }

    @Test
    public void testGetIdentityType() {
        Assert.assertEquals(actionFigure.getIdentityType(), Long.class);
    }
}
