package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.repository;

import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities.HabitacionEntity;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities.HotelEntity;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Web.dto.HotelDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface habitacionRepository extends JpaRepository<HabitacionEntity,String> {

    Optional<List<HabitacionEntity>>findByHotelIdHotel(String hotelDto);
}
