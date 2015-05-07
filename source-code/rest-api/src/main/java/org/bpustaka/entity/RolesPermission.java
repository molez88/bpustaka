package org.bpustaka.entity;

import org.hibernate.annotations.SelectBeforeUpdate;

import javax.persistence.*;

@Entity(name = "roles_permission")
@SelectBeforeUpdate(value = false)
public class RolesPermission {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name="id_permission")
    private Permission permission;

    @ManyToOne
    @JoinColumn(name="id_roles")
    private Roles roles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

}
