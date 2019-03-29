package com.sed.pms.sdr.api.service;

import com.sed.pms.sdr.api.model.SuplierInfo;
import com.sed.pms.sdr.api.repository.SuplierDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SuplierDetailsService {
    private SuplierDetailsRepository suplierDetailsRepository;

    @Autowired
    SuplierDetailsService(SuplierDetailsRepository suplierDetailsRepository) {
        this.suplierDetailsRepository = suplierDetailsRepository;
    }
    public List<SuplierInfo> getSupliersInfo() {
        return suplierDetailsRepository.getSuplierInfo();

    }

    public void putSupliersInfo(SuplierInfo suplierInfoList) {
        suplierDetailsRepository.putSupliersInfo(suplierInfoList);
    }
}
