package cuixb.test.springboot.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;
import java.util.Map;

@Controller
@RequestMapping("/")
public class HomeController {

	@Autowired
	ResourceBundleMessageSource resourceBundleMessageSource;

	@GetMapping
	public String homePage(Map<String, Object> model) {
		String welcome = resourceBundleMessageSource.getMessage("message", null, "Default", null);
		String content_en_US = resourceBundleMessageSource.getMessage("argument.required",
				new Object [] {"HELLO"}, "Required", Locale.US);
		String content_zh_CN = resourceBundleMessageSource.getMessage("argument.required",
				new Object [] {"HELLO"}, "Required", Locale.SIMPLIFIED_CHINESE);
		model.put("welcome","welcome to home page:" +welcome);
		model.put("content_en_US",content_en_US);
		model.put("content_zh_CN",content_zh_CN);
		return "cuixb/test/springboot/login/home";
	}

}
