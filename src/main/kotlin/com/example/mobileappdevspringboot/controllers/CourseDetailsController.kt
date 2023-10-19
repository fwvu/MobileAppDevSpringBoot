package com.example.mobileappdevspringboot.controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/courses")
class CourseDetailsController {

    @RequestMapping("") //localhost:8080/courses
    fun sayHello() = "Hello World, this is a root test"

    @RequestMapping("/test1") //localhost:8080/courses/test1
    fun retCourseDetails() = "This is a test"
}