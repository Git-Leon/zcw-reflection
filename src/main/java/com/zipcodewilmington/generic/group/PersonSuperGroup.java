package com.zipcodewilmington.generic.group;

/**
 * @author leon on 06/12/2018.
 */
public class PersonSuperGroup extends SuperGroup {
    @Override
    public Class getTypeOfId() {
        return null;
    }

    @Override
    public Class getTypeOfIdentifiable() {
        return null;
    }

    @Override
    public Class getGroupType() {
        return null;
    }

    @Override
    public void addGroup(GroupInterface groupInterface) {

    }

    @Override
    public void removeGroup(GroupInterface groupInterface) {

    }

    @Override
    public Boolean hasGroup(GroupInterface groupInterface) {
        return null;
    }

    @Override
    public GroupInterface getGroup(Integer index) {
        return null;
    }
}