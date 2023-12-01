package com.prueba.TecnicaVortex.service;

import com.prueba.TecnicaVortex.dto.DriverDto;
import com.prueba.TecnicaVortex.dto.VehicleDto;
import com.prueba.TecnicaVortex.exception.GenericExeption;

public interface IvehicleService {

    VehicleDto save(VehicleDto vehicleDto) throws GenericExeption;
}
