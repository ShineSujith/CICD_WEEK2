package ie.atu.week2_lab1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }

    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name) {
        return "Hello " + name;
    }

    @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam int age) {
        return "Name: "+ name + "\tage: " + age;
    }

    @GetMapping("/calculate")
    public String calculate(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation) {
        float ans = 0;
        switch (operation) {
            case "add":
                ans = num1 + num2;
                break;
            case "subtract":
                ans = num1 - num2;
                break;
            case "multiply":
                ans = num1 * num2;
                break;
            case "divide":
                if(num2  == 0) {
                    return "can't divide by 0";
                }
                else {
                    ans = (float)num1/num2;
                }
                break;
            default:
                break;
        }
        return "Operation: " + operation + " Total: " + ans;
    }

}
