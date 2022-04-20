package br.com.compass.resources;

import br.com.compass.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserResource {

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable int id) {
        return ResponseEntity.ok().body(new User(1,"Valdir","val@email.com", "132456" ));
    }
}
