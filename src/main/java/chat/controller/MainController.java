package chat.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Liudmyla Melnychuk on 15.11.2017.
 */
@RestController
public class MainController {
        @RequestMapping("/hi")
        public String showMainPage() {
            return "Hi:)";
        }
}
