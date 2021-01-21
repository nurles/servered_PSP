package com.centroafuera.servered

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class StudentController (private val studentrepository : StudentRepository ) {

    @GetMapping("/students")
    fun getAllStudents() : List<Student> {
        return studentrepository.findAll()
    }

    @PostMapping("/students")
    fun insertStudent(@RequestBody student : Student){
        studentrepository.save(student)
    }
}