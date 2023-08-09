package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.dto;

import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities.compoundkeys.HabitacionCompoundKey;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HabitacionesDto {

    private HabitacionCompoundKey habitacionCompoundKey;

    private String idHabitaciones;

    private Integer numBanos;

    private Integer capacidad;

    private Integer numCamas;

    private boolean Cocina;

    private double precio;

    private HotelDto hotel;
}
