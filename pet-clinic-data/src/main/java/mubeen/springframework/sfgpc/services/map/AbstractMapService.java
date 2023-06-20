package mubeen.springframework.sfgpc.services.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import mubeen.springframework.sfgpc.model.BaseEntity;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {
	protected Map<Long, T> map = new HashMap<>();
	
	Set<T> findAll(){
		return new HashSet<>(map.values());
	}
	
	T findById(ID id) {
		return map.get(id);
	}
	
	T save(T object) {
		if(object != null && object.getId() == null) {
			object.setId(nextId());
		}
		map.put(object.getId(), object);
		return object;
	}
	
	void deleteById(ID id) {
		map.remove(id);
	}
	
	void delete(T object) {
		map.entrySet().removeIf(entry->entry.getValue().equals(object));
	}
	
	Long nextId() {
		try {
			return Collections.max(map.keySet())+1;
		}catch(Exception e) {
			return 1l;
		}
	}
}
