package com.example.kotlinspringangular.web

import com.example.kotlinspringangular.model.Employee
import com.example.kotlinspringangular.service.EmployeeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/employee")
class EmployeeController(@Autowired private val employeeService: EmployeeService) {
    @GetMapping("/all")
    fun getAllEmployees(): ResponseEntity<List<Employee>> {
        val employees: List<Employee> = this.employeeService.findAllEmployees()
        return ResponseEntity(employees, HttpStatus.OK)
    }
    @GetMapping("/find/{id}")
    fun getEmployeeById(@PathVariable("id") id: Long): ResponseEntity<Employee> {
        val employee: Employee = this.employeeService.findEmployeeById(id)
        return ResponseEntity(employee, HttpStatus.OK)
    }
    @PostMapping("/add")
    fun addEmployee(@RequestBody employee: Employee): ResponseEntity<Employee> {
        val employeeAdd: Employee = this.employeeService.addEmployee(employee)
        return ResponseEntity(employeeAdd, HttpStatus.CREATED)
    }
    @PutMapping("/update")
    fun updateEmployee(@RequestBody employee: Employee): ResponseEntity<Employee> {
        val employeeUpdate: Employee = this.employeeService.updateEmployee(employee)
        return ResponseEntity(employeeUpdate, HttpStatus.OK)
    }
    @DeleteMapping("/delete/{id}")
    fun deleteEmployee(@PathVariable("id") id: Long) : ResponseEntity<Any> {
        this.employeeService.deleteEmployee(id)
        return ResponseEntity(HttpStatus.OK)
    }
}