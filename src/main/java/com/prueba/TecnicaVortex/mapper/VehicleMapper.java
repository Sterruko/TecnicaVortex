package com.prueba.TecnicaVortex.mapper;

import com.prueba.TecnicaVortex.Entity.VehicleEntity;
import com.prueba.TecnicaVortex.dto.VehicleDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VehicleMapper {
    VehicleDto toVehicleDto(VehicleEntity vehicleEntity);

    @InheritInverseConfiguration
    VehicleEntity toVehicleEntity(VehicleDto vehicleDto);

    List<VehicleDto> toListDto(List<VehicleEntity> vehicleEntity);

    @InheritInverseConfiguration
    List<VehicleEntity> toListEntity(List<VehicleDto> vehicleEntity);
}




