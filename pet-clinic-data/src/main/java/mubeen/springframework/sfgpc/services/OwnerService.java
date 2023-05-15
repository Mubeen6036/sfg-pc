package mubeen.springframework.sfgpc.services;

import java.util.Set;

import mubeen.springframework.sfgpc.model.Owner;

public interface OwnerService {
	Owner findById(Long id);
	Owner save(Owner owner);
	Set<Owner> findAll();
	Owner findByLastName(String lastName);
}
