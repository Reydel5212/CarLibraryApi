package org.ReydelBotAPI.Repository;

import org.ReydelBotAPI.Model.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<CarModel, Integer> {
}
