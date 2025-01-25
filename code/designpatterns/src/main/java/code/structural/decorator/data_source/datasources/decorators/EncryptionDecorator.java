package code.structural.decorator.data_source.datasources.decorators;

import java.util.Base64;

import code.structural.decorator.data_source.datasources.DataSource;

public class EncryptionDecorator extends BaseDataSourceDecorator {

    public EncryptionDecorator(DataSource wrapee) {
        super(wrapee);
    }

    @Override
    public void writeData(String data) {
        wrapee.writeData(encode(data));
    }

    @Override
    public String readData() {
        return decode(wrapee.readData());
    }

    private String decode(String data) {
        byte[] bytes = Base64.getDecoder().decode(data);

        for (int i = 0; i < bytes.length; i++) {
            bytes[i] -= (byte) 1;
        }

        return new String(bytes);
    }

    private String encode(String data) {
        byte[] bytes = data.getBytes();

        for (int i = 0; i < bytes.length; i++) {
            bytes[i] += (byte) 1;
        }

        return Base64.getEncoder().encodeToString(bytes);
    }
}
