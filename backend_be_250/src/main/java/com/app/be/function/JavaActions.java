package com.app.be.function;

import com.app.be.model.Manager;
import com.app.be.model.Pet;
import com.app.be.model.PetCareCenter;
import com.app.be.model.PetOwner;
import com.app.be.model.Document;
import com.app.be.model.PetService;




import com.app.be.enums.PetServiceType;
import com.app.be.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  