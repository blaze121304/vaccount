package com.hecto.vaccount.controller;

import com.hecto.vaccount.dto.VnModifyDto;
import com.hecto.vaccount.service.impl.VnModifyServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
@Slf4j
@RestController
@RequestMapping("/vaccount")
public class VnModifyController {
    
    //1. Presentaion Layer
    private final VnModifyServiceImpl vnModifyService;

    @Autowired
    public VnModifyController(VnModifyServiceImpl vnModifyService) {
        this.vnModifyService = vnModifyService;
    }


    @PostMapping("/modify")
    public VnModifyDto VaccountNumberModify(@RequestBody VnModifyDto vnModifyDto){

        //컨트롤러에서는 값이 있냐 없냐 약한 validation정도만 수행
        System.out.println("modify");
        return this.vnModifyService.save(vnModifyDto);


    }

}
