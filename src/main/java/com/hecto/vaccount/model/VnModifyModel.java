package com.hecto.vaccount.model;

import lombok.Data;

import javax.persistence.*;

//3. Domain Layer
@Entity
@Table(name = "VaccountModifyHistory")
@Data
public class VnModifyModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String mid;
    private String tid;
    private String ver;


}
