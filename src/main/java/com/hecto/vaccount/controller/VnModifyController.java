package com.hecto.vaccount.controller;

import com.hecto.vaccount.dto.VaccountModifyDto;
import com.hecto.vaccount.domain.impl.VaccountModifyServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
@Slf4j
@RestController
@RequestMapping("/vaccount")
public class VnModifyController {

    private final VaccountModifyServiceImpl vaccountModifyService;

    @Autowired
    public VnModifyController(VaccountModifyServiceImpl vaccountModifyService) {
        this.vaccountModifyService = vaccountModifyService;
    }


    @PostMapping("/modify")
    public VaccountModifyDto VaccountNumberModify(@RequestBody VaccountModifyDto vaccountModifyDto){

        return this.vaccountModifyService.save(vaccountModifyDto);

    }

}
