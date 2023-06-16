package com.hecto.vaccount.infra;

import com.hecto.vaccount.model.VaccountModifyHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccountModifyRepository extends JpaRepository<VaccountModifyHistory, String> {

}
