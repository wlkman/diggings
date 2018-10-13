package cuixb.test.springboot.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/")
public class HomeController {

	@GetMapping
	public String homePage(Map<String, Object> model) {
		model.put("welcome","home page here");
		return "cuixb/test/springboot/login/home";
	}

}
