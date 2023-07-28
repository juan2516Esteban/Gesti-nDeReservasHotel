package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.controllers;

import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Service.interfaces.reservaService;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.dto.ReservaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api-reserva/v1")
public class ReservaControler {

    @Autowired
    reservaService reservaServices;

    @PostMapping("crearReserva")
    public ResponseEntity<ReservaDto> crearReserva(@RequestBody ReservaDto reservaDto){
        return new ResponseEntity<>(reservaServices.crearReserva(reservaDto), HttpStatus.CREATED);
    }

    @DeleteMapping("eliminarReserva")
    public ResponseEntity<Void> eliminarReserva(@RequestBody ReservaDto reservaDto ){

        reservaServices.eliminarReserva(reservaDto);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("modificarReserva")
    public ResponseEntity<ReservaDto> modificarReserva(@RequestBody ReservaDto reservaDto){
        return new ResponseEntity<>(reservaServices.modificarReserva(reservaDto),HttpStatus.OK);
    }
}
