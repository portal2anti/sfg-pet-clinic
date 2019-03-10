package com.testhumans.sfgpetclinic.service.map;

import com.testhumans.sfgpetclinic.model.Owner;
import com.testhumans.sfgpetclinic.model.Person;
import com.testhumans.sfgpetclinic.service.CrudService;

import java.util.Set;

public class PersonServiceMap extends AbstractMapService<Person, Long> implements CrudService<Person, Long> {
    @Override
    public Set<Person> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Person save(Person object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Person object) {
        super.deleteByObject(object);
    }

    @Override
    public Person findById(Long id) {
        return super.findById(id);
    }
}
