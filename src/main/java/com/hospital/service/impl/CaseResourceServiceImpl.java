package com.hospital.service.impl;

import com.hospital.entity.CaseResource;
import com.hospital.dao.CaseResourceDao;
import com.hospital.service.CaseResourceService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaseResourceServiceImpl implements CaseResourceService {

    @Autowired
    private CaseResourceDao caseResourceRepository;

    private final Log log = LogFactory.getLog(getClass());

    public Integer saveCaseResource(CaseResource caseResource) {
        try {
            Integer id = caseResourceRepository.save(caseResource);
            return id;
        } catch (HibernateException e) {
            log.error("在saveCaseResource出错了");
            log.error(e);
            e.printStackTrace();
        }
        return -1;
    }

    public List<CaseResource> getAllCaseResource() {
        try {
            List list = caseResourceRepository.loadAll();
            return list;
        } catch (HibernateException e) {
            log.error("在getAllCaseResource出错了");
            log.error(e);
            e.printStackTrace();
        }
        return null;
    }

    public CaseResource getById(Integer id){

        try {
            CaseResource cr = caseResourceRepository.get(id);
            return cr;
        } catch (HibernateException e) {
            log.error("在getCaseResource出错了");
            log.error(e);
            e.printStackTrace();
        }
        return null;
    }
//    public CaseResource getCaseResource(String name){
//        return caseResourceRepository.getByName(name);
//    }

    public void deleteCaseResource(Integer id) {
        try {
            caseResourceRepository.delete(id);
        } catch (HibernateException e) {
            log.error("在deleteCaseResource出错了");
            log.error(e);
            e.printStackTrace();
        }
    }

    public void updateCaseResource(CaseResource caseResource) {
        try {
            caseResourceRepository.update(caseResource);
        } catch (HibernateException e) {
            log.error("在updateCaseResource出错了");
            log.error(e);
            e.printStackTrace();
        }
    }
}
