package Task_2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ConsoleApp {
    public static void main(String[] args) {
        Service service=new Service();
        Scanner scObj=new Scanner(System.in);
        System.out.println("Введите дату последнего полива кактуса в формате dd-mm-yyyy:");
        String inputDate=scObj.nextLine();
        LocalDate dateOfLastWatering = null;
        DateTimeFormatter dateFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try {
            dateOfLastWatering = LocalDate.parse(inputDate, dateFormatter);
            System.out.println("Дата последнего полива:"+inputDate);
            LocalDate dateToWatering=service.calculationDateOfWatering(dateOfLastWatering);
            String outputDate=dateToWatering.format(dateFormatter);
            if (dateToWatering.isEqual(dateOfLastWatering)){
                System.out.println("Поливать кактус пока не нужно - повышенная влажность воздуха!");
            } else{
                System.out.println("Дата следующего полива:"+outputDate);
            }
        } catch (Exception ex){
            System.out.println("Введена некорректная дата последнего полива! Попробуйте снова!");
        }
    }
}
