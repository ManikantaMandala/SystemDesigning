package code.builder.carbuilder;

import code.builder.carbuilder.builder.CarBuilder;
import code.builder.carbuilder.builder.CarManualBuilder;
import code.builder.carbuilder.director.CarDirector;
import code.builder.carbuilder.product.Car;
import code.builder.carbuilder.product.Manual;

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
