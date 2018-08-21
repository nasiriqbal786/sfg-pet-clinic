package com.springframework.sfgpetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.springframework.sfgpetclinic.model.Vet;
import com.springframework.sfgpetclinic.repositories.VetRepository;
import com.springframework.sfgpetclinic.services.VetService;

@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService {

	private final VetRepository vetRepository;
	
	public VetSDJpaService(VetRepository vetRepository) {
		this.vetRepository = vetRepository;
	}

	@Override
	public Set<Vet> findAll() {
		Set<Vet> vets = new HashSet<>();
		vetRepository.findAll().forEach(vets::add);
		return vets;
	}

	@Override
	public Vet findById(Long id) {
		return this.vetRepository.findById(id).orElse(null);
	}

	@Override
	public Vet save(Vet object) {
		return this.vetRepository.save(object);
	}

	@Override
	public void delete(Vet object) {
		this.vetRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		this.vetRepository.deleteById(id);
	}

}
