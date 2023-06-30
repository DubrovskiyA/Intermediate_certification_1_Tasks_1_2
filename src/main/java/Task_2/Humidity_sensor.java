package Task_2;

import java.util.Random;

public class Humidity_sensor {
    Random ranObj=new Random();
    int airHumiditySensor(){
        int airHumidity=ranObj.nextInt(0,100);
        return airHumidity;
    }
}
