package com.springframework.sfgpetclinic.services.map;

import java.util.Set;

import com.springframework.sfgpetclinic.model.Owner;
import com.springframework.sfgpetclinic.services.CrudService;
import com.springframework.sfgpetclinic.services.OwnerService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService{

	@Override
	public Owner save(Owner object) {
		return super.save(object.getId(), object);
	}

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	Owner save(Long id, Owner object) {
		return super.save(id, object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Owner object) {
		super.delete(object);
	}

	@Override
	public Set<Owner> findByLastName(String lastName) {
		return null;
	}

}
