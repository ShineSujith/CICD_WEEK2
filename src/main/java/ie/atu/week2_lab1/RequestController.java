package ie.atu.week2_lab1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @GetMapping("/sayHello")
    public String sayHello() {
        return "Hello";
    }

}
