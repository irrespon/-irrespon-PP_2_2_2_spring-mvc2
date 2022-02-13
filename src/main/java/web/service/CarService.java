package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    private static List<Car> carList = new ArrayList<>();
    public static List<Car> getNumberCars(List<Car> carList, int count) {
        if (count > 5) {
            count = 5;
        }
        return carList.stream().limit(count).toList();
    }

    public static List<Car> getCarList() {
        carList.add(new Car("zaz","white",1));
        carList.add(new Car("vaz","black",2));
        carList.add(new Car("gaz","red",3));
        carList.add(new Car("izh","blue",4));
        carList.add(new Car("fiat","grey",5));
        return carList;
    }
}