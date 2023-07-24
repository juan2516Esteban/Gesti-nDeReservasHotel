package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionResponse {

    private Date timestam;

    private String description;

    private String message;

    private String httpCodeMessage;
}
