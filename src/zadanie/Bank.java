/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie;

import java.util.Scanner;

public class Bank {
    
    void atmBanking(){
    
    Person p = new Person();
        while (true) {
            System.out.println("1 - Insert money \n 2- take money \n 3- total price \n 4- to end  ");
            Scanner scanner2 = new Scanner(System.in);
            String input = scanner2.next();
            int num = Integer.parseInt(input);
            if (num == 1) {
                System.out.println("How many money do you want to insert? :");
                String sum = scanner2.next();
                int money = Integer.parseInt(sum);
                p.insertMoney(money);
            } else if (num == 2) {
                System.out.println("How many money do you want to take? :");
                String sum = scanner2.next();
                int money = Integer.parseInt(sum);
                p.takeMoney(money);
            } else if (num == 3) {
                p.showMoney();
            } else if (num == 4) {
                break;
            }else
            {
                   System.out.println("Wrong input try again");
            }
        }
    
    
    }
    
}
