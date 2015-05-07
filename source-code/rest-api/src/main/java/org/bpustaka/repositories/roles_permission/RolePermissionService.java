package org.bpustaka.repositories.roles_permission;

import org.bpustaka.entity.RolesPermission;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by galih.lasahido@gmail.com on 2/5/14.
 */

@Component
public interface RolePermissionService {
    public RolesPermission save(RolesPermission dto);
    public void delete(RolesPermission dto);
    public RolesPermission findRolesPermissionById(String id);
    Page<RolesPermission> findAll(Pageable pageable);
    List<RolesPermission> findAll();

}