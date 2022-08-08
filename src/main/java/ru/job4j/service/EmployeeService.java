package ru.job4j.service;

import org.springframework.stereotype.Service;
import ru.job4j.domain.Employee;
import ru.job4j.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private final EmployeeRepository employees;

    public EmployeeService(EmployeeRepository employees) {
        this.employees = employees;
    }

    public List<Employee> findAll() {
        List<Employee> rsl = new ArrayList<>();
        employees.findAll().forEach(rsl::add);
        return rsl;
    }

    public Optional<Employee> findById(int id) {
        return employees.findById(id);
    }

    public Employee save(Employee employee) {
        return employees.save(employee);
    }

    public void delete(Employee employee) {
        employees.delete(employee);
    }
}
