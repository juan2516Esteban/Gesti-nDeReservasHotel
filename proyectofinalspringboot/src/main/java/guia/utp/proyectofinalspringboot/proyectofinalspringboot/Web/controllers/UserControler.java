package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.controllers;

import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities.compoundkeys.UserCompoundKey;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Service.interfaces.userService;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.dto.UserDto;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.dto.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api-User/v1")
public class UserControler {

    @Autowired
    private userService UserServi;
    @PostMapping("crearUser")
    public ResponseEntity<UserDto> crearUsuer(@RequestBody UserDto userDto){
        return new ResponseEntity<>(UserServi.crearUsuario(userDto),HttpStatus.CREATED);
    }

    @GetMapping("obetenerUser")
    public ResponseEntity<UserResponse> obtenerUser(@RequestParam("id1") String id1, @RequestParam("id2") String id2){
        return new ResponseEntity<>(UserServi.obtenerUser(id1,id2),HttpStatus.OK);
    }
}
