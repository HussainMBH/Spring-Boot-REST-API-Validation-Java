package com.RESTAPIValidation.Rest.API.Validation.Project.Controller;

import com.RESTAPIValidation.Rest.API.Validation.Project.Model.SignupRequest;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ValidationController {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome user!";
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signupRequest){
        return new ResponseEntity<>("User registered Successfully!", HttpStatus.OK);
    }
}
