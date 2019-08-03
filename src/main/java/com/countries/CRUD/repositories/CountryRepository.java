package com.countries.CRUD.repositories;

/*  package com.countries.CRUD.repositories;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.countries.CRUD.entities.Country;

//@Repository
//@ComponentScan(basePackages = "com.countries.CRUD.repositories")
//@ConfigurationProperties(prefix = "administrator")
@Repository
public interface CountryRepository extends JpaRepository<Country, Integer>{

	@Query("select c from Country c where c.id=:id")
	Country findOne(@Param("id") Integer id);
	
}

 */
import com.countries.CRUD.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface CountryRepository extends JpaRepository<Country, Integer> {
}