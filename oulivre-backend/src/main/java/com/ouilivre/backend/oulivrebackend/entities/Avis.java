package com.ouilivre.backend.oulivrebackend.entities;


public class Avis {

  private long idAvis;
  private long idClient;
  private long idTransporteur;
  private String text;
  private long note;


  public long getIdAvis() {
    return idAvis;
  }

  public void setIdAvis(long idAvis) {
    this.idAvis = idAvis;
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


  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  public long getNote() {
    return note;
  }

  public void setNote(long note) {
    this.note = note;
  }

}
