package com.prueba.TecnicaVortex.service.impl;

import com.prueba.TecnicaVortex.dto.VehicleDto;
import com.prueba.TecnicaVortex.exception.GenericExeption;
import com.prueba.TecnicaVortex.mapper.VehicleMapper;
import com.prueba.TecnicaVortex.repository.IvehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {
    @Autowired
    private VehicleMapper vehicleMapper;

    @Autowired
    private IvehicleRepository ivehicleRepository;

    public VehicleDto save(VehicleDto vehicleDto) throws GenericExeption {

        if (vehicleDto.getModel().isEmpty()) {
            throw new GenericExeption(String.format("El modelo del vehiculo es obligatorio."));
        }

        if (vehicleDto.getPlate().isEmpty()) {
            throw new GenericExeption(String.format("La plata debe ser diligenciada."));
        }


        VehicleDto vehicleSaved = vehicleMapper.toVehicleDto(
                ivehicleRepository.save(vehicleMapper.toVehicleEntity(vehicleDto)));

        return vehicleSaved;
    }


}
