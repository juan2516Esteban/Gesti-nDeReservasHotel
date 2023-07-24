package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.controllers;

import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Service.interfaces.reservaService;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.dto.ReservaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api-reserva/v1")
public class ReservaControler {

    @Autowired
    reservaService reservaServices;

    @PostMapping("crearReserva")
    public ResponseEntity<ReservaDto> crearReserva(@RequestBody ReservaDto reservaDto){
        return new ResponseEntity<>(reservaServices.crearReserva(reservaDto), HttpStatus.CREATED);
    }
}
