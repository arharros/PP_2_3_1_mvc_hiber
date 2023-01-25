package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarsDao;
import web.model.Car;

import java.util.List;

@Service
public class CarsServicesImp implements CarsServices {


    private CarsDao carsDao;

    @Override
    public List<Car> listOfCarsByCount(List<Car> cars, Integer countOfCars) {
        if (countOfCars == null || (countOfCars <= 0) || (countOfCars > cars.size())) {
            return cars;
        } else {
            return carsDao.listOfCarsByCount(cars, countOfCars);
        }
    }

    @Autowired
    public void setCarsDao(CarsDao carsDao) {
        this.carsDao = carsDao;
    }
}
