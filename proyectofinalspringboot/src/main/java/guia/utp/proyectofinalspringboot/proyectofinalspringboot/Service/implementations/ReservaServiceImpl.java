package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Service.implementations;

import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities.ReservaEntity;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities.UserEntity;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities.compoundkeys.UserCompoundKey;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.repository.reservaRepository;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.repository.userRepository;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Service.interfaces.reservaService;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.dto.ReservaDto;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.dto.UserDto;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.exceptions.BadRequestException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class ReservaServiceImpl implements reservaService {

    @Autowired
    reservaRepository reservaRepositorys;

    @Autowired
    userRepository userRepositorys;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public ReservaDto crearReserva(ReservaDto reservaDto) {

        UserDto userDto = reservaDto.getUser();

        ReservaEntity reservaEntity = modelMapper.map(reservaDto, ReservaEntity.class);


        return modelMapper.map(reservaRepositorys.save(reservaEntity),ReservaDto.class);
    }
}
