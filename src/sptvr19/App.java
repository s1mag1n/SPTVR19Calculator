/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19;

import java.util.Scanner;



/**
 *
 * @author user
 */
class App {
    private final Scanner scanner = new Scanner(System.in);
    public void run(){
        System.out.println("Выполняется метод run");
        System.out.println("Введите первое число");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int number2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Укажите операцию (+,-,*,/)");
        String znak = scanner.nextLine();
        System.out.println("результат:");
        if (null != znak)switch (znak) {
            case "+":
                System.out.println(number1 + number2);
                break;
            case "-":
                System.out.println(number1 - number2);
                break;
            case "*":
        {
            int nubmer2 = 0;
            System.out.println(number1 * nubmer2);
        }
                break;
            case "/":
                System.out.println(number1 / number2);
                break;
            default:
                break;
        }
       
        System.out.println("закончится метод run");
    }

  
}
