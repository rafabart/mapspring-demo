package com.mapstructdemo.mapper;

import com.mapstructdemo.reponse.AndressResponse;
import com.mapstructdemo.request.AndressRequest;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;


/*
 * @Mapper(componentModel = "spring") é utilizado para dizermos que esta interface é um mapper,
 * a opção “componentModel” foi utilizada para dizer ao MapStruct que deve ser criar um “Bean”
 * do spring para que possamos utilizar a Injeção de Dependencia do Spring.*
 * */
@Mapper(componentModel = "spring")
public interface AndressMapper {


    /*
     * @Mapping é utilizado para deixar explícito a conversão. Quando o nome das propriedades estão iguais
     * o próprio MapStruct infere, mas quando está diferente, precisa ser especificado a origem e o destino,
     * existem outra possibilidades, mas vamos explorar apenas o básico. Repare que o campo número são de tipos diferentes,
     * o proprio MapStruct consegue fazer as conversões, é bem útil e ainda é possível especificar a conversão manualmente.
     * */
    @Mapping(target = "publicPlace", source = "street")
    AndressResponse to(final AndressRequest andressRequest);


    //@InheritInverseConfiguration faz a configuração inversa da conversão
    @InheritInverseConfiguration
    AndressRequest to(final AndressResponse andressResponse);


    //Os métodos de list sabem utilizar a configuração criada nos métodos anteriores não sendo necessário nenhuma configuração extra.
    List<AndressResponse> toRequest(final List<AndressRequest> andressRequests);


    List<AndressRequest> toResponse(final List<AndressResponse> andressResponses);
}
