package com.zipcodewilmington.generic.group;

import com.zipcodewilmington.generic.identifiables.ActionFigure;
import javafx.util.Pair;

/**
 * @author leon on 06/12/2018.
 */
public class ActionFigureSuperGroup extends SuperGroup<Long, ActionFigure, GroupInterface<Long, ActionFigure>> {
    @Override
    public Class<? extends Long> getTypeOfId() {
        return null;
    }

    @Override
    public Class<? extends ActionFigure> getTypeOfIdentifiable() {
        return null;
    }

    @Override
    public Class<? extends GroupInterface<Long, ActionFigure>> getGroupType() {
        return null;
    }

    @Override
    public void addGroup(GroupInterface<Long, ActionFigure> longActionFigureGroupInterface) {

    }

    @Override
    public void removeGroup(GroupInterface<Long, ActionFigure> longActionFigureGroupInterface) {

    }

    @Override
    public Boolean hasGroup(GroupInterface<Long, ActionFigure> longActionFigureGroupInterface) {
        return null;
    }

    @Override
    public GroupInterface<Long, ActionFigure> getGroup(Integer index) {
        return null;
    }
}
