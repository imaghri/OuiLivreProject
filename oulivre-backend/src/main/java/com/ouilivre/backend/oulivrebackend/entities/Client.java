package com.ouilivre.backend.oulivrebackend.entities;


public class Client {

  private long idClient;
  private String nom;
  private String prenom;
  private String email;
  private long numTel;
  private String password;
  private long idAdresse;
  private long idAdresseLiv;


  public long getIdClient() {
    return idClient;
  }

  public void setIdClient(long idClient) {
    this.idClient = idClient;
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


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public long getNumTel() {
    return numTel;
  }

  public void setNumTel(long numTel) {
    this.numTel = numTel;
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


  public long getIdAdresseLiv() {
    return idAdresseLiv;
  }

  public void setIdAdresseLiv(long idAdresseLiv) {
    this.idAdresseLiv = idAdresseLiv;
  }

}
