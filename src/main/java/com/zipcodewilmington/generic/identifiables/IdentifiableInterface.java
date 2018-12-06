package com.zipcodewilmington.generic.identifiables;

import java.io.Serializable;

/**
 * @author leon on 05/12/2018.
 */
public interface IdentifiableInterface<TypeOfId extends Serializable> {
    TypeOfId getIdentity();
    Class<? extends TypeOfId> getIdentityType();
}
