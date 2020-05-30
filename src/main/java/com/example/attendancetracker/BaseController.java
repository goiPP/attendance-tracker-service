package com.example.attendancetracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

  @GetMapping("/")
  public String base() {
    return "Welcome to Attendance Tracker Application :)";
  }
}
