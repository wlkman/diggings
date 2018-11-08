package cuixb.test.springboot.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/")
public class LoginController {

	@GetMapping("/login")
	public String list(Map<String, Object> model) {
		return "cuixb/test/springboot/login/login";
	}

//	@GetMapping("/testLayout")
//	public String testLayout(Map<String, Object> model) {
//		return "cuixb/test/springboot/layout/layout";
//	}

}
