package code.structural.decorator.data_source.datasources.decorators;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

import code.structural.decorator.data_source.datasources.DataSource;

public class ComprasionDecorator extends BaseDataSourceDecorator {
    private int compressionLevel = 6;

    public ComprasionDecorator(DataSource wrapee) {
        super(wrapee);
    }

    public int getCompressionLevel() {
        return compressionLevel;
    }

    public void setCompressionLevel(int compressionLevel) {
        this.compressionLevel = compressionLevel;
    }

    public void writeData(String data) {
        wrapee.writeData(compress(data));
    }

    public String readData() {
        return decompress(wrapee.readData());
    }

    private String compress(String data) {
        byte[] byteData = data.getBytes();

        try (ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
                DeflaterOutputStream dos = new DeflaterOutputStream(
                        bout,
                        new Deflater(compressionLevel));) {

            dos.write(byteData);

            return Base64.getEncoder().encodeToString(bout.toByteArray());
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private String decompress(String data) {
        byte[] byteData = Base64.getDecoder().decode(data);

        try (InputStream in = new ByteArrayInputStream(byteData);
                InflaterInputStream iin = new InflaterInputStream(in);
                ByteArrayOutputStream bout = new ByteArrayOutputStream(512);) {

            int b;

            while ((b = iin.read()) != -1) {
                bout.write(b);
            }

            return new String(bout.toByteArray());
        } catch (Exception e) {

            e.printStackTrace();
            return "";
        }
    }
}
