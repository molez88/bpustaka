package org.bpustaka.repositories.applicationinfo;

import org.bpustaka.entity.ApplicationInfo;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ApplicationInfoDao extends PagingAndSortingRepository<ApplicationInfo, String>{
    
}
