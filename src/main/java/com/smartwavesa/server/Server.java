package com.smartwavesa.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by jroux on 14.03.2016.
 */
@SpringBootApplication
public class Server {

    private static final Logger LOG = LoggerFactory.getLogger(Server.class);


    public static void main(String[] args) {
        LOG.info("Starting...");
        SpringApplication app = new SpringApplication(Server.class);
        app.run(args);

        LOG.info("Running...");
    }
}
