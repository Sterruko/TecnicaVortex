package com.prueba.TecnicaVortex.service;

import com.prueba.TecnicaVortex.dto.DriverDto;
import com.prueba.TecnicaVortex.exception.GenericExeption;

import java.util.List;

public interface IdriverService {

    DriverDto save(DriverDto driverDto) throws GenericExeption;

    List<DriverDto> getALL();

}
