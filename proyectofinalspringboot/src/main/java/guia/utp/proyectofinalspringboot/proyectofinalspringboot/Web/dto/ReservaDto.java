package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.dto;

import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities.compoundkeys.UserCompoundKey;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.LifecycleState;
import org.springframework.boot.autoconfigure.flyway.FlywayDataSource;

import javax.persistence.JoinColumn;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class ReservaDto {

    private String códigoDeHabilitación;

    private Date fechaDeInicio;

    private Date fechaDeFin;

    private Integer numeroDeHabitaciones;

    private UserDto user;

}
