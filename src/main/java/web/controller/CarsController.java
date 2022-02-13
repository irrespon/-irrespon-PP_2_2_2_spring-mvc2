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
    public String welcome (@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        List<Car> quantityCars = CarService.getNumberCars(CarService.getCarList(), count);
        model.addAttribute("cars", quantityCars);
        return "cars";
    }
}
