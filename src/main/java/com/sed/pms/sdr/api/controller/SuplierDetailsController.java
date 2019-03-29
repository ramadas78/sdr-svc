package com.sed.pms.sdr.api.controller;

import com.sed.pms.sdr.api.model.SuplierInfo;
import com.sed.pms.sdr.api.service.SuplierDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SuplierDetailsController {
    private SuplierDetailsService suplierDetailsService;

    @Autowired
    SuplierDetailsController(SuplierDetailsService suplierDetailsService) {
        this.suplierDetailsService = suplierDetailsService;
    }

    @GetMapping(value = "pms/v1/supdetails", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<SuplierInfo>> getSupliersInfo() throws Exception{
        return new ResponseEntity (suplierDetailsService.getSupliersInfo(), HttpStatus.OK);
    }

    @PostMapping(value = "pms/v1/supdetails", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity putSupliersInfo(@RequestBody SuplierInfo suplierInfoList) throws Exception {
        suplierDetailsService.putSupliersInfo(suplierInfoList);
        return new ResponseEntity("Row Created",HttpStatus.CREATED);
    }

}
