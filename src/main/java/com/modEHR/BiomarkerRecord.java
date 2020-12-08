package com.modEHR;

import java.util.Date;

public class BiomarkerRecord {
  private Date recordDate;
  private Biomarker cReactiveProtein;
  private Biomarker cortisol;
  private Biomarker dheaSulfate;
  private Biomarker estradiol;
  private Biomarker ferritin;
  private Biomarker hemoglobinA1c;
  private Biomarker homocystein;
  private Biomarker progesterone;
  private Biomarker prostateSpecificAntigen;
  private Biomarker vitaminD25Hydroxy;
  public Norms highNorms;
  public Norms lowNorms;

  public BiomarkerRecord() {
    //If female construct highNorms with new FemaleHighNorms(), and
    // lowNorms with new FemaleLowNorms()

    //else male construct highNorms with new MaleHighNorms(), and
    // lowNorms with new MaleLowNorms()
  }

  public Date getRecordDate() {
    return recordDate;
  }

  public Biomarker getcReactiveProtein() {
    return cReactiveProtein;
  }

  public Biomarker getCortisol() {
    return cortisol;
  }

  public Biomarker getDheaSulfate() {
    return dheaSulfate;
  }

  public Biomarker getEstradiol() {
    return estradiol;
  }

  public Biomarker getFerritin() {
    return ferritin;
  }

  public Biomarker getHemoglobinA1c() {
    return hemoglobinA1c;
  }

  public Biomarker getHomocystein() {
    return homocystein;
  }

  public Biomarker getProgesterone() {
    return progesterone;
  }

  public Biomarker getProstateSpecificAntigen() {
    return prostateSpecificAntigen;
  }

  public Biomarker getVitaminD25Hydroxy() {
    return vitaminD25Hydroxy;
  }
}
