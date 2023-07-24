package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Service.implementations;

import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities.UserEntity;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities.compoundkeys.UserCompoundKey;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.repository.userRepository;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Service.interfaces.userService;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.dto.UserDto;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.dto.response.UserResponse;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.exceptions.BadRequestException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements userService {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    userRepository userRepositorys;
    @Override
    public UserDto crearUsuario(UserDto userDto) {

        UserEntity userEntity = modelMapper.map(userDto,UserEntity.class);

        UserCompoundKey userCompoundKey = new UserCompoundKey();

        userCompoundKey.setKey1(userDto.getDocumento());
        userCompoundKey.setKey2(userDto.getTipoDeDocumento());

        userEntity.setUserCompoundKey(userCompoundKey);

        return modelMapper.map(userRepositorys.save(userEntity),UserDto.class);
    }

    @Override
    public UserResponse obtenerUser(String id1 , String id2) {

        UserCompoundKey userCompoundKey = new UserCompoundKey(id1,id2);

        UserEntity userEntities = userRepositorys.findByUserCompoundKey(
                userCompoundKey).
                orElseThrow(()-> new BadRequestException("el libro no fue encontrado "));

        return modelMapper.map(userEntities, UserResponse.class);
    }
}
