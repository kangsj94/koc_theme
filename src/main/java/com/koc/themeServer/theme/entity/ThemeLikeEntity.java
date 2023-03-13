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
@Table(name = "theme_like")
public class ThemeLikeEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private long id;

  private long userId;

  private long themeId;

  private boolean isLiked;


  public ThemeLikeEntity switchLike(){
    this.isLiked=!this.isLiked;
    return this;
  }
}
