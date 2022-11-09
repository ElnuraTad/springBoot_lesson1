package com.peaksoft.springboot_lesson1.dto;


import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyRequest {

    @NotNull
    private String companyName;
    private String address;
    private String email;
    private String number;
}
