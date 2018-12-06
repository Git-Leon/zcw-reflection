package com.zipcodewilmington.generic.identifiables;

/**
 * @author leon on 05/12/2018.
 */
public class ActionFigure implements IdentifiableInterface<Long> {
    private Long serialNumber;

    @Override
    public Long getIdentity() {
        return null;
    }

    @Override
    public Class<Long> getIdentityType() {
        return null;
    }
}
