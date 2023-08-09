package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Service.interfaces;

import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.dto.HotelDto;

import java.util.List;

public interface hotelService {
    HotelDto crearHotel(HotelDto hotelDto);

    List<HotelDto> obtenerHoteles();

    HotelDto obtenerHotelePorCorreo(String correo);
}
