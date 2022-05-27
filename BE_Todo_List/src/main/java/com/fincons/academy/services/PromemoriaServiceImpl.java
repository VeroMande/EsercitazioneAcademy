package com.fincons.academy.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import com.fincons.academy.dto.PromemoriaDTO;
import com.fincons.academy.model.entities.Promemoria;
import com.fincons.academy.repositories.PromemoriaRepository;
import com.fincons.academy.utils.PromemoriaUtils;

@Service
/* ogni metodo con questa annotazione è un evento*/
@Transactional(propagation = Propagation.SUPPORTS)
public class PromemoriaServiceImpl implements PromemoriaService{
	
	@Autowired
	private PromemoriaRepository promemoriaRepository;

	@Override
	@Transactional(propagation = Propagation.NEVER, readOnly = true)
	public Promemoria findPromemoriaById(Integer id) {
		return promemoriaRepository.findById(id).get();
	}
	
	@Override
	@Transactional(propagation = Propagation.NEVER, readOnly = true)
	public List<PromemoriaDTO> findAll() {
		List<PromemoriaDTO> promDTO;
		List<Promemoria> prom = promemoriaRepository.findAll();
		promDTO = prom.stream().map(
				// trasformazione da singolo user a dto
				p -> PromemoriaUtils.fromVOtoDTO(p)
				).collect(Collectors.toList());
		return promDTO;
	}
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public Integer save(PromemoriaDTO dto) {
		// salvataggio dei dati provenienti dall'utente che devono essere salvati nel db
		Promemoria prom = promemoriaRepository.save(PromemoriaUtils.fromDTOtoVO(dto));
		return prom.getId();
	}
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void delete(Integer id) {
		// prendo id e lo disintegra
		// o ti passo id o ti mando direttamente l'oggetto intero
		// qui elimino oggetto tramite id
		promemoriaRepository.delete(promemoriaRepository.findById(id).get());
	}
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public PromemoriaDTO update(Integer id, PromemoriaDTO dto) {
		Promemoria nuovoProm = promemoriaRepository.findById(id).get();
		nuovoProm.setTesto(dto.getTesto());
		nuovoProm.setData_scadenza(dto.getData_scadenza());
		nuovoProm.setData_creazione(dto.getData_creazione());
		nuovoProm.setStato(dto.getStato());
		Promemoria prom = promemoriaRepository.saveAndFlush(nuovoProm);
		PromemoriaDTO utenteDTO = PromemoriaUtils.fromVOtoDTO(prom);
		return utenteDTO;
		
	}
	
	


	@Override
	public PromemoriaDTO findByTesto(@RequestParam("testo") String testo, @RequestParam("dataScadenza") String dataScadenza) {
		Promemoria userVo = promemoriaRepository.findByTesto(testo, dataScadenza);
		if (userVo == null) {
			return null;
		}
		// lo trasformo in DTO per ripassarlo al controller
		PromemoriaDTO userDTO = PromemoriaUtils.fromVOtoDTO(userVo);
		return userDTO;
	}

	


}
