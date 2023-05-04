package programmerzamannow.webmvc.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import programmerzamannow.webmvc.service.HelloService;

import java.io.IOException;
import java.util.Objects;

@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping(path = "/hello")
    public void helloWorld(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String responseBody = helloService.hello(name);
        response.getWriter().println(responseBody);
    }

}
