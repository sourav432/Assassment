package com.example.Assessment.controller;

import com.example.Assessment.entity.DealerMaster;
import com.example.Assessment.service.DealerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dealers")
public class DealerController {

    @Autowired
    private  DealerService dealerService;



    @GetMapping
    public Page<DealerMaster> getAllDealers(@RequestParam(defaultValue = "0") int page,
                                            @RequestParam(defaultValue = "10") int size) {
        return dealerService.getAllActiveDealers(PageRequest.of(page, size));
    }
}