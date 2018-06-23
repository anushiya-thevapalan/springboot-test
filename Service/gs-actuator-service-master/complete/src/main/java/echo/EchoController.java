package echo;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/echo")
public class EchoController {
    @RequestMapping(value="/{message}", method=RequestMethod.GET)
    public String echo(@PathVariable String message) {

        return message;
    }

}
