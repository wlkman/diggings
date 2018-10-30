package cuixb.test.springboot.api.controller;

import com.alibaba.fastjson.JSONObject;
import cuixb.test.springboot.api.bean.RequestBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/api")
public class ApiController {

    @ResponseBody
    @GetMapping("/testGet")
    public String testGet() {
        return "get method has skipped authentication";
    }

    @ResponseBody
    @PostMapping("/testPost")
    public String testPost(@RequestBody RequestBean paramBean) {
        System.out.println(JSONObject.toJSONString(paramBean));
        return "post method has skipped authentication";
    }


}
