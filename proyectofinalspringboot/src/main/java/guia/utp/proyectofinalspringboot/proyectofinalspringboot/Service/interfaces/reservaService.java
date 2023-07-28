package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Service.interfaces;

import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.dto.ReservaDto;

public interface reservaService {
    ReservaDto crearReserva(ReservaDto reservaDto);


    void eliminarReserva(ReservaDto reservaDto);

    ReservaDto modificarReserva(ReservaDto reservaDto);
}
