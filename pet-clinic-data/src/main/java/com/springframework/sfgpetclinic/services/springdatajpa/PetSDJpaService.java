package com.springframework.sfgpetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.springframework.sfgpetclinic.model.Pet;
import com.springframework.sfgpetclinic.repositories.PetRepository;
import com.springframework.sfgpetclinic.services.PetService;

@Service
@Profile("springdatajpa")
public class PetSDJpaService implements PetService {

	private final PetRepository petRepository; 
	
	public PetSDJpaService(PetRepository petRepository) {
		this.petRepository = petRepository;
	}

	@Override
	public Set<Pet> findAll() {
		Set<Pet> pets = new HashSet<>();
		this.petRepository.findAll().forEach(pets::add);
		return pets;
	}

	@Override
	public Pet findById(Long id) {
		return this.petRepository.findById(id).orElse(null);
	}

	@Override
	public Pet save(Pet object) {
		return this.petRepository.save(object);
	}

	@Override
	public void delete(Pet object) {
		this.petRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		this.petRepository.deleteById(id);
	}

}
