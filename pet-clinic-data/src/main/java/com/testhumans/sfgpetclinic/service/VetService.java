package com.testhumans.sfgpetclinic.service;

import com.testhumans.sfgpetclinic.model.Vet;

public interface VetService extends CrudService<Vet, Long>{

    Vet findByLastName(String lastName);

}
