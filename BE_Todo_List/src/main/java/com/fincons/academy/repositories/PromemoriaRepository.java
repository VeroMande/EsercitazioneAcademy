package com.fincons.academy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.fincons.academy.model.entities.Promemoria;


/* si occupa di interagire con db dove faccio query*/

@Repository
public interface PromemoriaRepository extends JpaRepository<Promemoria, Integer>{

	@Query(name = "select p from Promemoria p where p.testo= :testo and p.data_scadenza= :data_scadenza", nativeQuery =true)
	Promemoria findByTesto(String testo, String data_scadenza);
	

	
}
