package org.bpustaka.repositories.user;

import org.bpustaka.entity.MemberEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Created by galihlasahido on 10/5/14.
 */

@Component
public interface MemberService {
    public void save(MemberEntity dto);
    public void delete(MemberEntity dto);
    public MemberEntity findMemberEntityById(String id);
    public MemberEntity findMemberEntityByUsername(String username);
    public MemberEntity findMemberEntityByUsernameAndNotThisId(String username, String id);
    Page<MemberEntity> findAllMemberEntity(Pageable pageable);
    Page<MemberEntity> searchMemberEntity(Pageable pageable, String mode, String value);
    public void updatePassword(String password, Long id);
    public void updateProfile(MemberEntity dto);
    public List<Map<String, Object>> getSomething();
}
