package cuixb.test.springboot.threejs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/")
public class ThreeJsController {

	@GetMapping("/webgl_animation_cloth")
	public String threejs1(Map<String, Object> model) {
		return "cuixb/threejs/webgl_animation_cloth";
	}

	@GetMapping("/css3d_periodictable")
	public String threejs2(Map<String, Object> model) {
		return "cuixb/threejs/css3d_periodictable";
	}

	@GetMapping("/css3d_molecules")
	public String threejs3(Map<String, Object> model) {
		return "cuixb/threejs/css3d_molecules";
	}

	@GetMapping("/webgl_custom_attributes_lines")
	public String threejs4(Map<String, Object> model) {
		return "cuixb/threejs/webgl_custom_attributes_lines";
	}

}
