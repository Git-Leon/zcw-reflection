package com.zipcodewilmington.generic.group;

import com.zipcodewilmington.generic.identifiables.IdentifiableInterface;

import java.io.Serializable;

/**
 * @author leon on 06/12/2018.
 */
public abstract class SuperGroup<
        TypeOfId extends Serializable,
        TypeOfIdentifiable extends IdentifiableInterface<TypeOfId>,
        TypeOfGroup extends GroupInterface<TypeOfId, TypeOfIdentifiable>>
        implements SuperGroupInterface<TypeOfId, TypeOfIdentifiable, TypeOfGroup> {
}