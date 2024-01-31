package com.example.kotlinspringangular

import com.example.kotlinspringangular.model.Employee
import com.example.kotlinspringangular.service.Impl.EmployeeServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class Init(@Autowired val employeeService: EmployeeServiceImpl) : ApplicationRunner {
    override fun run(args: ApplicationArguments?) {
        var employee: Employee = Employee(1, "test", "test","test","test","test","test")
        this.employeeService.addEmployee(employee);
    }
}