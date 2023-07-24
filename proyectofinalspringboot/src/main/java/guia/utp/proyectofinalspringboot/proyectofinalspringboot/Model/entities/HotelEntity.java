package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Hotel")
@Entity
public class HotelEntity {

    @Id
    private Integer idHotel;

    @Column(name = "Nombre")
    private String nombreHotel;

    @Column(name = "CpacidadReservas")
    private Integer capacidadDeReservas;


    @Column(name = "NumeroHabitaciones")
    private Integer numeroDeHabitaciones;

    @Column(name = "Telefono")
    private String telefono;

    @Column(name = "Direccion")
    private String direccion;

    @Column(name = "CorreoElectonico")
    private String correoElectronico;
}
