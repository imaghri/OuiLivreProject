package com.ouilivre.backend.oulivrebackend.entities;


public class Trajet {

  private long idTrajet;
  private String nomTrajet;
  private long idTransporteur;


  public long getIdTrajet() {
    return idTrajet;
  }

  public void setIdTrajet(long idTrajet) {
    this.idTrajet = idTrajet;
  }


  public String getNomTrajet() {
    return nomTrajet;
  }

  public void setNomTrajet(String nomTrajet) {
    this.nomTrajet = nomTrajet;
  }


  public long getIdTransporteur() {
    return idTransporteur;
  }

  public void setIdTransporteur(long idTransporteur) {
    this.idTransporteur = idTransporteur;
  }

}
