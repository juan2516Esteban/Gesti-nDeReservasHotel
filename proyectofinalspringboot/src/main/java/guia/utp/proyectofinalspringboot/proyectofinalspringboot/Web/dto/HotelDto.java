package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelDto {

    private String idHotel;

    private String nombreHotel;

    private Integer capacidadDeReservas;

    private Integer numeroDeHabitaciones;

    private String telefono;

    private String direccion;

    private String correoElectronico;
}
