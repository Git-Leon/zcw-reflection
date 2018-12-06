package com.zipcodewilmington.generic.group;

import com.zipcodewilmington.generic.identifiables.IdentifiableInterface;
import javafx.util.Pair;

import java.io.Serializable;

/**
 * @author leon on 06/12/2018.
 * Yeah sure, let's have fun with it? ¯\_(ツ)_/¯
 * @ATTENTION_TO_STUDENTS - You are forbidden from modifying this interface
 */
public interface SuperGroupInterface<
        TypeOfId extends Serializable,
        TypeOfIdentifiable extends IdentifiableInterface<TypeOfId>,
        TypeOfGroup extends GroupInterface<TypeOfId, TypeOfIdentifiable>> {

    Class<? extends TypeOfId> getTypeOfId();
    Class<? extends TypeOfIdentifiable> getTypeOfIdentifiable();
    Class<? extends TypeOfGroup> getGroupType();
    void addGroup(TypeOfGroup group);
    void removeGroup(TypeOfGroup group);
    Boolean hasGroup(TypeOfGroup group);
    TypeOfGroup getGroup(Integer index);
}


