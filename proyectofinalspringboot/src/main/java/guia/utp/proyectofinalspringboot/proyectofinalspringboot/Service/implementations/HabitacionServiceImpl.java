package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Service.implementations;

import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities.HabitacionEntity;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities.compoundkeys.HabitacionCompoundKey;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.repository.habitacionRepository;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Service.interfaces.habitacionService;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.dto.HabitacionesDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        habitacionCompoundKey.setIdhabitacion(habitacionesDto.getIdHabitacion());

        habitacionEntity.setHabitacionCompoundKey(habitacionCompoundKey);


        return (modelMapper.map(habitacionRepositorys.save(habitacionEntity),HabitacionesDto.class));
    }
}
