package EmployeeManagementSystem.ems.repository;

import EmployeeManagementSystem.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
