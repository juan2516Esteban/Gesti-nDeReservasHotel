package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Service.implementations;

import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities.HotelEntity;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.repository.hotelRepository;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Service.interfaces.hotelService;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.dto.HotelDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
