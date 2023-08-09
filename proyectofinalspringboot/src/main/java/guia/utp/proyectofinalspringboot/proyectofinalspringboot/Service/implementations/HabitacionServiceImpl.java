package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Service.implementations;

import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities.HabitacionEntity;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities.compoundkeys.HabitacionCompoundKey;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.repository.habitacionRepository;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Service.interfaces.habitacionService;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.dto.HabitacionesDto;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.exceptions.BadRequestException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HabitacionServiceImpl implements habitacionService {

    @Autowired
    ModelMapper modelMapper;
    @Autowired
    habitacionRepository habitacionRepositorys;

    @Override
    public HabitacionesDto crearHbaitacion(HabitacionesDto habitacionesDto) {

        HabitacionEntity habitacionEntity = modelMapper.map(habitacionesDto,HabitacionEntity.class);

        HabitacionCompoundKey habitacionCompoundKey = new HabitacionCompoundKey();

        habitacionCompoundKey.setIdHotel(habitacionesDto.getHotel().getIdHotel());
        habitacionCompoundKey.setIdhabitacion(habitacionesDto.getIdHabitaciones());

        habitacionEntity.setHabitacionCompoundKey(habitacionCompoundKey);


        return (modelMapper.map(habitacionRepositorys.save(habitacionEntity),HabitacionesDto.class));
    }

    @Override
    public List<HabitacionesDto> obtenerHabitaciones(String idHotel) {

        List<HabitacionEntity> habitacionEntities = habitacionRepositorys.findByHotelIdHotel(idHotel).
                orElseThrow(() -> new BadRequestException("No se encontraron habitaciones"));

        List<HabitacionesDto> habitacionesDtos = habitacionEntities.stream()
                .map(HabitacionEntity -> modelMapper.map(HabitacionEntity,HabitacionesDto.class))
                .collect(Collectors.toList());

        return habitacionesDtos;
    }


}
