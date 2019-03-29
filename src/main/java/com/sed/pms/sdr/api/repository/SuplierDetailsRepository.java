package com.sed.pms.sdr.api.repository;

import com.sed.pms.sdr.api.model.SuplierInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SuplierDetailsRepository {
    @Autowired
    private CassandraOperations cassandraOperations;

    public List<SuplierInfo> getSuplierInfo() {
        List<SuplierInfo> suplierInfoResponse = new ArrayList<>();
        suplierInfoResponse = cassandraOperations.selectAll(SuplierInfo.class);
        return suplierInfoResponse;
    }

    public void putSupliersInfo(SuplierInfo suplierInfoList) {
        cassandraOperations.insert(suplierInfoList);
    }


}
