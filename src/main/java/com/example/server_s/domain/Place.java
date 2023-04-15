package com.example.server_s.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "place")
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "adress")
    private String adress;
    @Column(name = "information")
    private String informarion;
    @Column(name = "X")
    private double corX;
    @Column(name = "Y")
    private double corY;
    @Column(name = "time")
    private long time;
    @Column(name = "userId")
    private long userId;
}
