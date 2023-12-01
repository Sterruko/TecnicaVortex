package com.prueba.TecnicaVortex.controller;

import com.prueba.TecnicaVortex.constant.ErrorResponse;
import com.prueba.TecnicaVortex.dto.VehicleDto;
import com.prueba.TecnicaVortex.exception.GenericExeption;
import com.prueba.TecnicaVortex.service.impl.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("vehicle")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @PostMapping("/create_vehicle")
    public ResponseEntity<Object> saveDriver(@RequestBody VehicleDto vehicleDto) {

        VehicleDto vehicleSaved;
        try {
            vehicleSaved = vehicleService.save(vehicleDto);
        } catch (GenericExeption e) {
            return new ResponseEntity<>(new ErrorResponse(e.getMessage()), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(vehicleSaved, HttpStatus.OK);
    }
}
