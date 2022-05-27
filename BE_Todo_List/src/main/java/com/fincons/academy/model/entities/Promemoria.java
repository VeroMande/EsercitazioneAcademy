package com.fincons.academy.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// fa comunicare db e repository (DAO)
@Entity
@Table(name = "promemoria")
public class Promemoria implements Serializable{

	public Promemoria() {
		super();
	}
	
private static final long serialVersionUID = 1L;
	
	
	// chiave primaria che è un valore generato dal server, gli dico strategia di creazione automatica*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "testo")
	private String testo;
	
	@Column(name = "dataScadenza")
	private String dataScadenza;
	
	@Column(name = "dataCreazione")
	private String dataCreazione;
	
	@Column(name = "stato")
	private String stato;

	
	// getter e setter
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

	public void setData_scadenza(String dataScadenza) {
		this.dataScadenza = dataScadenza;
	}

	public String getData_creazione() {
		return dataCreazione;
	}

	public void setData_creazione(String dataCreazione) {
		this.dataCreazione = dataCreazione;
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

	@Override
	public String toString() {
		return "Promemoria [id=" + id + ", testo=" + testo + ", dataScadenza=" + dataScadenza + ", dataCreazione="
				+ dataCreazione + ", stato=" + stato + "]";
	}
	
	
	
	
	
	
	
	
	

}
