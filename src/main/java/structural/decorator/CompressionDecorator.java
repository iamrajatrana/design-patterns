package structural.decorator;

public class CompressionDecorator extends DataSourceDecorator {

    public CompressionDecorator(DataSource wrapee) {
        super(wrapee);
    }

    @Override
    public String read() {
        return decompress(super.read());
    }

    @Override
    public void write(String data) {
        super.write(compress(data));
    }

    private String compress(String data) {
        return "COMPRESSED::" + data;
    }

    private String decompress(String data) {
        return "DECOMPRESSED::" + data;
    }


}
