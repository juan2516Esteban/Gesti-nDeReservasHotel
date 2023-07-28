package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Service.interfaces;

import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities.compoundkeys.UserCompoundKey;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.dto.UserDto;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.dto.response.UserResponse;

import java.util.List;

public interface userService {
    UserDto obtenerUserPorCorreoContraseña(String correo, String contraseña);

    UserDto crearUsuario(UserDto userDto);
    UserResponse obtenerUser(String id1 , String id2);
}
