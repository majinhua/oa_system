package com.hpeu.oa.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_Role")
public class Role {

    private int id;

    private String name;



    public int getId() {
        return id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name",length = 20,nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
