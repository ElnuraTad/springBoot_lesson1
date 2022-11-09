package com.peaksoft.springboot_lesson1.controller;

import com.peaksoft.springboot_lesson1.dto.CompanyRequest;
import com.peaksoft.springboot_lesson1.dto.CompanyResponse;
import com.peaksoft.springboot_lesson1.service.CompanyService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/company")
public class CompanyController {


    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @PostMapping
    public CompanyResponse create(@RequestBody CompanyRequest companyRequest){
        return companyService.create(companyRequest);
    }

    @PutMapping("{id}")
    public CompanyResponse update(@PathVariable Long id,
                                  @RequestBody CompanyRequest companyRequest ){
        return companyService.update(id, companyRequest);
    }

    @GetMapping("{id}")
    public CompanyResponse getCompanyById(@PathVariable Long id){
        return companyService.getCompany(id);
    }

    @DeleteMapping("{id}")
    public CompanyResponse deleteCompanyById(@PathVariable Long id){
        return companyService.getCompany(id);
    }
}
