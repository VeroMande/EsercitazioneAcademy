package com.fincons.academy.services;
import com.fincons.academy.dto.PromemoriaDTO;
import com.fincons.academy.model.entities.Promemoria;
import java.util.List;

public interface PromemoriaService {
	
	/* collegamento tra dto e metodi del repository */
	Promemoria findPromemoriaById(Integer id);
	List<PromemoriaDTO> findAll();
	
	PromemoriaDTO findByTesto(String testo, String dataScadenza);
	
	/*qui ritorno giù verso db*/
	Integer save(PromemoriaDTO dto);
	void delete(Integer id);
	PromemoriaDTO update(Integer pk, PromemoriaDTO dto);
}
