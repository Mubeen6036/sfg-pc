package mubeen.springframework.sfgpc.services;

import java.util.Set;

import mubeen.springframework.sfgpc.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	Owner findByLastName(String lastName);
}
