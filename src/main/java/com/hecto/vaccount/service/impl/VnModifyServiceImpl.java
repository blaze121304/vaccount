package com.hecto.vaccount.service.impl;

import com.hecto.vaccount.dto.VnModifyDto;
import com.hecto.vaccount.model.VnModifyModel;
import com.hecto.vaccount.repository.VnModifyRepository;
import com.hecto.vaccount.repository.VnModifyRepositoryJpa;
import com.hecto.vaccount.service.VnModifyService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VnModifyServiceImpl implements VnModifyService {
    //2. Application Layer
    private final VnModifyRepository vnModifyRepository;
    private final VnModifyRepositoryJpa vnModifyRepositoryJpa;

    @Autowired
    public VnModifyServiceImpl(VnModifyRepository vnModifyRepository, VnModifyRepositoryJpa vnModifyRepositoryJpa) {
        this.vnModifyRepository = vnModifyRepository;
        this.vnModifyRepositoryJpa = vnModifyRepositoryJpa;
    }


    @Override
    public VnModifyDto save(VnModifyDto vnModifyDto) {

        //String mchtTrdNo = vnModifyDto.getMchtTrdNo();
        //VnModifyModel vnModifyModel = this.dtoToEntity(vnModifyDto);
        //VnModifyModel vnSaveModel = this.vnModifyRepository.save(vnModifyModel);
        //VnModifyModel vnSaveModel = this.vnModifyRepository.insert(vnModifyModel,mchtTrdNo);

        //return new VnModifyDto(vnSaveModel);

        VnModifyModel vnModifyModel = dtoToEntity(vnModifyDto);
        VnModifyModel savedModel = vnModifyRepository.save(vnModifyModel);
        return new VnModifyDto(savedModel);

    }

    @Override
    public VnModifyDto savejpa(VnModifyDto vnModifyDto) {
        //String t_id = vnModifyDto.getMchtTrdNo();
        VnModifyModel vnModifyModel = dtoToEntity(vnModifyDto);

        VnModifyModel savedModel = vnModifyRepositoryJpa.save(vnModifyModel);

        int a = 1;

        return new VnModifyDto(savedModel);
    }

    private VnModifyModel dtoToEntity(VnModifyDto vnModifyDto) {
        VnModifyModel vnModifyModel = new VnModifyModel();
        BeanUtils.copyProperties(vnModifyDto, vnModifyModel);
        return vnModifyModel;
    }
}
