package com.peaksoft.springboot_lesson1.mapper;

import com.peaksoft.springboot_lesson1.dto.CompanyResponse;
import com.peaksoft.springboot_lesson1.entity.Company;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CompanyViewMapper {

    public CompanyResponse viewCompany(Company company){
        if(company == null){
            return null;
        }

        CompanyResponse companyResponse = new CompanyResponse();
        if(company.getId() != null){
            companyResponse.setId(Long.valueOf(String.valueOf(company.getId())));
        }

        companyResponse.setCompanyName(company.getCompanyName());
        companyResponse.setAddress(company.getAddress());
        companyResponse.setEmail(company.getEmail());
        companyResponse.setNumber(company.getNumber());
        companyResponse.setBlocked(company.isBlocked());
        companyResponse.setDateTime(company.getCreatedAt());

        return companyResponse;
    }

    public List<CompanyResponse> viewsCompanies(List<Company> companies){
        List<CompanyResponse> responses = new ArrayList<>();
        for (Company c : companies) {
            responses.add(viewCompany(c));
        }
        return responses;
    }
}
