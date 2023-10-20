package com.example.mobileappdevspringboot.models

import org.springframework.stereotype.Service

@Service
class CourseService {
    fun courseDetailsList(filter: String? = null): List<CourseDetails>{
        return listOf(
            CourseDetails(
                "Introduction to Web Development",
                "IT-100",
                "John Smith",
                "In this course, you will learn the basics of web development. We'll cover HTML, CSS, and JavaScript, guiding you through the creation of interactive web pages. By the end, you'll have the skills to build your own websites and web applications.",
                "Basic computer knowledge\nPrior programming experience is helpful"
            ),
            CourseDetails(
                "Advanced Data Structures",
                "IT-101",
                "Alice Johnson",
                "This course delves deep into advanced data structures and algorithms. You'll explore complex data structures such as graphs and trees, and master advanced algorithms like dynamic programming. Get ready to tackle real-world computational challenges.",
                "Advanced programming skills\nMathematics background\nAlgorithms and data structures knowledge"
            ),
            CourseDetails(
                "Database Management Systems",
                "IT-102",
                "Michael Lee",
                "Database management is at the heart of information technology. In this course, you'll learn about relational and NoSQL databases. We'll cover data modeling, query optimization, and security. Get hands-on experience managing data systems.",
                "Database fundamentals\nBasic understanding of SQL\nIT fundamentals"
            ),
            CourseDetails(
                "Cybersecurity Fundamentals",
                "IT-103",
                "Sarah Davis",
                "Cybersecurity is essential in our interconnected world. This course provides a strong foundation in cybersecurity and threat mitigation. Explore security best practices, ethical hacking, and risk assessment to protect digital assets.",
                "Basic computer knowledge"
            ),
            CourseDetails(
                "Network Administration",
                "IT-104",
                "David Wilson",
                "This course provides a comprehensive understanding of network administration. You'll learn to set up, secure, and maintain computer networks. Topics include routing, switching, and network troubleshooting.",
                "Networking basics\nIT fundamentals"
            ),
            CourseDetails(
                "Machine Learning Fundamentals",
                "IT-105",
                "Emily Moore",
                "Get started with the exciting world of machine learning. This course covers the basics of data analysis and machine learning algorithms. You'll work on projects to apply your knowledge in real-world scenarios.",
                "Programming and math background"
            ),
            CourseDetails(
                "Software Engineering Principles",
                "IT-106",
                "Robert Taylor",
                "Software engineering principles are vital for creating robust and maintainable software. This course explores software development methodologies, design patterns, and best practices in software engineering.",
                "Software development experience\nProgramming skills"
            ),
            CourseDetails(
                "Mobile App Development",
                "IT-107",
                "Olivia Anderson",
                "Learn to develop mobile apps for iOS and Android platforms. You'll explore app design, user interfaces, and mobile app development frameworks. By the end, you'll have the skills to create your own apps.",
                "Programming skills"
            ),
            CourseDetails(
                "Cloud Computing Technologies",
                "IT-108",
                "William Brown",
                "This course delves into cloud computing platforms and services. You'll understand cloud architecture, deployment models, and best practices for managing cloud resources.",
                "Basic cloud computing knowledge\nIT fundamentals"
            ),
            CourseDetails(
                "Operating System Design",
                "IT-109",
                "Sophia Clark",
                "Design and develop custom operating systems in this advanced course. Learn about kernel development, system calls, and memory management. Create your own operating system from scratch.",
                "Operating systems knowledge\nAdvanced programming skills"
            ),
            CourseDetails(
                "Digital Marketing Strategies",
                "IT-110",
                "Joseph White",
                "Explore effective strategies for digital marketing campaigns. Topics include SEO, social media marketing, email marketing, and analytics. You'll learn to develop and execute successful marketing campaigns.",
                "Digital marketing interest\nBasic marketing knowledge"
            ),
            CourseDetails(
                "Artificial Intelligence in Business",
                "IT-111",
                "Emma Harris",
                "Discover how AI can be applied to enhance business decision-making. This course covers machine learning, natural language processing, and AI ethics. Gain the skills to leverage AI in various industries.",
                "Business and analytics background"
            ),
            CourseDetails(
                "Computer Graphics and Visualization",
                "IT-112",
                "Daniel Martin",
                "Learn to create stunning computer graphics and visual effects. Explore graphics programming, rendering techniques, and 3D modeling. Develop your artistic and technical skills in graphic design.",
                "Graphics design skills\nProgramming knowledge"
            ),
            CourseDetails(
                "Web Application Security",
                "IT-113",
                "Ava Lewis",
                "Ensure the security of web applications and prevent vulnerabilities. Topics include OWASP Top 10, penetration testing, and secure coding practices. Protect web applications from cyber threats.",
                "Web development skills\nCybersecurity basics"
            ),
            CourseDetails(
                "Data Science and Big Data Analytics",
                "IT-114",
                "Matthew Turner",
                "Delve into the world of data science and big data analytics. You'll learn data analysis techniques, data visualization, and machine learning. Apply your skills to extract valuable insights from large datasets.",
                "Data analysis background\nProgramming skills"
            ),
            CourseDetails(
                "Internet of Things (IoT) Development",
                "IT-115",
                "Chloe Rodriguez",
                "Develop IoT applications and connected devices. Learn to create smart, interconnected devices using IoT platforms and programming. Explore the future of IoT technology.",
                "Programming skills\nElectronics basics"
            ),
            CourseDetails(
                "Blockchain Technology",
                "IT-116",
                "Lily Hall",
                "Dive into the world of blockchain technology and cryptocurrencies. Understand the principles behind blockchain, smart contracts, and digital currencies. Explore the potential of blockchain in various industries.",
                "Blockchain interest\nBasic cryptography knowledge"
            ),
            CourseDetails(
                "Game Development with Unity",
                "IT-117",
                "James Walker",
                "Unleash your creativity in game development using the Unity game engine. Learn game design, 2D and 3D game development, and game physics. Create your own interactive gaming experiences.",
                "Game development interest\nProgramming skills"
            ),
            CourseDetails(
                "Software Testing and Quality Assurance",
                "IT-118",
                "Grace Wright",
                "Learn essential testing methodologies and quality assurance practices in software development. Ensure the reliability and quality of software products. Gain skills for effective quality control.",
                "Software development experience\nProgramming knowledge"
            ),
            CourseDetails(
                "Ethical Hacking and Penetration Testing",
                "IT-119",
                "Sophia Brown",
                "Ethical hacking and penetration testing are vital for securing digital environments. Gain the skills to assess and protect against cyber threats. Learn about vulnerability assessment and ethical hacking techniques.",
                "Basic computer knowledge\nCybersecurity interest"
            )
        )
    }
}