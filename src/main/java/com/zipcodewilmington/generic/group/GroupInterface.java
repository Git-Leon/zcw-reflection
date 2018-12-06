package com.zipcodewilmington.generic.group;

import com.zipcodewilmington.generic.identifiables.IdentifiableInterface;

import java.io.Serializable;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author leon on 05/12/2018.
 */
public interface GroupInterface<
        TypeOfId extends Serializable,
        TypeOfEntity extends IdentifiableInterface<TypeOfId>> {

   Integer count();

   void insert(TypeOfEntity object);
    
   void delete(TypeOfEntity object);

   void delete(TypeOfId id);

   Boolean has(TypeOfEntity object);

   Boolean has(TypeOfId id);

   List<TypeOfEntity> filter(Predicate<TypeOfEntity> predicate);
}
