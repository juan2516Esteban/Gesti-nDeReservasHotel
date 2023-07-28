package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.repository;

import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface hotelRepository extends JpaRepository<HotelEntity,String> {
}
