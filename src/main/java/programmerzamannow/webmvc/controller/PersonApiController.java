package programmerzamannow.webmvc.controller;

import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import programmerzamannow.webmvc.model.CreatePersonRequest;

@Controller
public class PersonApiController {

    @PostMapping(
            path = "/api/person",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    public CreatePersonRequest createPerson(@RequestBody @Valid CreatePersonRequest request){
        return request;
    }
}
