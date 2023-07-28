package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities;

import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.dto.HotelDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Hotel")
@Entity
public class HotelEntity {

    @Id
    private String idHotel;

    @Column(name = "nombre")
    private String nombreHotel;

    @Column(name = "capacidadReservas")
    private Integer capacidadDeReservas;


    @Column(name = "numeroHabitaciones")
    private Integer numeroDeHabitaciones;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "correoElectonico")
    private String correoElectronico;

    @OneToMany(fetch = FetchType.LAZY, orphanRemoval = true)
    List<HabitacionEntity> habitacionEntities;

    @OneToMany(fetch = FetchType.LAZY, orphanRemoval = true)
    List<ReservaEntity> reservaEntity;
}
