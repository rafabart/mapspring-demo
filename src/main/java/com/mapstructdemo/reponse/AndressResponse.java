package com.mapstructdemo.reponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AndressResponse {

    private String publicPlace;

    private String number;

    private String city;
}
