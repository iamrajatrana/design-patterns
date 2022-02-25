package structural.decorator;

import java.util.Base64;

public class EncryptionDecorator extends DataSourceDecorator{

    public EncryptionDecorator(DataSource wrapee) {
        super(wrapee);
    }

    @Override
    public String read() {
        return decode(super.read());
    }

    @Override
    public void write(String data) {
        super.write(encode(data));
    }

    private String encode(String data) {
        byte[] result = data.getBytes();
        for(int i=0;i<result.length;i++)
            result[i] += (byte) 1;
        return Base64.getEncoder().encodeToString(result);
    }

    private String decode(String data) {
        byte[] result = Base64.getDecoder().decode(data);
        for(int i=0;i<result.length;i++)
            result[i] -= (byte) 1;
        return new String(result);

    }
}
