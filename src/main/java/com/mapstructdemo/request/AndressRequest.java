package com.mapstructdemo.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AndressRequest {

    private String street;

    private Integer number;

    private String city;
}
