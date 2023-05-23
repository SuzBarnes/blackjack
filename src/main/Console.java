package main;

import java.util.Scanner;

public class Console {
String askUser(){
    Scanner keyboard = new Scanner(System.in);
   return keyboard.nextLine();
};
int askUserForInt(){
    Scanner keyboard = new Scanner(System.in);
    return keyboard.nextInt();
};
}
