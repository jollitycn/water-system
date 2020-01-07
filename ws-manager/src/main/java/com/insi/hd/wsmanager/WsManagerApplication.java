package com.insi.hd.wsmanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.insi.hd.wsmanager.mapper")
public class WsManagerApplication {

public static void main(String[] args) {
    SpringApplication.run(WsManagerApplication.class, args);
}

}
