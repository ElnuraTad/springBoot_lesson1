package com.peaksoft.springboot_lesson1.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CompanyResponse {

    private Long id;
    private String companyName;
    private String address;
    private String email;
    private String number;
    private boolean blocked;
    private LocalDateTime dateTime;
}
