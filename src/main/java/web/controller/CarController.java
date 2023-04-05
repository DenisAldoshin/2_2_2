package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarService;
import web.dao.CarServiceImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping("/cars")
    public String CarList(Model model, @RequestParam(value = "count", defaultValue = "5") int count) {
        List<Car> cars = new ArrayList<>(carService.getCars(CarServiceImpl.carList, count));
        model.addAttribute("cars", cars);
        return "cars";
    }
}
