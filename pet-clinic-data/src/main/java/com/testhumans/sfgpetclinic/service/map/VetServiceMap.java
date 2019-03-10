package com.testhumans.sfgpetclinic.service.map;

import com.testhumans.sfgpetclinic.model.Owner;
import com.testhumans.sfgpetclinic.model.Person;
import com.testhumans.sfgpetclinic.model.Vet;
import com.testhumans.sfgpetclinic.service.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.deleteByObject(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
