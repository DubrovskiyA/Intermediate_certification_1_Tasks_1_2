package Task_2;

import java.time.LocalDate;

public class Service {
    private LocalDate newDate;
    Humidity_sensor sensor=new Humidity_sensor();
    LocalDate calculationDateOfWatering(LocalDate lastDate) {
        if (lastDate.getMonthValue()>11 || lastDate.getMonthValue()<3){
            newDate=lastDate.plusMonths(1);
        }
        if (lastDate.getMonthValue()>2 && lastDate.getMonthValue()<6
            || lastDate.getMonthValue()>8 && lastDate.getMonthValue()<12){
            newDate=lastDate.plusWeeks(1);
        }
        if (lastDate.getMonthValue()>5 && lastDate.getMonthValue()<9){
            int airHumidity=sensor.airHumiditySensor();
            if (airHumidity<30){
                newDate=lastDate.plusDays(2);
            } else {
                newDate=lastDate;
            }
        }
        return newDate;
    }
}
