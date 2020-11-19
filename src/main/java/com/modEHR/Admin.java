package com.modEHR;

import java.util.ArrayList;

public class Admin {

  private static volatile Admin adminInstance;

  private Admin(){

  }

  private String userName;
  private String phone;
  private ArrayList<Patient> patients;

  public String getUserName() {
    return userName;
  }

  public String getPhone() {
    return phone;
  }

  public ArrayList<Patient> getPatients() {
    return patients;
  }

  public static Admin getInstance() {
    if (adminInstance == null) {
      synchronized (Admin.class) {
        if (adminInstance == null) {
          adminInstance = new Admin();
        }
      }

    }
    return adminInstance;
  }

  public void addPatient(Patient newPatient) {

  }

  public void removePatient(Patient newPatient) {

  }
}
