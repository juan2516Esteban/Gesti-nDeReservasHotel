package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities;

import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities.compoundkeys.ReservaCompoundKey;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities.compoundkeys.UserCompoundKey;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.dto.HabitacionesDto;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Reservas")
@EqualsAndHashCode
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ReservaEntity implements Serializable {

    @EmbeddedId
    private ReservaCompoundKey reservaCompoundKey;


    private Date fechaDeInicio;

    private Date fechaDeFin;

    @Column(name = "NumDeHabitaciones")
    private Integer numeroDeHabitaciones;

    @ManyToOne(fetch = FetchType.LAZY)
    private HotelEntity hotel;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "UserCompound1", referencedColumnName = "userIdentificacion", updatable = false)
    @JoinColumn(name = "UserCompound2", referencedColumnName = "userIdentificacionType", updatable = false)
    private UserEntity user;

}
