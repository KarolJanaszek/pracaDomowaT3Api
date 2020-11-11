package pl.bykowski.pdt3api.service;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.bykowski.pdt3api.model.Car;
import pl.bykowski.pdt3api.model.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> carList;

    public CarServiceImpl() {
        createCars();
    }

    @Override
    public List<Car> getAllCars() {
        return carList;
    }

    @Override
    public Optional<Car> getCarById(long id) {
        return carList
                .stream()
                .filter(car -> car.getCarId() == id)
                .findFirst();
    }

    @Override
    public List<Car> getCarsByColor(String color) {
        return carList
                .stream()
                .filter(car -> color.equalsIgnoreCase(car.getColor().name()))
                .collect(Collectors.toList());
    }

    @Override
    public boolean addCar(Car car) {
        boolean add = carList.add(car);
        return add;
    }

    @Override
    public void removeCar(Car car) {
        carList.remove(car);
    }

    private List<Car> createCars() {
        carList = new ArrayList<>();
        carList.add(new Car("Fiat", "Panda", Color.RED));
        carList.add(new Car("Volkswagen", "DasAuto", Color.RED));
        carList.add(new Car("Lada", "Niva", Color.GREEN));
        return carList;
    }
}
