package com.prueba.TecnicaVortex.repository;

import com.prueba.TecnicaVortex.Entity.DriverEntity;
import com.prueba.TecnicaVortex.Entity.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IvehicleRepository extends JpaRepository<DriverEntity, Integer> {

    VehicleEntity save(VehicleEntity vechicle);
}
