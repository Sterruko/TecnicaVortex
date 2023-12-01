package com.prueba.TecnicaVortex.repository;

import com.prueba.TecnicaVortex.Entity.DriverEntity;
import com.prueba.TecnicaVortex.dto.DriverDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IdriverRepository extends JpaRepository<DriverEntity, Integer> {

    DriverEntity save(DriverEntity driver);
}
