package com.prueba.TecnicaVortex.mapper;

import com.prueba.TecnicaVortex.Entity.DriverEntity;
import com.prueba.TecnicaVortex.dto.DriverDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DriverMapper {

    DriverDto toDriverDto(DriverEntity driverEntity);

    @InheritInverseConfiguration
    DriverEntity toDriveEntity(DriverDto driverDto);

    List<DriverDto> toListDto(List<DriverEntity> driverEntity);

    @InheritInverseConfiguration
    List<DriverEntity> toListEntity(List<DriverDto> driverDto);
}
