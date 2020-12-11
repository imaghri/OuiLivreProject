package com.ouilivre.backend.oulivrebackend.repositories;

import com.ouilivre.backend.oulivrebackend.entities.Adresses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AdressesRepository extends JpaRepository<Adresses,Long> {

}
