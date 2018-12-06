package com.zipcodewilmington.generic.supergroup;

import com.zipcodewilmington.generic.group.*;
import com.zipcodewilmington.generic.identifiables.IdentifiableInterface;
import com.zipcodewilmington.generic.identifiables.Person;
import org.junit.Assert;
import org.junit.Test;

import java.io.Serializable;
import java.util.function.Supplier;

/**
 * @author leon on 06/12/2018.
 */
public class AddTest {
    @Test
    public void addToPersonSuperGroup() {
        Supplier<?> superPersonGroupSupplier = PersonSuperGroup::new;
        Supplier<? extends SuperGroupInterface> superGroupSupplier = (Supplier<? extends SuperGroupInterface>) (superPersonGroupSupplier);

        Supplier<?> personGroupSupplier = Group<String, Person>::new;
        Supplier<? extends GroupInterface> groupSupplier = (Supplier<? extends GroupInterface>) (personGroupSupplier);

        this.<String, Person, Group<String, Person>, PersonSuperGroup>
                addTest(superGroupSupplier, groupSupplier, 10);
    }


    // Method Signature
    private <TypeOfId extends Serializable,
            TypeOfIdentifiable extends IdentifiableInterface<TypeOfId>,
            TypeOfGroup extends GroupInterface<TypeOfId, TypeOfIdentifiable>,
            TypeOfSuperGroup extends SuperGroupInterface<TypeOfId, TypeOfIdentifiable, TypeOfGroup>>
    void addTest( // Method Parameters
                  Supplier<? extends SuperGroupInterface> superGroupSupplier,
                  Supplier<? extends GroupInterface> groupSupplier,
                  Integer numberOfGroupsToAdd) {

        TypeOfSuperGroup superGroup = (TypeOfSuperGroup) superGroupSupplier.get();

        // when
        for (int i = 0; i < numberOfGroupsToAdd; i++) {
            TypeOfGroup group = (TypeOfGroup) groupSupplier.get();
            superGroup.addGroup(group);

            // then
            Assert.assertTrue(superGroup.hasGroup(group));
        }

    }
}
