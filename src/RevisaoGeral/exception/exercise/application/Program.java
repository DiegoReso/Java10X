package RevisaoGeral.exception.exercise.application;

import RevisaoGeral.exception.exercise.entities.DomainException;
import RevisaoGeral.exception.exercise.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try{
            System.out.print("Room number: ");
            int numberRoom = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkin = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkout = sdf.parse(sc.next());

            Reservation reservation = new Reservation(numberRoom,checkin,checkout);
            System.out.println("Reservation: " + reservation);
            System.out.println();

            System.out.println("Enter date to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkin = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkout = sdf.parse(sc.next());

            reservation.updateDates(checkin,checkout);

        }catch (ParseException e){
            System.out.println("Invalid date Format " + e.getMessage());
        }catch (DomainException e){
            System.out.println("Erro in reservation: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error!");
        }finally {
            sc.close();
        }
    }
}
