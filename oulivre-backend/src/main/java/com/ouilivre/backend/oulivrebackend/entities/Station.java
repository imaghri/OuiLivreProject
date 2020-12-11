package com.ouilivre.backend.oulivrebackend.entities;


public class Station {

  private long idStation;
  private long idTrajet;
  private java.sql.Timestamp dateDepart;
  private java.sql.Timestamp dateArrive;
  private long idAdresse;


  public long getIdStation() {
    return idStation;
  }

  public void setIdStation(long idStation) {
    this.idStation = idStation;
  }


  public long getIdTrajet() {
    return idTrajet;
  }

  public void setIdTrajet(long idTrajet) {
    this.idTrajet = idTrajet;
  }


  public java.sql.Timestamp getDateDepart() {
    return dateDepart;
  }

  public void setDateDepart(java.sql.Timestamp dateDepart) {
    this.dateDepart = dateDepart;
  }


  public java.sql.Timestamp getDateArrive() {
    return dateArrive;
  }

  public void setDateArrive(java.sql.Timestamp dateArrive) {
    this.dateArrive = dateArrive;
  }


  public long getIdAdresse() {
    return idAdresse;
  }

  public void setIdAdresse(long idAdresse) {
    this.idAdresse = idAdresse;
  }

}
