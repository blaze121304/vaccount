package com.hecto.vaccount.repository.impl;

import com.hecto.vaccount.model.VnModifyModel;
import com.hecto.vaccount.repository.VnModifyRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
//4. InfraStructure Layer
public class VnModifyRepositoryImpl implements VnModifyRepository {

    @Override
    public VnModifyModel save(VnModifyModel vnModifyModel) {

        return null;

    }
}
