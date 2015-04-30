
package org.bpustaka.entity.dao;

import org.bpustaka.entity.MemberEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MemberDao extends PagingAndSortingRepository<MemberEntity, String>{
    
}
