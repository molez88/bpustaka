
package org.bpustaka.repositories.member;

import org.bpustaka.entity.MemberEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MemberDao extends PagingAndSortingRepository<MemberEntity, String>{
    
}
