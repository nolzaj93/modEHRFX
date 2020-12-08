package com.modEHR;

public class Norms {
  private static Norms normsInstance;
  private double cReactiveProtein;
  private double cortisol;
  private double dheaSulfate;
  private double estradiol;
  private double ferritin;
  private double hemoglobinA1c;
  private double homocystein;
  private double progesterone;
  private double prostateSpecificAntigen;
  private double vitaminD25Hydroxy;

  public double getcReactiveProtein() {
    return cReactiveProtein;
  }

  public double getCortisol() {
    return cortisol;
  }

  public double getDheaSulfate() {
    return dheaSulfate;
  }

  public double getEstradiol() {
    return estradiol;
  }

  public double getFerritin() {
    return ferritin;
  }

  public double getHemoglobinA1c() {
    return hemoglobinA1c;
  }

  public double getHomocystein() {
    return homocystein;
  }

  public double getProgesterone() {
    return progesterone;
  }

  public double getProstateSpecificAntigen() {
    return prostateSpecificAntigen;
  }

  public double getVitaminD25Hydroxy() {
    return vitaminD25Hydroxy;
  }

  public static Norms getInstance() {
    if (normsInstance == null) {
      synchronized (Norms.class) {
        if (normsInstance == null) {
          normsInstance = new Norms();
        }
      }

    }
    return normsInstance;
  }
}
