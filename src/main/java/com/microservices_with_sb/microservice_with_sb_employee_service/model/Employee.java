package com.microservices_with_sb.microservice_with_sb_employee_service.model;

public record Employee(Long id,Long departmentId, String name, int age, String position) {
}
