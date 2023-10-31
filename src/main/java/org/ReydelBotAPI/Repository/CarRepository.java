package org.ReydelBotAPI.Repository;

import org.ReydelBotAPI.Model.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface CarRepository extends JpaRepository<CarModel, Integer> {
    Optional<CarModel> findCarByCarBrand(String carBrand);

    @Modifying
    @Transactional
    @Query(value = "delete from car_library.car_table where car_id = 0",nativeQuery = true)
    void deleteCarModelById();
}
