package com.peaksoft.springboot_lesson1.service;

import com.peaksoft.springboot_lesson1.dto.CompanyRequest;
import com.peaksoft.springboot_lesson1.dto.CompanyResponse;
import com.peaksoft.springboot_lesson1.entity.Company;
import com.peaksoft.springboot_lesson1.mapper.CompanyEditMapper;
import com.peaksoft.springboot_lesson1.mapper.CompanyViewMapper;
import com.peaksoft.springboot_lesson1.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;
    private final CompanyEditMapper editMapper;
    private final CompanyViewMapper viewMapper;


    public CompanyResponse create(CompanyRequest companyRequest) {
        return viewMapper.viewCompany(companyRepository
                .save(editMapper.create(companyRequest)));
    }

    public CompanyResponse update(Long id, CompanyRequest companyRequest) {
        Company company = companyRepository.findById(id).get();
        editMapper.update(company, companyRequest);
        return viewMapper.viewCompany(companyRepository.save(company));
    }

    public CompanyResponse getCompany(Long id){
        return viewMapper.viewCompany(companyRepository.findById(id).get());

    }

    public CompanyResponse delete(Long id){
        Company company =  companyRepository.findById(id). get();
        companyRepository.deleteById(id);
        return viewMapper.viewCompany(company);
    }


}
