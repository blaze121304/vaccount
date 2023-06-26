package com.hecto.vaccount.service.impl;

import com.hecto.vaccount.dto.VnModifyDto;
import com.hecto.vaccount.repository.VnModifyRepository;
import com.hecto.vaccount.service.VnModifyService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class VnModifyServiceImpl implements VnModifyService {
    //2. Application Layer
    private final VnModifyRepository vnModifyRepository;

    public VnModifyServiceImpl(VnModifyRepository vnModifyRepository) {
        this.vnModifyRepository = vnModifyRepository;
    }

    private void Validation(VnModifyDto vnModifyDto){
        if(vnModifyDto.getMid().equals("ex")){
            throw new IllegalStateException("예외발생");
        }
    }

    public VnModifyDto DbExcute(VnModifyDto vnModifyDto) {
        return vnModifyRepository.save(vnModifyDto);
    }

    @Override
    @Transactional
    public VnModifyDto VnModifyBiz(VnModifyDto vnModifyDto) {
        System.out.println("Service(1)");
        Validation(vnModifyDto);
        System.out.println("Service(2)");
        return DbExcute(vnModifyDto);
    }



}
