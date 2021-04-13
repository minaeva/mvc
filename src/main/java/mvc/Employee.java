package mvc;

//import javax.validation.constraints.Email;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;

//import jakarta.validation.constraints.Email;
//import jakarta.validation.constraints.NotNull;
//import jakarta.validation.constraints.Size;

import mvc.validation.CheckEmail;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;

public class Employee {

    @Size(min = 5, message = "Minimum length is 2 symbols ")
    private String name;

    @Min(value = 1, message = "Name cannot be null")
    private String surname;

    @NotEmpty
    private int salary;

    @CheckEmail
    private String email;

    private String department;

    private Map<String, String> departments;
    private String carBrand;

    private String[] languages;

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "info tech");
        departments.put("FIN", "finance");
        departments.put("SALES", "sales");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                '}';
    }

}
