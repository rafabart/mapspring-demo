package com.mapstructdemo.mapper;

import com.mapstructdemo.reponse.CustomerResponse;
import com.mapstructdemo.request.CustomerRequest;
import org.mapstruct.Mapper;

/*
 * @Mapper nessa classe ele foi implementado com um detalhe, o “uses”, com isso dizemos ao MapStruct
 * que não deve ser implementado um novo conversor para endereço mas utilizar o que mapper pronto.
 * */
@Mapper(componentModel = "spring", uses = {AndressMapper.class})
public interface CustomerMapper {

    CustomerResponse to(final CustomerRequest customerRequest);

    CustomerRequest to(final CustomerResponse customerResponse);
}
