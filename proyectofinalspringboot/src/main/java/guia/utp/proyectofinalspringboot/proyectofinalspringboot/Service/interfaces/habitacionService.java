package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Service.interfaces;

import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.dto.HabitacionesDto;

import java.util.List;

public interface habitacionService {
    HabitacionesDto crearHbaitacion (HabitacionesDto habitacionesDto);

    List<HabitacionesDto> obtenerHabitaciones(String idHotel);
}
