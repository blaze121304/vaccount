package com.hecto.vaccount.controller;

import com.hecto.vaccount.common.exception.UserNotFoundException;
import com.hecto.vaccount.dto.VnModifyDto;
import com.hecto.vaccount.service.VnModifyService;
import com.hecto.vaccount.service.impl.VnModifyServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Slf4j
@RestController
@RequestMapping("/vaccount")
public class VnModifyController {
    
    //1. Presentaion Layer
    private VnModifyService vnModifyService;

    //인터페이스 의존, Dependency Injection, 생성자 주입
    public VnModifyController(VnModifyService vnModifyService) {
        this.vnModifyService = vnModifyService;
    }

    @PostMapping("/modify")
    public VnModifyDto VaccountNumberModify(@RequestBody VnModifyDto vnModifyDto){

        //PK가 없는 경우
        if(vnModifyDto.getMid() == ""){
            throw new UserNotFoundException(String.format("Mid is must have value"));
        }

        return vnModifyService.VnModifyBiz(vnModifyDto);

    }

}
