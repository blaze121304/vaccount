package com.hecto.vaccount.repository;

import com.hecto.vaccount.dto.VnModifyDto;
import com.hecto.vaccount.model.VnModifyModel;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;

//4. InfraStructure Layer
public interface VnModifyRepository {
    VnModifyModel save(VnModifyModel vnModifyModel);
}



