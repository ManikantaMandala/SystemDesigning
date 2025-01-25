package code.structural.decorator.data_source.datasources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileDataSource implements DataSource {
    private File file;

    public FileDataSource(String fileName) throws NullPointerException {
        file = new File(fileName);
    }

    @Override
    public void writeData(String data) {
        try (FileWriter fw = new FileWriter(file)) {
            fw.write(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String readData() {
        char[] buffer = null;
        try (FileReader br = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            br.read(buffer);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
        return new String(buffer);
    }


}
