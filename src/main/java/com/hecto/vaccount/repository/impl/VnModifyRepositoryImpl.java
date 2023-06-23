package com.hecto.vaccount.repository.impl;

import com.hecto.vaccount.dto.VnModifyDto;
import com.hecto.vaccount.repository.VnModifyRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
//4. InfraStructure Layer
public class VnModifyRepositoryImpl implements VnModifyRepository {

    private final JdbcTemplate jdbcTemplate;

    public VnModifyRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public VnModifyDto save(VnModifyDto vnModifyDto) {
        String sql = "insert into VACCOUNT_MODIFY_HISTORY(mid,tid,ver) values(?,?,?)";
        jdbcTemplate.update(sql,vnModifyDto.getMid(),vnModifyDto.getTid(),vnModifyDto.getVer());
        return vnModifyDto;
    }
}
