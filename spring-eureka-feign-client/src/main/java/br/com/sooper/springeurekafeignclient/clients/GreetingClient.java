package br.com.sooper.springeurekafeignclient.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(
        contextId = "GreetingClient",
        name = "SPRING-EUREKA-CLIENT",
        url = " "
//        name = "bla",
//        url = "https://spring-eureka-client-007.herokuapp.com"
)
public interface GreetingClient {
    @RequestMapping(method = RequestMethod.GET, value = "/greeting")
    String greeting();
}
