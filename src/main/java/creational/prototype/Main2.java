package creational.prototype;


public class Main2 {
    public static void main(String[] args) {
        Address originalAddress = new Address("123 Elm St", "Springfield");
        Person originalPerson = new Person("John Doe", originalAddress);

        // Shallow copy
        Person shallowCopiedPerson = null;
        try {
            shallowCopiedPerson = (Person) originalPerson.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // Deep copy
        Person deepCopiedPerson = originalPerson.deepClone();

        // Modify the address in the shallow copy
        if (shallowCopiedPerson != null) {
            shallowCopiedPerson.getAddress().setStreet("456 Oak St");
        }

        // Modify the address in the deep copy
        deepCopiedPerson.getAddress().setCity("Shelbyville");

        // Display the results
        System.out.println("Original Person: " + originalPerson);
        System.out.println("Shallow Copied Person: " + shallowCopiedPerson);
        System.out.println("Deep Copied Person: " + deepCopiedPerson);
    }
}
