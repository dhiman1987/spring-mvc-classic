package com.dexter.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Slf4j
public class HelloService {
 public HelloService()
 {
  log.info("HelloService Created {}",this.hashCode());
 }
 
 public String helloServiceTest()
 {
  LocalDateTime currentDateTime= LocalDateTime.now();
  log.info("HelloService test {}",currentDateTime);
  return String.format("Hello Service test message. Server Time %s",currentDateTime);
 }

}