package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities.compoundkeys;

import lombok.*;

import javax.persistence.Embeddable;

import java.io.Serializable;


@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Setter
@Getter
@ToString
@Embeddable
public class HabitacionCompoundKey  implements Serializable {

    private String idhabitacion;
    private String idHotel;
}
