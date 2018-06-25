package controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Controller

public class PrimeController {

    @GetMapping("/prime")
    @ResponseBody
    public String prime(@RequestParam(name="number") String number) {
        int int_number;
        try {
            int_number = Integer.parseInt(number);

        }catch(Exception ex){

            return "Integer argument is expected";
        }
        return new PrimeNumber().primesLessthan(int_number)+"";
    }

}


