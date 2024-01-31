package com.example.kotlinspringangular.service

import com.example.kotlinspringangular.model.Employee

interface EmployeeService {
    fun addEmployee(employee: Employee): Employee
    fun findAllEmployees(): List<Employee>
    fun updateEmployee(employee: Employee): Employee
    fun deleteEmployee(id: Long)
    fun findEmployeeById(id: Long): Employee
}