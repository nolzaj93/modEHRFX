package com.modEHR;

import java.util.ArrayList;
import java.util.Date;

public class Patient {
  private String name;
  private String gender;
  private Date dateOfBirth;
  private ArrayList<BiomarkerRecord> biomarkerRecords;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public void plotRecords(ArrayList<BiomarkerRecord> records){

  }
}
