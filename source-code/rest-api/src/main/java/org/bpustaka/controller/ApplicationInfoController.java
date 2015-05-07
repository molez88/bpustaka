package org.bpustaka.controller;

import org.bpustaka.entity.ApplicationInfo;
import org.bpustaka.repositories.applicationinfo.ApplicationInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Transactional
public class ApplicationInfoController {
    
    @Autowired private ApplicationInfoDao applicationInfoDao;
    
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public Page<ApplicationInfo> infos(Pageable page){
        return applicationInfoDao.findAll(page);
    }
}
