package com.dexter.core;
import java.time.LocalTime;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
 
 public HelloService()
 {
  System.out.println("HelloService Created "+this.hashCode());
 }
 
 public String helloServiceTest()
 {
  return "Hello Service test message "+LocalTime.now();
 }

}