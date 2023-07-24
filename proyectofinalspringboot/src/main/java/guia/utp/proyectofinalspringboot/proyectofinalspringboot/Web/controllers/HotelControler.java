package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.controllers;

import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Service.interfaces.hotelService;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.dto.HotelDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api-Hotel/v1")
public class HotelControler {

    @Autowired
    private hotelService service;
    @PostMapping("crearHotel")
    public ResponseEntity<HotelDto> crearHotel(@RequestBody HotelDto hotelDto){
        return new ResponseEntity<>(service.crearHotel(hotelDto), HttpStatus.CREATED);
    }
}
