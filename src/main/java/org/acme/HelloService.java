package org.acme;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloService {
    @ConfigProperty(name="greeting")
    private String greeting;

    public String politeHello(String name){
        return greeting + " Ms " + name;
    }
}
