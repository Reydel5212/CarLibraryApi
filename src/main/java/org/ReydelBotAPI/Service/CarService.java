package org.ReydelBotAPI.Service;

import org.ReydelBotAPI.Model.CarModel;
import org.ReydelBotAPI.Repository.CarRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    //show info
    public List<CarModel> getCarList(){
        return carRepository.findAll();
    }

    public CarModel getCarById(int id){
        Optional<CarModel> list = carRepository.findById(id);
        return list.orElse(null);
    }

    @Transactional
    public void addCarInfo(CarModel carModel){
        carRepository.save(carModel);
    }
}
