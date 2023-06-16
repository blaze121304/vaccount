package com.hecto.vaccount.domain.impl;

import com.hecto.vaccount.dto.VaccountModifyDto;
import com.hecto.vaccount.model.VaccountModifyHistory;
import com.hecto.vaccount.infra.VaccountModifyRepository;
import com.hecto.vaccount.domain.VaccountModifyService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VaccountModifyServiceImpl implements VaccountModifyService {

    private final VaccountModifyRepository vaccountModifyRepository;

    @Autowired
    public VaccountModifyServiceImpl(VaccountModifyRepository vaccountModifyRepository) {
        this.vaccountModifyRepository = vaccountModifyRepository;
    }


    @Override
    public VaccountModifyDto save(VaccountModifyDto vaccountModifyDto) {

        String mchtTrdNo = vaccountModifyDto.getMchtTrdNo();
        VaccountModifyHistory vaccountModifyHistory = this.dtoToEntity(vaccountModifyDto);
        VaccountModifyHistory savevaccountModifyHistory = this.vaccountModifyRepository.save(vaccountModifyHistory);

        return new VaccountModifyDto(savevaccountModifyHistory);

    }

    private VaccountModifyHistory dtoToEntity(VaccountModifyDto vaccountModifyDto) {
        VaccountModifyHistory vaccountModifyHistory = new VaccountModifyHistory();
        BeanUtils.copyProperties(vaccountModifyDto, vaccountModifyHistory);
        return vaccountModifyHistory;
    }
}
