package com.ouilivre.backend.oulivrebackend.entities;


public class Expedition {

  private long idExpedition;
  private long poids;
  private String statut;
  private long idClient;
  private long idTransporteur;
  private long idStaDep;
  private long idStaArr;


  public long getIdExpedition() {
    return idExpedition;
  }

  public void setIdExpedition(long idExpedition) {
    this.idExpedition = idExpedition;
  }


  public long getPoids() {
    return poids;
  }

  public void setPoids(long poids) {
    this.poids = poids;
  }


  public String getStatut() {
    return statut;
  }

  public void setStatut(String statut) {
    this.statut = statut;
  }


  public long getIdClient() {
    return idClient;
  }

  public void setIdClient(long idClient) {
    this.idClient = idClient;
  }


  public long getIdTransporteur() {
    return idTransporteur;
  }

  public void setIdTransporteur(long idTransporteur) {
    this.idTransporteur = idTransporteur;
  }


  public long getIdStaDep() {
    return idStaDep;
  }

  public void setIdStaDep(long idStaDep) {
    this.idStaDep = idStaDep;
  }


  public long getIdStaArr() {
    return idStaArr;
  }

  public void setIdStaArr(long idStaArr) {
    this.idStaArr = idStaArr;
  }

}
