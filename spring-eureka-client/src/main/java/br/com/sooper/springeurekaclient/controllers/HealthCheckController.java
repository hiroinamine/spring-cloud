package br.com.sooper.springeurekaclient.controllers;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@Slf4j
public class HealthCheckController {

    @Autowired
    private EurekaClient eurekaClient;

    // This configuration is fetched from ConfigServer
    @Value("${user.role}")
    private String role;

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("/healthCheck")
    public String healthCheck() {
        Application eurekaApp = eurekaClient.getApplication(appName);
        String myEurekaStatus = Optional.ofNullable(eurekaApp).map(app -> "online").orElse("offline");
        return String.format("%s:'%s'. role: %s", appName, myEurekaStatus, role);
    }
}
