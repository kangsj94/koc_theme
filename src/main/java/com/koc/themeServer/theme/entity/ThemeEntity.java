package com.koc.themeServer.theme.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "theme")
public class ThemeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    private String themeName;

    private String emoji;

//    private List<String> placeList;
//    @OneToMany
//    @JoinColumn(name = "id")
//    private List<ThemeLikeEntity> themeLikes;

}
