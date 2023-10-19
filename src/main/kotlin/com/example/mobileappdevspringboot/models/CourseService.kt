package com.example.mobileappdevspringboot.models

import org.springframework.stereotype.Service

@Service
class CourseService {
    fun courseDetailsList(): List<CourseDetails>{
        return listOf(
            CourseDetails(
                "Introduction to Web Development",
                "IT-100",
                "John Smith",
                "Learn the basics of web development and HTML/CSS.",
                "None"
            ),
            CourseDetails(
                "Advanced Data Structures",
                "IT-101",
                "Alice Johnson",
                "Explore advanced data structures and algorithms.",
                "Advanced programming skills"
            ),
            CourseDetails(
                "Database Management Systems",
                "IT-102",
                "Michael Lee",
                "Database management, SQL, and NoSQL databases.",
                "Database fundamentals"
            ),
            CourseDetails(
                "Cybersecurity Fundamentals",
                "IT-103",
                "Sarah Davis",
                "Fundamentals of cybersecurity and threat mitigation.",
                "Basic computer knowledge"
            ),
            CourseDetails(
                "Network Administration",
                "IT-104",
                "David Wilson",
                "Learn how to administer and secure computer networks.",
                "Networking basics"
            ),
            CourseDetails(
                "Machine Learning Fundamentals",
                "IT-105",
                "Emily Moore",
                "Introduction to machine learning and data analysis.",
                "Programming and math background"
            ),
            CourseDetails(
                "Software Engineering Principles",
                "IT-106",
                "Robert Taylor",
                "Software engineering principles and best practices.",
                "Software development experience"
            ),
            CourseDetails(
                "Mobile App Development",
                "IT-107",
                "Olivia Anderson",
                "Develop mobile apps for iOS and Android platforms.",
                "Programming skills"
            ),
            CourseDetails(
                "Cloud Computing Technologies",
                "IT-108",
                "William Brown",
                "Explore cloud computing platforms and services.",
                "Basic cloud computing knowledge"
            ),
            CourseDetails(
                "Operating System Design",
                "IT-109",
                "Sophia Clark",
                "Design and develop custom operating systems.",
                "Operating systems knowledge"
            ),
            CourseDetails(
                "Digital Marketing Strategies",
                "IT-110",
                "Joseph White",
                "Strategies for effective digital marketing campaigns.",
                "Digital marketing interest"
            ),
            CourseDetails(
                "Artificial Intelligence in Business",
                "IT-111",
                "Emma Harris",
                "Applications of AI in business decision-making.",
                "Business and analytics background"
            ),
            CourseDetails(
                "Computer Graphics and Visualization",
                "IT-112",
                "Daniel Martin",
                "Create computer graphics and visual effects.",
                "Graphics design skills"
            ),
            CourseDetails(
                "Web Application Security",
                "IT-113",
                "Ava Lewis",
                "Secure web applications and prevent vulnerabilities.",
                "Web development skills"
            ),
            CourseDetails(
                "Data Science and Big Data Analytics",
                "IT-114",
                "Matthew Turner",
                "Data analysis and big data techniques.",
                "Data analysis background"
            ),
            CourseDetails(
                "Internet of Things (IoT) Development",
                "IT-115",
                "Chloe Rodriguez",
                "Develop IoT applications and connected devices.",
                "Programming and electronics basics"
            ),
            CourseDetails(
                "Blockchain Technology",
                "IT-116",
                "Lily Hall",
                "Explore blockchain technology and cryptocurrencies.",
                "Blockchain interest"
            ),
            CourseDetails(
                "Game Development with Unity",
                "IT-117",
                "James Walker",
                "Create games using the Unity game engine.",
                "Game development interest"
            ),
            CourseDetails(
                "Software Testing and Quality Assurance",
                "IT-118",
                "Grace Wright",
                "Testing methodologies and quality assurance in software.",
                "Software development experience"
            ),
            CourseDetails(
                "Ethical Hacking and Penetration Testing",
                "IT-119",
                "Sophia Brown",
                "Learn ethical hacking and penetration testing skills.",
                "Basic computer knowledge"
            )
        )
    }
}