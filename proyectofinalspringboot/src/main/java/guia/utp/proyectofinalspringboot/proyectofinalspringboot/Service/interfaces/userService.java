package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Service.interfaces;

import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities.compoundkeys.UserCompoundKey;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.dto.UserDto;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.dto.response.UserResponse;

import java.util.List;

public interface userService {
    public UserDto crearUsuario(UserDto userDto);
    public UserResponse obtenerUser(String id1 , String id2);
}
