package mubeen.springframework.sfgpc.services.map;

import java.util.Set;

import mubeen.springframework.sfgpc.model.Vet;
import mubeen.springframework.sfgpc.services.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long>{

	@Override
	public Vet save(Vet object) {
		// TODO Auto-generated method stub
		return super.save(object.getId(), object);
	}

	@Override
	public void delete(Vet object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}
	
	@Override
	public Set<Vet> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}
	
    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
    
    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }


}
