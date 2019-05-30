package springboot.zoo_application.model;

public class Dog extends Animals{
	
	String DogType;
	
	public Dog() {}
	
	public Dog(String name, String dogType, String favoriteFood) {
		this.Name = name;
		this.DogType = dogType;
		this.FavoriteFood = favoriteFood;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDogType() {
		return DogType;
	}
	public void setDogType(String dogType) {
		DogType = dogType;
	}
	public String getFavoriteFood() {
		return FavoriteFood;
	}
	public void setFavoriteFood(String favoriteFood) {
		FavoriteFood = favoriteFood;
	}
	
	@Override
	public String toString() {
		return "Dog [Name=" + Name + ", DogType=" + DogType + ", FavoriteFood=" + FavoriteFood + "]";
	}
    
}
