package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.controllers;

import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Service.interfaces.habitacionService;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.dto.HabitacionesDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api-Habitacion/v1")
public class HabitacionControler {

    @Autowired
    habitacionService habitacionServices;

    @PostMapping("crearHabitacion")
    public ResponseEntity<HabitacionesDto> crearHabitacion(@RequestBody HabitacionesDto habitacionesDto){
        return new ResponseEntity<>(habitacionServices.crearHbaitacion(habitacionesDto),HttpStatus.CREATED);
    }

    @GetMapping("obtenerHabitaciones")
    public ResponseEntity<List<HabitacionesDto>> ObtenerHabitacion(@RequestParam("idHotel") String idHotel){
        return new ResponseEntity<>(habitacionServices.obtenerHabitaciones(idHotel),HttpStatus.OK);
    }
}
