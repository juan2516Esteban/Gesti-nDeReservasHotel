package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities;

import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities.compoundkeys.UserCompoundKey;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Usuarios")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@ToString
public class UserEntity implements Serializable {

    @EmbeddedId
    private UserCompoundKey userCompoundKey;

    @Column(name = "nombre")
    private String name;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "documento")
    private String documento;

    @Column(name = "tpDeDocumento")
    private String tipoDeDocumento;

    @Column(name = "correoElectronico")
    private String CorreoElectronico;

    @Column(name = "Contraseña"
    private String password;

}
