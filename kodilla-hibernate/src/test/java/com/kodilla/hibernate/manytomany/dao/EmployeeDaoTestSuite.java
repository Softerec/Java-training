package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class EmployeeDaoTestSuite {

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testNamedQueries() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee johnyClarckson = new Employee("Johny", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        //When
        employeeDao.save(johnSmith);
        int johnSmithId = johnSmith.getId();
        employeeDao.save(johnyClarckson);
        int johnyClarcksonId = johnyClarckson.getId();
        employeeDao.save(lindaKovalsky);
        int lindaKovalskyId = lindaKovalsky.getId();


        List<Employee> pickedEmployees = employeeDao.retrieveEmployeeWithSpecificName("Smith");

        //Then
        try {
            assertEquals(1, pickedEmployees.size());
        } finally {
            //CleanUp
            try {
                employeeDao.deleteById(johnSmithId);
                employeeDao.deleteById(johnyClarcksonId);
                employeeDao.deleteById(lindaKovalskyId);
            } catch (Exception e) {
                System.out.println("No cleanup after testNamedQueries from EmployeeDaoTestSuite");
            }
        }
    }
}
