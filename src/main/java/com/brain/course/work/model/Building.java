package com.brain.course.work.model;

import lombok.Data;
import javax.persistence.*;


@Entity
@Data
@Table(name = "Building")
public class Building {

    @Id
    @GeneratedValue
    @Column(name = "id",nullable = false)
    private Long id;

    @Column(name = "type",length = 36 ,nullable = false)
    private String type;

    @Column(name = "address",length = 128,nullable = false)
    private String address;

    @Column(name = "numberOfRooms",length = 1,nullable = false)
    private int numberOfRooms;

    @Column(name = "cost",length = 36,nullable = false)
    private int cost;

    @Column(name = "area",length = 8,nullable = false)
    private int area;

    @Column(name = "floor",length = 1,nullable = false)
    private String floor;
}
