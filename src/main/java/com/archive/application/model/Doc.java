package com.archive.application.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "docs")
public class Doc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "EMPLOYEE_NAME")
    private String name;
    @Column(name = "DEPARTMENT")
    private String department;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "NUM")
    private Long number;
}
