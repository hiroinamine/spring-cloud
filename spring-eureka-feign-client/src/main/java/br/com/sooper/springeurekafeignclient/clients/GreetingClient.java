package br.com.sooper.springeurekafeignclient.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(
        contextId = "GreetingClient",
        name = "spring-eureka-client"
)
public interface GreetingClient {
    @RequestMapping(method = RequestMethod.GET, value = "/greeting")
    String greeting();
}
