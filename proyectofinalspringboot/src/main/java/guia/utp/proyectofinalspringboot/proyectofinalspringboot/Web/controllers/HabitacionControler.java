package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.controllers;

import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Service.interfaces.habitacionService;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.dto.HabitacionesDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api-Habitacion/v1")
public class HabitacionControler {

    @Autowired
    habitacionService habitacionServices;

    @PostMapping("crearHabitacion")
    public ResponseEntity<HabitacionesDto> crearHabitacion(@RequestBody HabitacionesDto habitacionesDto){
        return new ResponseEntity<>(habitacionServices.crearHbaitacion(habitacionesDto),HttpStatus.CREATED);
    }
}
