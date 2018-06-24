package controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

public class EchoController {

    @GetMapping("/echo")
    @ResponseBody
    public String echo(@RequestParam(name="message") String message) {

        return message;
    }

}
