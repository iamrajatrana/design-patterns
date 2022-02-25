package creational.builder;

public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee.EmployeeBuilder("Rajat", "Rana")
                .setAge(26)
                .setGender("Male")
                .build();

        Employee e2 = new Employee.EmployeeBuilder("John", "Snow")
                .setAge(45)
                .setGender("Male")
                .build();

        Employee e3 = new Employee.EmployeeBuilder(e1)
                .setAge(90)
                .build();

        System.out.println("Employee 1" + e1);
        System.out.println("Employee 2" + e2);
        System.out.println("Modified Employee 1" + e3);


    }


}
