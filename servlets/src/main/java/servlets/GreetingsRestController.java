package servlets;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
class GreetingsRestController {

 @GetMapping("/mvc/hi")
 Map<String, Object> hi() {
  return Collections.singletonMap("greetings", "Hello, world!");
 }
}
