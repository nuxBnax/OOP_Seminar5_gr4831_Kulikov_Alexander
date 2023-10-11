package controller;

import Service.Operations;

import model.Functions;
import view.Text;

import java.util.Scanner;

public class Controller {

Functions functions = new Functions();
    public void menu() {

        Scanner cs = new Scanner(System.in);
        Text.welcome();

        int num = cs.nextInt();
        boolean flag = true;
        while (flag) {
            switch (num) {
                case 1:
                    Operations.subMenu();
                    break;
                case 2:
                    Operations.subMenuComplex();
                    break;
                case 3:
                    functions.readHistory();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    Text.noThatNumber();
                    break;
            }
            cs.close();
        }
    }
}
