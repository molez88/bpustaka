
package org.bpustaka.controller;

import org.bpustaka.entity.MemberEntity;
import org.bpustaka.entity.dao.MemberDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Transactional
public class MemberController {
        @Autowired private MemberDao memberDao;
        @RequestMapping(value = "/member", method = RequestMethod.GET)
        public Page<MemberEntity> infos(Pageable page){
        return memberDao.findAll(page);
    }
    
}
