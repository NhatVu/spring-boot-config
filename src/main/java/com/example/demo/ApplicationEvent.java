package com.example.demo;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationEvent {

  @EventListener(ApplicationReadyEvent.class)
  public void doSomethingAfterStartup() {
    System.out.println("hello world, Running after application started");
  }
}
