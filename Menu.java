/************************************
 * MENU CLASS
 * SIMPHIWE MCHUNU
 * 25 AUGUST 2016
 *
 ************************************/

import java.util.Scanner;
public class Menu {
   public static void main(final String args[]) {
      Scanner user_input = new Scanner(System.in);
      System.out.println("Welcome to Great International Food Court");
      System.out.println("MENU: add (P)izza, add (C)urry, add (S)oft drink, (D)elete, (L)ist, (Q)uit");
      String query = user_input.nextLine();
      int a = -1;
      String list[] = new String[1000];
      String Itemlist[] = new String[1000];
      while(query.equals("q") == false) {
         if(query.equals("p") == false & query.equals("s") == false & query.equals("c") == false & query.equals("l") == false & query.equals("d") == false) {
            System.out.println("Not found\nMENU: add (P)izza, add (C)urry, add (S)oft drink, (D)elete, (L)ist, (Q)uit");
         }
         else {
            String itemNum;
            String size;
            if(query.equals("l") == false) {
               System.out.println("Enter the menu item number");
               itemNum = user_input.next();
               user_input.nextLine();
               if(query.equals("d") == false) {
                  System.out.println("Enter the size");
                  size = user_input.nextLine();
                  a++;
                  if(query.equals("p") == true) {
                     System.out.println("Enter the base");
                     String base = user_input.nextLine();
                     System.out.println("Enter extra cheese");
                     String cheese = user_input.nextLine();
                     System.out.println("Enter extra garlic");
                     String garlic = user_input.nextLine();
                     Pizza pizza = new Pizza(base, cheese, garlic, itemNum, size);
                     list[a] = pizza.toString();
                     Itemlist[a] = pizza.getItemNumber();
                  }
                  else if(query.equals("c") == true) {
                     System.out.println("Enter the curry type");
                     String curryType = user_input.nextLine();
                     Curry curry = new Curry(curryType, itemNum, size);
                     list[a] = curry.toString();
                     Itemlist[a] = curry.getItemNumber();
                  }
                  else if(query.equals("s") == true) {
                     System.out.println("Enter the flavour");
                     String flavour = user_input.nextLine();
                     System.out.println("Enter whether it is a bottle or can");
                     String container = user_input.nextLine();
                     SoftDrink softDrink = new SoftDrink(flavour, container, itemNum, size);
                     list[a] = softDrink.toString();
                     Itemlist[a] = softDrink.getItemNumber();
                  }
                  System.out.println("Done");
               }
               else { //when delete = true
                  for(int k = 0; k < list.length; k++) {
                     if(itemNum.equals(Itemlist[k]) == true) {
                        list[k] = null;
                        Itemlist[k] = null;
                        System.out.println("Done");
                        break;
                     }
                     else {
                        if(k == list.length-1) {
                           System.out.println("Not found");
                           break;
                        }
                     }
                  }
               }
            }
            else { //when list = true
               for(int q = 0; q < list.length; q++) {
                  if(list[q] == null)
                     continue;
                  else System.out.println(list[q]);
               }
               System.out.println("Done");
            }
            System.out.println("MENU: add (P)izza, add (C)urry, add (S)oft drink, (D)elete, (L)ist, (Q)uit");
         } query = user_input.nextLine();
      }
   }
}
