package com.lld;

import java.util.Scanner;

import com.lld.controller.ParkingLot;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getInstance();
		System.out.println("Hello welcome to ParkingLot!");
		printOption();

        try (Scanner sc = new Scanner(System.in)) {
            while(true){
                int option = sc.nextInt();
                switch(option){
                    case 0:
                        parkingLot.vehicleEntry();
                        break;
                    case 1:
                        parkingLot.vehicleExit();
                        break;
                    case 2:
                        System.out.println("Quitting the Parking lot application");
                        break;
                    default:
						System.out.println("Invalid input");
						printOption();
						break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
	public static void printOption(){
		System.out.println("Here are the options");
		System.out.println("0. Entry");
		System.out.println("1. Exit");
		System.out.println("2. Destroy ParkingLot");
	}
}
