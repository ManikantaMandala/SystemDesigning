package code.structural.decorator.data_source.datasources;

public interface DataSource {
    void writeData(String data);

    String readData();
}
