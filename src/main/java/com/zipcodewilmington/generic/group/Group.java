package com.zipcodewilmington.generic.group;

import com.zipcodewilmington.generic.identifiables.IdentifiableInterface;

import java.io.Serializable;
import java.util.List;
import java.util.function.Predicate;

public class Group<
        TypeOfId extends Serializable,
        TypeOfEntity extends IdentifiableInterface<TypeOfId>>
        extends AbstractGroup<TypeOfId, TypeOfEntity> {

    public Integer count() {
        return null;
    }

    public void insert(TypeOfEntity object) {
    }

    public void delete(TypeOfEntity object) {
    }

    public void delete(TypeOfId id) {
    }

    public Boolean has(TypeOfEntity object) {
        return false;
    }

    public Boolean has(TypeOfId id) {
        return null;
    }

    public List<TypeOfEntity> filter(Predicate<TypeOfEntity> predicate) {
        return null;
    }
}