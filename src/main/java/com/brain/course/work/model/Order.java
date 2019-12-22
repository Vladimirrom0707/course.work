package com.brain.course.work.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "Order")
public class Order {

    @Id
    @Column(name = "id",length = 1,nullable = false)
    private Long id;

    @Id
    @Column(name = "id of property",length = 1,nullable = false)
    private Long idOfProperty;

    @Id
    @Column(name = "owner's id",length = 1,nullable = false)
    private Long idOwner;

    @Id
    @Column(name = "client's id",length = 1,nullable = false)
    private Long idOfClient;

    @Column(name = "date of conclusion",length = 36,nullable = false)
    private int dateOfConclusion;

    @Column(name = "date of ending",length = 36,nullable = false)
    private int dateOfEnding;
}
