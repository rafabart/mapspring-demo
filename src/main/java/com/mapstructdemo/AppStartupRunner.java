package com.mapstructdemo;

import com.mapstructdemo.reponse.CustomerResponse;
import com.mapstructdemo.request.AndressRequest;
import com.mapstructdemo.request.CustomerRequest;
import com.mapstructdemo.service.ConversorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class AppStartupRunner implements ApplicationRunner {

    @Autowired
    private ConversorService conversorService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        AndressRequest andressRequestOne = new AndressRequest("Sete de setembro", 155, "Araraquara");
        AndressRequest andressRequestTwo = new AndressRequest("Mascarenha de Morais", 854, "São Paulo");


        CustomerRequest customerRequest = new CustomerRequest();
        customerRequest.setName("Rafael Marinho");
        customerRequest.setAge(37);
        customerRequest.setAndress(Arrays.asList(andressRequestOne, andressRequestTwo));

        System.out.println("CustomerRequest:");
        System.out.println(customerRequest);

        final CustomerResponse customerResponse = conversorService.converteToCustomerRequest(customerRequest);

        System.out.println("CustomerResponde after to be Mapped:");
        System.out.println(customerResponse);
    }
}
