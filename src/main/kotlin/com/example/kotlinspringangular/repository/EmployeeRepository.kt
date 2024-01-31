package com.example.kotlinspringangular.repository

import com.example.kotlinspringangular.model.Employee
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeeRepository : JpaRepository<Employee, Long> {
    fun deleteEmployeeById(id: Long)
    fun findEmployeeById(id: Long): Employee
}