package structural.decorator;

public interface DataSource {
    public String read();

    public void write(String data);
}
