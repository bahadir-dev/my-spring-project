package com.bahd.entity;

import javax.persistence.*;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {
    @Id
    private Long id;
}
