package com.example.kotlinspringangular.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.io.Serializable

@Entity
@Table(name = "employees")
data class Employee(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false, unique = true)
    var id: Long? = null,
    var name: String,
    var email: String,
    var jobTitle: String,
    var phone: String,
    var imageUrl: String,
    @Column(nullable = false, updatable = false)
    var employeeCode: String? = null
) : Serializable
