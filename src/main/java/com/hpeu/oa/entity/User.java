package com.hpeu.oa.entity;

import javax.persistence.*;


@Entity
@Table(name = "t_user")
public class User {


    private int id;

    private String name;

    private String password;

    private Role role;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

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

    @Column(name = "password",length = 20,nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @ManyToOne(targetEntity = Role.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(columnDefinition = "role_id")
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
