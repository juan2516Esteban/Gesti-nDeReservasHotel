package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities;

import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities.compoundkeys.UserCompoundKey;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.dto.HabitacionesDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Reservas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservaEntity {

    @Id
    private String códigoDeHabilitación;


    private Date fechaDeInicio;

    private Date fechaDeFin;

    @Column(name = "NumDeHabitaciones")
    private Integer numeroDeHabitaciones;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "key1", referencedColumnName = "key1", updatable = false)
    @JoinColumn(name = "key2", referencedColumnName = "key2", updatable = false)
    private UserEntity user;
}
