package com.covid.oc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

@RestController
@Configuration
public class KeepAliveController {
    private static final Logger logger = LoggerFactory.getLogger(KeepAliveController.class);

    @GetMapping("/keep-alive")
    public String keepAlive() {
        return "OK";
    }

    @GetMapping("/host-svr")
    public String hostServer() {
        String hostName = "UnKnown";

        try {
            InetAddress ip = InetAddress.getLocalHost();
            hostName = ip.getHostName();
        } catch (Exception ipExp) {
            logger.error("Host name error : ", ipExp);
        }
        return String.format("HostServer: %S", hostName);
    }
}
