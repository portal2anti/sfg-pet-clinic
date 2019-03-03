package com.testhumans.sfgpetclinic.service;

import com.testhumans.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
