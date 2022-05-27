package com.fincons.academy.utils;

import com.fincons.academy.dto.PromemoriaDTO;
import com.fincons.academy.model.entities.Promemoria;

public class PromemoriaUtils {
	
	// conversione da VO a DTO
	public static PromemoriaDTO fromVOtoDTO(Promemoria promemoria) {
		PromemoriaDTO promemoriaDTO = new PromemoriaDTO();
		promemoriaDTO.setId(promemoria.getId());
		promemoriaDTO.setTesto(promemoria.getTesto());
		promemoriaDTO.setData_scadenza(promemoria.getData_scadenza());
		promemoriaDTO.setData_creazione(promemoria.getData_creazione());
		promemoriaDTO.setStato(promemoria.getStato());
		return promemoriaDTO;
	}
	
	// conversione da DTO a VO
	public static Promemoria fromDTOtoVO(PromemoriaDTO promemoriaDTO) {
		Promemoria promemoria = new Promemoria();
		promemoria.setId(promemoriaDTO.getId());
		promemoria.setTesto(promemoriaDTO.getTesto());
		promemoria.setData_scadenza(promemoriaDTO.getData_scadenza());
		promemoria.setData_creazione(promemoriaDTO.getData_creazione());
		promemoria.setStato(promemoriaDTO.getStato());
		return promemoria;
	}

}
