package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Controller

public class MergeController {

    @GetMapping("/merge")
    @ResponseBody
    public String merge(@RequestParam(name="number") String number) {
        int int_number;
        try {
            int_number = Integer.parseInt(number);

        }catch(Exception ex){

            return "Integer argument is expected";
        }
        boolean result = new MergeSort().sortNNumbers(int_number);
        return result+ "";
    }

}