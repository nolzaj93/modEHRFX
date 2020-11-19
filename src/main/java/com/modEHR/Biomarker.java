package com.modEHR;

public class Biomarker {

  private double value;
  private String name;
  private String units;
  private double highNormal;
  private double lowNormal;

  public double getValue() {
    return value;
  }

  public String getName() {
    return name;
  }

  public String getUnits() {
    return units;
  }

  public double getHighNormal() {
    return highNormal;
  }

  public double getLowNormal() {
    return lowNormal;
  }

}
