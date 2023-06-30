package Task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int confLettersAmount=15;
        int confSpaceAmount=3;
        int confLength_sm= ((confLettersAmount / 3) * 62) + (confSpaceAmount * 12);
        System.out.println("Введите значение длины забора (см):");
        Scanner scObj=new Scanner(System.in);
        try {
            float lengthOfFence = scObj.nextFloat();
            if (lengthOfFence<confLength_sm){
                System.out.println("Длины этого забора недостаточно для признания! Подыщите более длинный забор!");
            } else
            {
                System.out.println("Этот забор подходит для признания!");
            }
        } catch (Exception ex){
            System.out.println("Введено некорректное значение! Попробуйте снова!");
        }
    }
}
