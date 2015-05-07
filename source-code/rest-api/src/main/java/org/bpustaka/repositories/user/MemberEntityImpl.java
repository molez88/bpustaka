package org.bpustaka.repositories.user;

import org.bpustaka.entity.MemberEntity;
import org.bpustaka.repositories.user.MemberRepository;
import org.bpustaka.repositories.user.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Created by galihlasahido on 10/5/14.
 */
@Service
public class MemberEntityImpl implements MemberService {

    @Autowired(required = true)
    private MemberRepository repository;

    @Transactional
    @Override
    public void save(MemberEntity dto) {
        repository.save(dto);
    }

    @Transactional
    @Override
    public void delete(MemberEntity dto) {
        if (dto == null || dto.getId() == null) {
            return;
        }

        repository.delete(dto);
    }

    @Override
    public MemberEntity findMemberEntityById(String id) {
        if (id==null) {
            return null;
        }

        return repository.findOne(id);
    }

    @Override
    public MemberEntity findMemberEntityByUsername(String username) {
        if (username==null) {
            return null;
        }

        return repository.findMemberEntityByUsernameIgnoreCase(username);
    }

    @Override
    public MemberEntity findMemberEntityByUsernameAndNotThisId(String username, String id) {
        if (username==null) {
            return null;
        }

        if (id==null) {
            return null;
        }

        return repository.findMemberEntityByUsernameIgnoreCaseAndIdNot(username, id);
    }

    @Override
    public Page<MemberEntity> findAllMemberEntity(Pageable pageable) {
        return repository.findAllWithQuery(pageable);
    }

    @Override
    public Page<MemberEntity> searchMemberEntity(Pageable pageable, String mode, String value) {
        Page<MemberEntity> page = null;
        if(mode==null) {
            return null;
        }

        if(value==null) {
            return null;
        }

        switch (mode) {
            case"username":
                default:
                page = repository.getMemberEntityByUsernameIgnoreCaseContaining(pageable,value);
                break;
            case"fullname":
                page = repository.getMemberEntityByFullnameIgnoreCaseContaining(pageable,value);
                break;
        }

        return page;

    }

    @Transactional
    public void updatePassword(String password, Long id) {
        repository.updatePassword(password,id);
    }

    @Transactional
    public void updateProfile(MemberEntity dto) {
        repository.updateProfile(dto.getUsername(), dto.getFullname(), dto.getRoles(), dto.getActive(), dto.getId());
    }

    @Override
    public List<Map<String, Object>> getSomething() {
        return repository.getSomething();
    }
}