package com.ilyes.mobile.entities;


	import java.util.Date;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	@Entity
	public class Mobile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMobile;
	private String nomMobile;
	private Double prixMobile;
	private Date  dateCreation;
	public Mobile() {
	super();}
	public Mobile(String nomMobile, Double prixMobile, Date dateCreation) {
	super();
	this.nomMobile = nomMobile;
	this.prixMobile = prixMobile;
	this.dateCreation = dateCreation;
	}
	
	public Long getIdMobile() {
		return idMobile;
		}
		public void setIdMobile(Long idMobile) {
		this.idMobile = idMobile;
		}
		public String getNomMobile() {
		return nomMobile;
		}
		public void setNomMobile(String nomMobile) {
		this.nomMobile = nomMobile;
		}
		public Double getPrixMobile() {
		return prixMobile;
		}
		public void setPrixMobile(Double prixMobile) {
		this.prixMobile = prixMobile;
		}
		public Date getDateCreation() {
		return dateCreation;
		}
		public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
		}
		@Override
		public String toString() {
		return "Mobile [idMobile=" + idMobile + ", nomMobilet=" + nomMobile + ", prixMobile=" + prixMobile + ", dateCreation=" + dateCreation + "]";
		}
	}

