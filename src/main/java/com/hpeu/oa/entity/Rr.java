package com.hpeu.oa.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_Rr")
public class Rr {

    private int id;

    private Resource resourceByResId;

    private Role roleByRoleId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne(targetEntity = Role.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(columnDefinition = "ResId")
    public Resource getResourceByResId() {
        return resourceByResId;
    }

    public void setResourceByResId(Resource resourceByResId) {
        this.resourceByResId = resourceByResId;
    }

    @ManyToOne(targetEntity = Role.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(columnDefinition = "RoleId")
    public Role getRoleByRoleId() {
        return roleByRoleId;
    }

    public void setRoleByRoleId(Role roleByRoleId) {
        this.roleByRoleId = roleByRoleId;
    }
}
