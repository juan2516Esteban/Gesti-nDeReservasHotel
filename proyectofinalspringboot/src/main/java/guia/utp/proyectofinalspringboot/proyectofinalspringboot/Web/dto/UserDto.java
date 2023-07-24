package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.dto;

import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities.compoundkeys.UserCompoundKey;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private UserCompoundKey userCompoundKey;

    private String name;

    private String telefono;

    private String documento;

    private String tipoDeDocumento;

    private String correoElectronico;

    private String password;
}
