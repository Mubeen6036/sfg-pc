package mubeen.springframework.sfgpc.services;

import java.util.Set;

import mubeen.springframework.sfgpc.model.Pet;

public interface PetService {
	Pet findById(Long id);
	Pet save(Pet pet);
	Set<Pet> findAll();
}
