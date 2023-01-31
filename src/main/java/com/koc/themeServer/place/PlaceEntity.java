package com.koc.themeServer.place;

import com.koc.themeServer.theme.entity.ThemeEntity;
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
@Table(name = "place")
public class PlaceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;
    
    private String placeName;

    @ManyToOne
    @JoinColumn(name = "theme_id")
    private ThemeEntity theme;
}
