package code.structural.decorator.data_source;

import code.structural.decorator.data_source.datasources.FileDataSource;
import code.structural.decorator.data_source.datasources.decorators.EncryptionDecorator;

public class ClientDataSourceDecorator {

    public static void main(String[] args) {
        FileDataSource fileDataSource = new FileDataSource("./designpatterns/src/main/resources/readme.md");
        EncryptionDecorator encryptionDecorator = new EncryptionDecorator(fileDataSource);

        String fileContent = "Hello world\n\nThis is the readme file";

        encryptionDecorator.writeData(fileContent);
        String output = encryptionDecorator.readData();

        System.out.println(output);
    }
}