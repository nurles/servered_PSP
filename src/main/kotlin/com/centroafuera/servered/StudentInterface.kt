package com.centroafuera.servered

import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepository : JpaRepository<Student,Long> {
}