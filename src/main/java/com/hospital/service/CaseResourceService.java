package com.hospital.service;

import com.hospital.entity.CaseResource;

import java.util.List;

public interface CaseResourceService {
    Integer saveCaseResource(CaseResource caseResource);

    List<CaseResource> getAllCaseResource();

//    CaseResource getCaseResource(String name);

    CaseResource getById(Integer id);

    void deleteCaseResource(Integer id);

    void updateCaseResource(CaseResource caseResource);

}
