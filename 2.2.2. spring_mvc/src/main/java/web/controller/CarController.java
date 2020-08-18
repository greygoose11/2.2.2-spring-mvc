package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

@Controller
public class CarController {
//    Repository rep = new Repository();

    @GetMapping("/car")
//    public Car gettingCar(@RequestParam(value = "name") String model){
    public String printCar(@RequestParam(value = "locale",defaultValue = "") String locale, ModelMap model){
        List<Car> cars = new ArrayList<>();
        if (!(locale == null) && (locale.equals("ru"))) {
            model.addAttribute("locale", "МАШИНЫ");
        }else if (locale.equals("en")) {
            model.addAttribute("locale", "CARS");
        }
//        HashMap<String,String > map = new HashMap<>();
//        map.put("ru", "МАШИНЫ");
//        map.put("en","CARS");
//        map.get(locale);

        cars.add( new Car("Audi Q7", 249, 3.0));
        cars.add(new Car("Infinity FX3.7", 333, 3.7));
        cars.add(new Car("Mercedes ML350", 272, 3.5));
        model.addAttribute("cars",cars);


        return "cars";

    }
}
