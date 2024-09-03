/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filtro;

import filtro.ConnectioLan.Conexion;
import java.util.Scanner;



/**
 *
 * @author camper
 */
public class Main {
    public static void main(String[] args) {
        
        Conexion conexion = new Conexion();
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("vienvenido al menu de la aldea  :");
           System.out.println("que desea hacer :");
        System.out.println("1. ninja");
        System.out.println("2. misiones");
        System.out.println("3. Habilidades");
        System.out.println("4. Exit");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        switch (choice) {
            case 1:
                SubMenuView Event = new SubMenuView();
                Event.menuEvent();
                break;
            case 2:
                SubMenuView Ticket = new SubMenuView();
                Ticket.menuTicket();          
                break;
            case 3:
                SubMenuView booth = new SubMenuView();
                booth.menuTicketBooth();
                break;
            case 4:
                SubMenuView act = new SubMenuView();
                act.menuActivities();
                break;
            case 5:
                SubMenuView come = new SubMenuView();
                come.menuComerce();
                break;
            case 6:
                SubMenuView staf = new SubMenuView();
                staf.menuStaff();
                break;
            case 7:
                SubMenuView client = new SubMenuView();
                client.menuClient();
                break;
            case 8:
                SubMenuView acount = new SubMenuView();
                acount.menuAccounting();
                break;
            case 9:
                System.out.println("Exiting...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid option.");
                break;
        }*/
    }

}
