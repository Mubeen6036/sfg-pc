package mubeen.springframework.sfgpc.services;

import org.springframework.stereotype.Service;

import mubeen.springframework.sfgpc.model.Pet;
@Service
public interface PetService extends CrudService<Pet, Long>{
}
