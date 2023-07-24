package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {

    private String name;

    private String telefono;

    private String documento;

    private String tipoDeDocumento;

    private String correoElectronico;

    private String password;

}
