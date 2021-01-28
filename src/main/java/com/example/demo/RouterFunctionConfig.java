package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import org.springframework.web.reactive.function.server.RouterFunction;

import java.util.HashMap;
import java.util.Map;

import static  reactor.core.publisher.Mono.just;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;
/**
 * Handles requests for the application home page.
 */
@RestController
@CrossOrigin(origins = "*")
public class RouterFunctionConfig {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

//    @Bean
//    public RouterFunction<?> index() {
//        return route(GET("/hello"),
//            request -> ok().body(just("Hello WOrld !!"), String.class));
//    }
    @GetMapping("/test")
    public Map<?,?> hello(){
        System.out.println("서버연결");
        Map<String, String> map = new HashMap<>();
        map.put("a","a");
        map.put("b","b");
        return map;
    }
}
