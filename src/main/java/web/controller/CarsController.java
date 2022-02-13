package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarsController {

    @GetMapping("/cars")
    public String welcome (@RequestParam(value = "quantityCar", defaultValue = "5") int quantityCar, Model model) {
        List<Car> quantityCars = CarService.getNumberCars(CarService.getCarList(),quantityCar);
        model.addAttribute("cars", quantityCars);
        return "cars";
    }
}
