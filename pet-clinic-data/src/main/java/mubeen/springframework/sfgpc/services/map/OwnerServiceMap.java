package mubeen.springframework.sfgpc.services.map;

import java.util.Set;

import mubeen.springframework.sfgpc.model.Owner;
import mubeen.springframework.sfgpc.services.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long>{

	@Override
	public Owner save(Owner object) {
		// TODO Auto-generated method stub
		return super.save(object.getId(), object);
	}

	@Override
	public void delete(Owner object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}
	
	@Override
	public Set<Owner> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}
	
    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
    
    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

}
