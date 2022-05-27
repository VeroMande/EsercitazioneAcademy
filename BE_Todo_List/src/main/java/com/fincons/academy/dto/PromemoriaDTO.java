package com.fincons.academy.dto;

import java.io.Serializable;


/* DTO mette in collegamento service e controller*/
public class PromemoriaDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String testo;
	private String dataScadenza;
	private String dataCreazione;
	private String stato;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTesto() {
		return testo;
	}
	public void setTesto(String testo) {
		this.testo = testo;
	}
	public String getData_scadenza() {
		return dataScadenza;
	}
	public void setData_scadenza(String data_scadenza) {
		this.dataScadenza = data_scadenza;
	}
	public String getData_creazione() {
		return dataCreazione;
	}
	public void setData_creazione(String data_creazione) {
		this.dataCreazione = data_creazione;
	}
	public String getStato() {
		return stato;
	}
	public void setStato(String stato) {
		this.stato = stato;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
