package com.techreturners.exercise002;

public class Exercise002 {
  class Person {
  private String firstName;
  private String lastName;
  private String pCity;
  private int age;
    public boolean isFromManchester(Person person ) {
      if (Person.get(2).equals("Manchester")){return true;} else {return false;}
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
      if (Person.get(3)>18) {return true;} else {return false;}
    }
}
}
