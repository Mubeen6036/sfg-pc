package mubeen.springframework.sfgpc.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import mubeen.springframework.sfgpc.model.Owner;
import mubeen.springframework.sfgpc.model.Vet;
import mubeen.springframework.sfgpc.services.OwnerService;
import mubeen.springframework.sfgpc.services.VetService;
import mubeen.springframework.sfgpc.services.map.OwnerServiceMap;
import mubeen.springframework.sfgpc.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner{
	
	private final OwnerService ownerService;
	private final VetService vetService;

	public DataLoader() {
		super();
		this.ownerService = new OwnerServiceMap();
		this.vetService = new VetServiceMap();
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Owner owner = new Owner();
		owner.setFirstName("Mahi");
		owner.setId(1L);
		owner.setLastName("Kummara");
		
		ownerService.save(owner);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Srikanth");
		owner2.setId(2L);
		owner2.setLastName("Kadavakollu");
		ownerService.save(owner2);
		
		Vet vet = new Vet();
		vet.setFirstName("Kumari");
		vet.setId(1L);
		vet.setLastName("Nanda");
		vetService.save(vet);
	
		
		Vet vet2 = new Vet();
		vet2.setFirstName("Gasonlina");
		vet2.setId(2L);
		vet2.setLastName("Frank");
		vetService.save(vet2);
	}
	
}
