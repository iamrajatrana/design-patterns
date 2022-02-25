package structural.decorator;

public class DataSourceDecorator implements DataSource{

    private DataSource wrapee;

    public DataSourceDecorator(DataSource wrapee) {
        this.wrapee = wrapee;
    }

    @Override
    public String read() {
        return wrapee.read();
    }

    @Override
    public void write(String data) {
        wrapee.write(data);
    }
}
