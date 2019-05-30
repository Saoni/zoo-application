package springboot.zoo_application.model;


public class Parrot extends Animals{

 String Wingspan;
 Boolean CanSpeak;

public Parrot() {}

public Parrot(String name, String wingspan, Boolean canSpeak, String favoriteFood) {
 
	this.Name = name;
    this.Wingspan = wingspan;
    this.CanSpeak = canSpeak;
    this.FavoriteFood = favoriteFood;
}

public String getName() {
 return Name;
}

public void setName(String name) {
  Name = name;
}

public String getWingspan() {
  return Wingspan;
}

public void setWingspan(String wingspan) {
  Wingspan = wingspan;
}

public Boolean getCanSpeak() {
 return CanSpeak;
}

public void setCanSpeak(Boolean canSpeak) {
  CanSpeak = canSpeak;
}

public String getFavoriteFood() {
  return FavoriteFood;
}

public void setFavoriteFood(String favoriteFood) {
  FavoriteFood = favoriteFood;
}

@Override
public String toString() {
 return "Parrot [Name=" + Name + ", Wingspan=" + Wingspan + ", CanSpeak=" + CanSpeak + ", FavoriteFood="
+ FavoriteFood + "]";
}



}

