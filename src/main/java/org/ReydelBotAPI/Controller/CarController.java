package org.ReydelBotAPI.Controller;

import org.ReydelBotAPI.Model.CarModel;
import org.ReydelBotAPI.Service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/CarController")
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/mainPage")
    public String mainPage(@ModelAttribute("carModel") CarModel carModel){

        return "pages/mainPage";
    }

    @PostMapping("/addCarInfo")
    public String addCarInfo(@ModelAttribute("carModel") CarModel carModel){

        carService.addCarInfo(carModel);

        return "redirect:mainPage";
    }
}
