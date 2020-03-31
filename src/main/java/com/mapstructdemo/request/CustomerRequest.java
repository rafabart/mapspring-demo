package com.mapstructdemo.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRequest {

    private String name;

    private Integer age;

    private List<AndressRequest> andress;
}
