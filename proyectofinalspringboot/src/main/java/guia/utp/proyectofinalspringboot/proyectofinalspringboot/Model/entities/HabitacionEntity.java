package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities;

import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities.compoundkeys.HabitacionCompoundKey;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Habitaciones")
@EqualsAndHashCode
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class HabitacionEntity implements Serializable {

    @EmbeddedId
    private HabitacionCompoundKey habitacionCompoundKey;


    @Column(name = "Baños")
    private Integer numBaños;

    @Column(name = "capacidad")
    private Integer capacidad;

    @Column(name = "dormitorios")
    private Integer numCamas;

    @Column(name = "cocina")
    private boolean Cocina;

    @Column(name = "precio")
    private double precio;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "idHotel")
    private HotelEntity hotel;

}
