package com.zipcodewilmington.generic.group;

import com.zipcodewilmington.generic.identifiables.IdentifiableInterface;

import java.io.Serializable;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author leon on 06/12/2018.
 */
public class Group<ChangeThisTypeRespectively,ChangeThisOneToo> extends AbstractGroup{
    @Override
    public Integer count() {
        return null;
    }

    @Override
    public void insert(IdentifiableInterface object) {

    }

    @Override
    public void delete(IdentifiableInterface object) {

    }

    @Override
    public void delete(Serializable serializable) {

    }

    @Override
    public Boolean has(IdentifiableInterface object) {
        return null;
    }

    @Override
    public Boolean has(Serializable serializable) {
        return null;
    }

    @Override
    public List filter(Predicate predicate) {
        return null;
    }
}
