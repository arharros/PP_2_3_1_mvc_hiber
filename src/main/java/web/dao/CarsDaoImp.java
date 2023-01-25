package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class CarsDaoImp implements CarsDao {

    public static List<Car> cars = Arrays.asList(
            new Car("SomeModel1", 34567, 1998)
            , new Car("SomeModel2", 25634, 2005)
            , new Car("SomeModel3", 84526, 1985)
            , new Car("SomeModel4", 69754, 2004)
            , new Car("SomeModel5", 12485, 2006));


    @Override
    public List<Car> listOfCarsByCount(List<Car> cars, Integer countOfCars) {
        List<Car> carListByCount = new ArrayList<>();
        for (int i = 0; i < countOfCars; i++) {
            carListByCount.add(cars.get(i));
        }
        return carListByCount;
    }
}
