package com.springframework.sfgpetclinic.services;

import java.util.Set;

import com.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

	Set<Owner> findByLastName(String lastName);
}
