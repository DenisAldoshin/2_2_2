package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarServiceImpl implements CarService {

    public static List<Car> carList = new ArrayList<>();
    {
        carList.add(new Car("Mazda", 323, 3000));
        carList.add(new Car("BMW", 5, 2031));
        carList.add(new Car("Toyota", 2008, 500));
        carList.add(new Car("Honda", 3,3245));
        carList.add(new Car("Mazda", 626,9000));
    }


    @Override
    public List<Car> getCars(List<Car> carList, int count) {
        if ( count >=5 ) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }

}
