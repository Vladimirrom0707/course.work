package com.brain.course.work.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;


@Data
public class Person {
    @Id
    @Column(name = "id",length = 1,nullable = false)
    private Long id;

    @Column(name = "surname",length = 36,nullable = false)
    private String surname;

    @Column(name = "name",length = 36,nullable = false)
    private String name;

    @Column(name = "second name",length = 36,nullable = false)
    private String secondName;

    @Column(name = "passport",length = 128,nullable = false)
    private String passport;

    @Column(name = "contact telephone",length = 12,nullable = false)
    private int contactTelephone;

    @Id
    @Column(name = "id apartment",length = 1,nullable = false)
    private Long idApartment;

    @Id
    @Column(name = "id order",length = 1,nullable = false)
    private Long idOrder;
}
