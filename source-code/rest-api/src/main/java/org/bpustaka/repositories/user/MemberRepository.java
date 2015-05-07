package org.bpustaka.repositories.user;

import org.bpustaka.entity.MemberEntity;
import org.bpustaka.entity.Roles;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

/**
 * Created by galihlasahido on 10/4/14.
 */
public interface MemberRepository extends JpaRepository<MemberEntity, String> {
    @Query("SELECT u FROM MemberEntity u left join u.roles")
    public Page<MemberEntity> findAllWithQuery(Pageable pageable);
    public MemberEntity findMemberEntityByUsernameIgnoreCase(String username);
    public Page<MemberEntity> getMemberEntityByUsernameIgnoreCaseContaining(Pageable pageable, String username);
    public Page<MemberEntity> getMemberEntityByFullnameIgnoreCaseContaining(Pageable pageable, String fullname);
    public MemberEntity findMemberEntityByUsernameIgnoreCaseAndIdNot(String username, String id);

    @Modifying
    @Query(value = "UPDATE MemberEntity u SET u.password = ?1 WHERE u.id = ?2 ")
    public void updatePassword(String password, Long id);

    @Modifying
    @Query(value = "UPDATE MemberEntity u SET u.username = ?1, u.fullname = ?2, u.roles = ?3,  u.active = ?4 WHERE u.id = ?5")
    public void updateProfile(String username, String fullname, Roles roles, Boolean active, String id);

    @Query(value = "SELECT u.id_user, u.username, u.password FROM MemberEntity u", nativeQuery = true)
    public List<Map<String, Object>> getSomething();

}