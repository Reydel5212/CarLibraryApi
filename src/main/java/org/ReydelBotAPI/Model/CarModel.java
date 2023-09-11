package org.ReydelBotAPI.Model;

import jakarta.persistence.*;

@Entity
@Table(name="car_table")
public class CarModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private int carId;

    @Column(name = "car_country")
    private String carCountry;

    @Column(name = "car_brand")
    private String carBrand;

    @Column(name = "car_model")
    private String carBrandModel;

    @Column(name = "car_body_index")
    private String carBodyIndex;

    @Column(name = "car_body_type")
    private String carBodyType;

    @Column(name = "car_year_start")
    private int carYearStart;

    @Column(name = "car_year_end")
    private int carYearEnd;

    @Column(name = "car_description")
    private String carDescription;

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarCountry() {
        return carCountry;
    }

    public void setCarCountry(String carCountry) {
        this.carCountry = carCountry;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }



    public String getCarBodyIndex() {
        return carBodyIndex;
    }

    public void setCarBodyIndex(String carBodyIndex) {
        this.carBodyIndex = carBodyIndex;
    }

    public String getCarBodyType() {
        return carBodyType;
    }

    public void setCarBodyType(String carBodyType) {
        this.carBodyType = carBodyType;
    }

    public int getCarYearStart() {
        return carYearStart;
    }

    public void setCarYearStart(int carYearStart) {
        this.carYearStart = carYearStart;
    }

    public int getCarYearEnd() {
        return carYearEnd;
    }

    public void setCarYearEnd(int carYearEnd) {
        this.carYearEnd = carYearEnd;
    }

    public String getCarDescription() {
        return carDescription;
    }

    public void setCarDescription(String carDescription) {
        this.carDescription = carDescription;
    }


    public String getCarBrandModel() {
        return carBrandModel;
    }

    public void setCarBrandModel(String carBrandModel) {
        this.carBrandModel = carBrandModel;
    }
}
