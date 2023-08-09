package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Service.implementations;

import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities.HotelEntity;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.repository.hotelRepository;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Service.interfaces.hotelService;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.dto.HotelDto;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.dto.UserDto;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.exceptions.BadRequestException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class hotelServiceImpl implements hotelService {
    @Autowired
    hotelRepository hotelRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public HotelDto crearHotel(HotelDto hotelDto) {
        HotelEntity hotelEntity = modelMapper.map(hotelDto,HotelEntity.class);
        return modelMapper.map(hotelRepository.save(hotelEntity),HotelDto.class);
    }

    @Override
    public List<HotelDto> obtenerHoteles() {
        List<HotelEntity> hotelEntitys =  hotelRepository.findAll();

        List<HotelDto> hotelDtoList = hotelEntitys.stream().
                map(hotelEntity -> modelMapper.map(hotelEntity,HotelDto.class)).
                collect(Collectors.toList());

        return  hotelDtoList;
    }

    @Override
    public HotelDto obtenerHotelePorCorreo(String correo) {
        HotelEntity hotelEntity = hotelRepository.findByCorreoElectronico(correo).
                orElseThrow(()-> new BadRequestException("no se pudo encontrar " +
                        "usuarios administradores de hoteles"));

        return modelMapper.map(hotelEntity,HotelDto.class);
    }
}
