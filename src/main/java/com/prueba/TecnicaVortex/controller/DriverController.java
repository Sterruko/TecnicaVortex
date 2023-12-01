package com.prueba.TecnicaVortex.controller;

import com.prueba.TecnicaVortex.constant.ErrorResponse;
import com.prueba.TecnicaVortex.dto.DriverDto;
import com.prueba.TecnicaVortex.exception.GenericExeption;
import com.prueba.TecnicaVortex.service.impl.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("driver")
public class DriverController {

    @Autowired
    private DriverService driverService;

    @PostMapping("/createDriver")
    public ResponseEntity<Object> saveDriver(@RequestBody DriverDto driverDto) {

        DriverDto driverSaved;
        try {
            driverSaved = driverService.save(driverDto);
        } catch (GenericExeption e) {
            return new ResponseEntity<>(new ErrorResponse(e.getMessage()), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(driverSaved, HttpStatus.OK);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<DriverDto>> findAll() {
        List<DriverDto> driverDtos = driverService.getALL();
        return new ResponseEntity<>(driverDtos, HttpStatus.OK);
    }
}