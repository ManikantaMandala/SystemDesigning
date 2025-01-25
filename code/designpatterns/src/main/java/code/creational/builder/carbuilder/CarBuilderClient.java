package code.creational.builder.carbuilder;

import code.creational.builder.carbuilder.builder.CarBuilder;
import code.creational.builder.carbuilder.builder.CarManualBuilder;
import code.creational.builder.carbuilder.director.CarDirector;
import code.creational.builder.carbuilder.product.Car;
import code.creational.builder.carbuilder.product.Manual;

public class CarBuilderClient {

    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();
        CarManualBuilder manualBuilder = new CarManualBuilder();

        CarDirector carDirector = new CarDirector();

        carDirector.makeSUV(carBuilder);
        carDirector.makeSUV(manualBuilder);

        Car car = carBuilder.getProduct();
        Manual manual = manualBuilder.getProduct();

        System.out.println(car);
        manual.paint();
    }
}
