package web.services;

import web.model.Car;

import java.util.List;

public interface CarsServices {

    List<Car> listOfCarsByCount(List<Car> cars, Integer countOfCars);

}
