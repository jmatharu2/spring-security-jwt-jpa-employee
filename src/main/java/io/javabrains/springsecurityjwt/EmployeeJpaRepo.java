package io.javabrains.springsecurityjwt;

import org.springframework.data.jpa.repository.JpaRepository;

import io.javabrains.springsecurityjwt.models.Employee;

public interface EmployeeJpaRepo extends JpaRepository<Employee, Long> {

}
