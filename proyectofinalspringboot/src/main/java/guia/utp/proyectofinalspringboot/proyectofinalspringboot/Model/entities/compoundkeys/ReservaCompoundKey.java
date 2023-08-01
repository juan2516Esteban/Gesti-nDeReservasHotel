package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities.compoundkeys;

import lombok.*;

import javax.persistence.Embeddable;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@EqualsAndHashCode
@Setter
@Getter
@ToString
public class ReservaCompoundKey implements Serializable {

    private UserCompoundKey idUser;
    private String idHoteles;

}
