package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.repository;

import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities.ReservaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface reservaRepository extends JpaRepository<ReservaEntity , Integer> {
}
