package com.springframework.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.springframework.sfgpetclinic.model.Specialty;
import com.springframework.sfgpetclinic.services.SpecialtiesService;

@Service
public class SpecialtyMapService extends AbstractMapService<Specialty, Long> implements SpecialtiesService {

	@Override
	public Set<Specialty> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Specialty findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Specialty save(Specialty object) {
		// TODO Auto-generated method stub
		return super.save(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public void delete(Specialty object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

}
