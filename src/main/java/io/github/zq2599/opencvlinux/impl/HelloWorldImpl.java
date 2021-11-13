package io.github.zq2599.opencvlinux.impl;

import io.github.zq2599.opencvlinux.HelloWorld;
import java.time.LocalDateTime;

public class HelloWorldImpl implements HelloWorld {
    @Override
    public String hello() {
        return "Hello " + LocalDateTime.now();
    }
}
