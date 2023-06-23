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

    @Transactional
    public void VaccountModifyBiz(){
        VnModifyDto vnModifyDto = new VnModifyDto();
        validation(vnModifyDto);
        save(vnModifyDto);
    }


    private void validation(VnModifyDto vnModifyDto){
        if(vnModifyDto.getMid().equals("ex")){
            throw new IllegalStateException("예외발생");
        }
    }

    @Override
    public VnModifyDto save(VnModifyDto vnModifyDto) {
        vnModifyRepository.save(vnModifyDto);
        return vnModifyDto;
    }
}
