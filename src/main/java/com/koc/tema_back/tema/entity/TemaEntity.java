package com.koc.tema_back.tema.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;


@Entity
@Getter
@Builder
@Table(name = "tema")
public class TemaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    private String temaName;

    private String iconUrl;


}
