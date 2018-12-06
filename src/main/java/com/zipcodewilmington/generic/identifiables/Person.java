package com.zipcodewilmington.generic.identifiables;

/**
 * @author leon on 05/12/2018.
 */
public class Person implements IdentifiableInterface<String> {
    private String name;

    @Override
    public String getIdentity() {
        return name;
    }

    @Override
    public Class<? extends String> getIdentityType() {
        return getIdentity().getClass();
    }
}
