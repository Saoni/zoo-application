package springboot.zoo_application.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import springboot.zoo_application.model.Animals;
import springboot.zoo_application.model.Chicken;
import springboot.zoo_application.model.Dog;
import springboot.zoo_application.model.Parrot;

public class AnimalStub {
private static Map<String, Animals> animalsMap = new HashMap<String, Animals>();
 static {
   Animals a = new Dog("Dog one", "Hunting Dog", "Meat");
   animalsMap.put("Dog one", a);
   Animals b = new Dog("Dog two", "Assistance Dog", "Fresh Meat");
   animalsMap.put("Dog two", b);
   Animals c = new Dog("Dog three", "Racing Dog", "Pedigree");
   animalsMap.put("Dog three", c);
   
   Animals d = new Parrot("Parrot one", "0,25", false, "Grain");
   animalsMap.put("Parrot one", d);
   Animals e = new Parrot("Parrot two", "0,5", true, "Corn");
   animalsMap.put("Parrot two", e);
   
   Animals f = new Chicken("Chicken one", "0,75", true, "Corn");
   animalsMap.put("Chicken one", f);
   Animals g = new Chicken("Chicken two", "0,75", false, "Corn");
   animalsMap.put("Chicken two", g);
  }
 
 public static List<Animals> list() {
   return new ArrayList<Animals>(animalsMap.values());
 }
 
 public static String alterFriendShip() {
 List<Animals> animalsList=list();
 Random rand = new Random();
 Animals friendsList[]=new Animals[2];
 String won,lost;
 
 for (int i = 0; i < 2; i++) //pick any two animals randomly
 {
       int randomIndex = rand.nextInt(animalsList.size());
       friendsList[i] = animalsList.get(randomIndex);
       animalsList.remove(friendsList[i]);
 }
 Animals a1=friendsList[0];
 Animals b1=friendsList[1];
 System.out.println("Selected animals are "+a1.getName()+" and "+b1.getName());
 
 if (a1.getFriends()!=null)
 { //friend of a1 breaks its friendship with a1
   	lost=a1.getName()+" has lost friendship with "+a1.getFriends();
   	breakFriendship(a1);
 } 
 else
 {
   	lost=a1.getName()+" has lost friendship with no one";
 }
 if (b1.getFriends()!=null)
 { //friend of b1 breaks its friendship with b1
	 breakFriendship(b1);
 }
 //new friendship is established
 a1.setFriends(b1.getName());
 animalsMap.put(a1.getName(),a1);
 b1.setFriends(a1.getName());
 animalsMap.put(b1.getName(),b1);
 won=a1.getName()+" has established friendship with "+b1.getName();
 return lost+" ; "+won;
}
 
 public static void breakFriendship(Animals a) {
	 Animals lostFriend=animalsMap.get(a.getFriends());
	 lostFriend.setFriends(null);
	 animalsMap.put(lostFriend.getName(),lostFriend);
	}
   
}
