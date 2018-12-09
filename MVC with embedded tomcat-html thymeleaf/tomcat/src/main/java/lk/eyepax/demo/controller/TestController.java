package lk.eyepax.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

//    @RequestMapping(value = "/second",method = RequestMethod.GET)
//    public String test(){
//        return "second";
//    }


    @RequestMapping("/index")
    public String renderHtmlView() {
        return "index";
}

    @RequestMapping("/jspView")
    public String renderJspView() {
        return "WEB-INF/views/index.jsp";
    }
}
