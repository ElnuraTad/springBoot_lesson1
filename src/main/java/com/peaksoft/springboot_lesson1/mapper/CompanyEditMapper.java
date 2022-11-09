package com.peaksoft.springboot_lesson1.mapper;

import com.peaksoft.springboot_lesson1.dto.CompanyRequest;
import com.peaksoft.springboot_lesson1.entity.Company;
import org.springframework.stereotype.Component;

@Component
public class CompanyEditMapper {

    public Company create(CompanyRequest companyRequest){
        if(companyRequest == null){
            return  null;
        }

        Company company = new Company();
        company.setCompanyName(companyRequest.getCompanyName());
        company.setAddress(companyRequest.getAddress());
        company.setEmail(companyRequest.getEmail());
        company.setNumber(companyRequest.getNumber());
        return company;
    }

    public void update(Company company, CompanyRequest companyRequest){
        company.setCompanyName(companyRequest.getCompanyName());
        company.setAddress(companyRequest.getAddress());
        company.setEmail(companyRequest.getEmail());
        company.setNumber(companyRequest.getNumber());
    }
}
