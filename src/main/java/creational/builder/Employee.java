package creational.builder;

import java.util.UUID;

public class Employee {

    private final String id;
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String gender;

    private Employee(EmployeeBuilder employeeBuilder) {
        this.id = employeeBuilder.id;
        this.firstName = employeeBuilder.firstName;
        this.lastName = employeeBuilder.lastName;
        this.age = employeeBuilder.age;
        this.gender = employeeBuilder.gender;
    }

    private Employee(Employee employee) {
        this.id = employee.id;
        this.firstName = employee.firstName;
        this.lastName = employee.lastName;
        this.age = employee.age;
        this.gender = employee.gender;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public static class EmployeeBuilder {
        private String id;
        private String firstName;
        private String lastName;
        private int age;
        private String gender;

        public EmployeeBuilder(String firstName, String lastName) {
            this.id = UUID.randomUUID().toString();
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public EmployeeBuilder(Employee employee) {
            this(employee.firstName, employee.lastName);
            this.age = employee.age;
            this.gender = employee.gender;
        }

        public EmployeeBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public EmployeeBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Employee build() {
            Employee employee = new Employee(this);
            validateEmployee(employee);
            return employee;
        }

        private void validateEmployee(Employee employee) {
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
