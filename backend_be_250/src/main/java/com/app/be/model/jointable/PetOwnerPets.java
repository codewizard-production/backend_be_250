package com.app.be.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.be.model.Manager;
import com.app.be.model.Pet;
import com.app.be.model.PetCareCenter;
import com.app.be.model.PetOwner;
import com.app.be.model.Document;
import com.app.be.model.PetService;
import com.app.be.enums.PetServiceType;
import com.app.be.converter.PetServiceTypeConverter;

@Entity(name = "PetOwnerPets")
@Table(schema = "\"be\"", name = "\"PetOwnerPets\"")
@Data
public class PetOwnerPets{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"OwnerId\"")
	private Integer ownerId;

    
    @Column(name = "\"PetId\"")
    private Integer petId;
 
}