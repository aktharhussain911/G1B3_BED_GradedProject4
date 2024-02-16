package org.ems.employee_management_system.repositories;

import org.ems.employee_management_system.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query(value = "SELECT * FROM employee em WHERE em.first_name LIKE %?1%", nativeQuery = true)
    List<Employee> findByFirstName(String query);
}
