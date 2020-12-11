package com.ouilivre.backend.oulivrebackend.entities;


public class Transporteur {

  private long idTransporteur;
  private String nom;
  private String prenom;
  private String nomSociete;
  private String password;
  private long idAdresse;


  public long getIdTransporteur() {
    return idTransporteur;
  }

  public void setIdTransporteur(long idTransporteur) {
    this.idTransporteur = idTransporteur;
  }


  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }


  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }


  public String getNomSociete() {
    return nomSociete;
  }

  public void setNomSociete(String nomSociete) {
    this.nomSociete = nomSociete;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public long getIdAdresse() {
    return idAdresse;
  }

  public void setIdAdresse(long idAdresse) {
    this.idAdresse = idAdresse;
  }

}
