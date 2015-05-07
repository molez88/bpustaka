package org.bpustaka.entity;

import org.hibernate.annotations.SelectBeforeUpdate;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "roles")
@SelectBeforeUpdate(value = false)
public class Roles {

    @Id
    @Column(name = "id_roles",unique = true)
    private String id;
    private String name;
    private String description;

    @OneToMany(mappedBy="roles", fetch = FetchType.LAZY)
    private List<MemberEntity> usersList;

    @OneToMany(mappedBy="roles", fetch = FetchType.LAZY)
    private List<RolesPermission> rolesPermissions;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<MemberEntity> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<MemberEntity> usersList) {
        this.usersList = usersList;
    }

    public List<RolesPermission> getRolesPermissions() {
        return rolesPermissions;
    }

    public void setRolesPermissions(List<RolesPermission> rolesPermissions) {
        this.rolesPermissions = rolesPermissions;
    }
}
