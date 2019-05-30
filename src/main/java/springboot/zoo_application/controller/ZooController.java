package springboot.zoo_application.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springboot.zoo_application.model.Animals;

@RestController
@RequestMapping("api/v1/")
public class ZooController {

 @RequestMapping(value = "animals", method = RequestMethod.GET)
  public List<Animals> list(){
    return AnimalStub.list();
}

@RequestMapping(value = "alterFriendship", method = RequestMethod.GET)
   public String alterFriendShip(){
     return AnimalStub.alterFriendShip();
  }
}