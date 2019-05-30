package springboot.zoo_application.model;

public class Chicken extends Animals{

	String Wingspan;
	Boolean IsBroiler;

	public Chicken() {

	}

	public Chicken(String name, String wingspan, Boolean isBroiler, String favoriteFood) {
		this.Name = name;
		this.Wingspan = wingspan;
		this.IsBroiler = isBroiler;
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
	public Boolean getIsBroiler() {
		return IsBroiler;
	}
	public void setIsBroiler(Boolean isBroiler) {
		IsBroiler = isBroiler;
	}
	public String getFavoriteFood() {
		return FavoriteFood;
	}
	public void setFavoriteFood(String favoriteFood) {
		FavoriteFood = favoriteFood;
	}
	
	@Override
	public String toString() {
		return "Chicken [Name=" + Name + ", Wingspan=" + Wingspan + ", IsBroiler=" + IsBroiler + ", FavoriteFood="
				+ FavoriteFood + "]";
	}


}
