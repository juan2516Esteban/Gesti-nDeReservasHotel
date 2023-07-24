package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities.compoundkeys;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@EqualsAndHashCode
@Setter
@Getter
@ToString
public class UserCompoundKey implements Serializable {

    private String key1;

    private String key2;

}
