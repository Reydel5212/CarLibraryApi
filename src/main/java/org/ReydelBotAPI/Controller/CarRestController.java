package org.ReydelBotAPI.Controller;

import org.ReydelBotAPI.Model.CarModel;
import org.ReydelBotAPI.Service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/CarRestController")
public class CarRestController {

    private final CarService carService;

    public CarRestController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/getCarInfo")
    public List<CarModel> getCarInfo(){
        return carService.getCarList();
    }

    @GetMapping("/{id}/showCarById")
    public CarModel getCarById(@PathVariable("id") int id){
        return carService.getCarById(id);
    }

    @GetMapping("/{carBrand}/showCarByBrand")
    public CarModel getCarByCarBrand(@PathVariable("carBrand") String carBrand){
        return carService.getCarModelsByCarBrand(carBrand);
    }

}
