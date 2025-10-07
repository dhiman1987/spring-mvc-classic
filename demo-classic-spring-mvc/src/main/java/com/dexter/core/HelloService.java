package com.dexter.core;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.LoggerFactoryFriend;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class HelloService {

 private static final Logger log = LoggerFactory.getLogger(HelloService.class);
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