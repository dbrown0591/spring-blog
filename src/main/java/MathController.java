import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {
    @GetMapping(path= "/add/{number1}/and/{number2}")
    @ResponseBody
    public String math(@PathVariable int number1, int number2){
        return
    }

}
