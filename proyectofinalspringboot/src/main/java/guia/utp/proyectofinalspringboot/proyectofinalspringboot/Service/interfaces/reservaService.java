package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Service.interfaces;

import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.dto.ReservaDto;

public interface reservaService {
   public ReservaDto crearReserva(ReservaDto reservaDto);


   public void eliminarReserva(ReservaDto reservaDto);

    public ReservaDto modificarReserva(ReservaDto reservaDto);
}
