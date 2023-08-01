package guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.repository;

import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities.UserEntity;
import guia.utp.proyectofinalspringboot.proyectofinalspringboot.Model.entities.compoundkeys.UserCompoundKey;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface userRepository extends JpaRepository<UserEntity , UserCompoundKey> {
    Optional<UserEntity> findByUserCompoundKey(UserCompoundKey userCompoundKey);

    Optional<UserEntity>findByCorreoElectronicoAndPassword(String correo,String contrasena);
}
