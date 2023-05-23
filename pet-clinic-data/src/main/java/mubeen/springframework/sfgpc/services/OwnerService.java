package mubeen.springframework.sfgpc.services;


import org.springframework.stereotype.Service;

import mubeen.springframework.sfgpc.model.Owner;
//@Service
public interface OwnerService extends CrudService<Owner, Long> {
	Owner findByLastName(String lastName);
}
