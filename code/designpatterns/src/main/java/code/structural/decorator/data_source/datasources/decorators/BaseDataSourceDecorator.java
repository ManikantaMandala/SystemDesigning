package code.structural.decorator.data_source.datasources.decorators;

import code.structural.decorator.data_source.datasources.DataSource;

public class BaseDataSourceDecorator implements DataSource {
    protected DataSource wrapee;

    public BaseDataSourceDecorator(DataSource wrapee) {
        this.wrapee = wrapee;
    }

    public void setWrapee(DataSource wrapee) {
        this.wrapee = wrapee;
    }

    @Override
    public void writeData(String data) {
        wrapee.writeData(data);
    }

    @Override
    public String readData() {
        return wrapee.readData();
    }

}
