package com.prueba.TecnicaVortex.service.impl;

import com.prueba.TecnicaVortex.Entity.DriverEntity;
import com.prueba.TecnicaVortex.dto.DriverDto;
import com.prueba.TecnicaVortex.exception.GenericExeption;
import com.prueba.TecnicaVortex.mapper.DriverMapper;
import com.prueba.TecnicaVortex.repository.IdriverRepository;
import com.prueba.TecnicaVortex.service.IdriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DriverService implements IdriverService {

    @Autowired
    private IdriverRepository idriverRepository;

    @Autowired
    private DriverMapper driverMapper;


    @Override
    public DriverDto save(DriverDto driverDtoToSave) throws GenericExeption{

        if(driverDtoToSave.getDni().isEmpty()){
            throw new GenericExeption (String.format("El número de identificación se encuentra vacío."));
        }

        if(driverDtoToSave.getName().isEmpty()){
            throw new GenericExeption (String.format("El nombre debe estar diligenciado."));
        }

        if(driverDtoToSave.getPhone().isEmpty()){
            throw new GenericExeption (String.format("El teléfono debe estar diligenciado."));
        }

        DriverDto driverSaved = driverMapper.toDriverDto(
                idriverRepository.save(driverMapper.toDriveEntity(driverDtoToSave)));

        return driverSaved;
    }

    @Override
    public List<DriverDto> getALL(){
        List<DriverEntity> driverEntities = idriverRepository.findAll();
        return driverMapper.toListDto(driverEntities);
    }

}
