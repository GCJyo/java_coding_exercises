package com.techreturners.exercise002;

public class Exercise002 {
  public boolean isFromManchester(Person personm) {
      if (personm.getCity().equals("Manchester")){
        return true;
      } else {
        return false;
      }
    }
    public boolean canWatchFilm(Person personm, int ageLimit) {
      if (personm.getAge()>= ageLimit) {
        return true;
      } else {
        return false;
      }
    }
}