package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.services.CarsServices;

import static web.dao.CarsDaoImp.cars;

@Controller
public class CarsController {


    private CarsServices carsServices;

    @Autowired
    public void setCarsServices(CarsServices carsServices) {
        this.carsServices = carsServices;
    }

    @GetMapping(value = "/cars")
    public String pageOfCars(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
        model.addAttribute("cars_on_page", carsServices.listOfCarsByCount(cars, count));
        return "cars";
    }
}
