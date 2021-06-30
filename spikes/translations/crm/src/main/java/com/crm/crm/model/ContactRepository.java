package com.crm.crm.model;

import org.springframework.data.repository.CrudRepository;
// made to allow CORS
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// Repositories connect the data models to the actual database
// We are connecting the ned model and its primary key into Spring's CRUD
// model connected to server or db
@RepositoryRestResource
public interface ContactRepository extends CrudRepository<Contact, Long> {
}
