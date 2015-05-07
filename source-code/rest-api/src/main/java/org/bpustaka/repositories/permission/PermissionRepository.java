package org.bpustaka.repositories.permission;

import org.bpustaka.entity.Permission;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by galih.lasahido@gmail.com on 2/5/14.
 */

public interface PermissionRepository extends JpaRepository<Permission, String> {
    public Page<Permission> getPermissionByLabelIgnoreCaseContaining(Pageable pageable, String label);
    public Permission getPermissionByLabelIgnoreCase(String label);
    public Permission getPermissionByValueIgnoreCase(String label);
    public Permission findPermissionByValueIgnoreCaseAndIdNot(String value, String id);

}