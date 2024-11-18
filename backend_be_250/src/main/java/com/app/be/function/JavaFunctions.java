package com.app.be.function;

import com.app.be.model.Manager;
import com.app.be.model.Pet;
import com.app.be.model.PetCareCenter;
import com.app.be.model.PetOwner;
import com.app.be.model.Document;
import com.app.be.model.PetService;
import com.app.be.enums.PetServiceType;
import com.app.be.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.be.repository.PetServiceRepository;
import com.app.be.repository.PetOwnerRepository;
import com.app.be.repository.PetCareCenterRepository;
import com.app.be.repository.ManagerRepository;
import com.app.be.repository.DocumentRepository;
import com.app.be.repository.PetRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
