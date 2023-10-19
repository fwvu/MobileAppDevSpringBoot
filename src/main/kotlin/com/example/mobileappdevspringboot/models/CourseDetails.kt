package com.example.mobileappdevspringboot.models

data class CourseDetails(
    var dataCourseTitle: String,
    val dataCourseCode: String,
    val dataCourseInstructor: String,
    val dataCourseDescription: String,
    val dataCoursePrerequisites: String
)
