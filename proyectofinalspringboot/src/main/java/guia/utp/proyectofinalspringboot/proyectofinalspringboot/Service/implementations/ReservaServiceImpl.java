package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Service.implementations;

import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities.ReservaEntity;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities.compoundkeys.ReservaCompoundKey;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.repository.reservaRepository;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.repository.userRepository;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Service.interfaces.reservaService;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.dto.ReservaDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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

        ReservaEntity reservaEntity = modelMapper.map(reservaDto, ReservaEntity.class);

        ReservaCompoundKey reservaCompoundKey = new ReservaCompoundKey();

        reservaCompoundKey.setIdHoteles(reservaDto.getHotel().getIdHotel());
        reservaCompoundKey.setIdUser(reservaDto.getUser().getUserCompoundKey());

        reservaEntity.setReservaCompoundKey(reservaCompoundKey);

        return modelMapper.map(reservaRepositorys.save(reservaEntity),ReservaDto.class);
    }

    @Override
    public void eliminarReserva(ReservaDto reservaDto) {

        ReservaEntity reservaEntity = modelMapper.map(reservaDto,ReservaEntity.class);

        reservaRepositorys.delete(reservaEntity);
    }

    @Override
    public ReservaDto modificarReserva(ReservaDto reservaDto) {

        ReservaEntity reservaEntity = modelMapper.map(reservaDto, ReservaEntity.class);

        ReservaCompoundKey reservaCompoundKey = new ReservaCompoundKey();

        reservaCompoundKey.setIdHoteles(reservaDto.getHotel().getIdHotel());
        reservaCompoundKey.setIdUser(reservaDto.getUser().getUserCompoundKey());

        reservaEntity.setReservaCompoundKey(reservaCompoundKey);

        return modelMapper.map(reservaRepositorys.save(reservaEntity),ReservaDto.class);
    }


}
