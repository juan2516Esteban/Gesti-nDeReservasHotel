package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.repository;

import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities.HabitacionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface habitacionRepository extends JpaRepository<HabitacionEntity,String> {
}
