package mubeen.springframework.sfgpc.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import mubeen.springframework.sfgpc.model.Pet;
import mubeen.springframework.sfgpc.services.PetService;
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService{

	@Override
	public Pet save(Pet object) {
		// TODO Auto-generated method stub
		return super.save(object.getId(), object);
	}
	
	@Override
	public void delete(Pet object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}
	
	@Override
	public Set<Pet> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}
	
    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
    
    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    } 

}
