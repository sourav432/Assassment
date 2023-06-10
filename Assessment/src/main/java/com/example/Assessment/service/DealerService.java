package com.example.Assessment.service;

import com.example.Assessment.entity.DealerMaster;
import com.example.Assessment.repo.DealerMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class DealerService {

    @Autowired
    private DealerMasterRepository dealerRepository;


    public Page<DealerMaster> getAllActiveDealers(PageRequest pageable) {
        return dealerRepository.findAllActiveDealers(pageable);
    }
}