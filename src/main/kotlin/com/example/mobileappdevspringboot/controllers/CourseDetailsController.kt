package com.example.mobileappdevspringboot.controllers

import com.example.mobileappdevspringboot.models.CourseDetails
import com.example.mobileappdevspringboot.models.CourseService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/courses")
class CourseDetailsController(private val courseService: CourseService) {

    @RequestMapping("") //localhost:8080/courses
    fun sayHello() = "Hello World, this is a root test"


    @RequestMapping("/test1") //localhost:8080/courses/test1
    fun retCourseDetailsTest() = "This is a test"


    @RequestMapping("/details") //localhost:8080/courses/details
    fun getAllCourse(): List<CourseDetails> {
        return courseService.courseDetailsList()
    }
}