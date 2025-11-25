package com.cc.java;

public class Supercat {

  private String firstName;
  private String furColor;
  protected int age;

  
  public Supercat(String firstName, String furColor, int age) {
    this.firstName = firstName;
    this.furColor = furColor;
    this.age = age;
  }

  public String getStringAttributes(String op) {
    switch (op) {
      case "#name":
        return firstName;
      case "#color":
        return furColor;
      default:
        return "ERROR!";
    }
  }






    
}
