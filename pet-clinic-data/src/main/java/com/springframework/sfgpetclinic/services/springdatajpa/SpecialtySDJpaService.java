package com.springframework.sfgpetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.springframework.sfgpetclinic.model.Specialty;
import com.springframework.sfgpetclinic.repositories.SpecialtyRepository;
import com.springframework.sfgpetclinic.services.SpecialtyService;

@Service
@Profile("springdatajpa")
public class SpecialtySDJpaService implements SpecialtyService {

	private final SpecialtyRepository specialtyRepository;
	
	
	public SpecialtySDJpaService(SpecialtyRepository specialtyRepository) {
		this.specialtyRepository = specialtyRepository;
	}

	@Override
	public Set<Specialty> findAll() {
		Set<Specialty> specialties = new HashSet<>();
		this.specialtyRepository.findAll().forEach(specialties::add);
		return specialties;
	}

	@Override
	public Specialty findById(Long id) {
		return this.specialtyRepository.findById(id).orElse(null);
	}

	@Override
	public Specialty save(Specialty object) {
		return this.specialtyRepository.save(object);
	}

	@Override
	public void delete(Specialty object) {
		this.specialtyRepository.delete(object);	
	}

	@Override
	public void deleteById(Long id) {
		this.specialtyRepository.deleteById(id);
		
	}


}
