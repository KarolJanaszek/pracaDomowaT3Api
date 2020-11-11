package pl.bykowski.pdt3api.service;

import pl.bykowski.pdt3api.model.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {
    List<Car> getAllCars();
    Optional<Car> getCarById(long id);
    List<Car> getCarsByColor(String color);
    boolean addCar(Car car);
    void removeCar(Car car);
}
