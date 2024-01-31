package com.example.kotlinspringangular.service.Impl

import com.example.kotlinspringangular.model.Employee
import com.example.kotlinspringangular.repository.EmployeeRepository
import com.example.kotlinspringangular.service.EmployeeService
import jakarta.transaction.Transactional
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Transactional
@Service
class EmployeeServiceImpl(@Autowired private val employeeRepository: EmployeeRepository) : EmployeeService {
    override fun addEmployee(employee: Employee): Employee {
        employee.employeeCode = UUID.randomUUID().toString()
        return this.employeeRepository.save(employee)
    }
    override fun findAllEmployees() : List<Employee> {
        return this.employeeRepository.findAll()
    }
    override fun updateEmployee(employee: Employee) : Employee {
        return this.employeeRepository.save(employee)
    }
    override fun deleteEmployee(id: Long) {
        this.employeeRepository.deleteEmployeeById(id)
    }
    override fun findEmployeeById(id: Long) : Employee {
        return this.employeeRepository.findEmployeeById(id)
    }
}