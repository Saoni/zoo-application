package springboot.zoo_application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {
@Autowired
private ApplicationContext context;

@RequestMapping("/")
public String home() {
    return "welcome to the zoo!";
}
@RequestMapping(value = "exit", method = RequestMethod.GET)
public void shutdownApp() {

    int exitCode = SpringApplication.exit(context, (ExitCodeGenerator)() -> 0);
    System.out.println("Closing the zoo!");
    System.exit(exitCode);
}
}