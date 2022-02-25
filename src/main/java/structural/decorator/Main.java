package structural.decorator;

// Initially, the business logic class could only read and write data in plain text.
// Then we created several small wrapper classes that add new behavior after executing standard operations in a wrapped object.
// The first wrapper encrypts and decrypts data, and the second one compresses and extracts data.
public class Main {
    public static void main(String[] args) {
        String record = """
                Name, Salary
                Rajat, 100000
                """;
        DataSourceDecorator compressedAndEncoded = new CompressionDecorator(
                new EncryptionDecorator(
                    new FileDataSource("demo.txt")));
        compressedAndEncoded.write(record);

        DataSource plain = new FileDataSource("demo.txt");

        System.out.println("- Input ----------------");
        System.out.println(record);
        System.out.println("- Encoded --------------");
        System.out.println(plain.read());
        System.out.println("- Decoded --------------");
        System.out.println(compressedAndEncoded.read());
    }
}
