package mubeen.springframework.sfgpc.services;

import java.util.Set;

import mubeen.springframework.sfgpc.model.Vet;


public interface VetService {
	Vet findById(Long id);
	Vet save(Vet vet);
	Set<Vet> findAll();
}
