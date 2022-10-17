package com.bridgelabz;

import java.util.Scanner;

public class EmployeeWageOfCompany {
    Scanner scanner = new Scanner(System.in);
    public String company;
    public int fullTimeHrPerDay;
    public int partTimeHrPerDay;
    public int wagePerHr;
    public int workingDaysOfMonth;
    public int maxWorkingHrs;

    EmployeeWageOfCompany(){
        company = "BridgeLabz";
        fullTimeHrPerDay = 8 ;
        partTimeHrPerDay = 4 ;
        wagePerHr = 20 ;
        workingDaysOfMonth = 20;
        maxWorkingHrs = 100 ;
    }


    public void getInput(){
        System.out.print("Enter Company: ");
        this.company = scanner.next();
        System.out.print("Enter full time hours / Day: ");
        this.fullTimeHrPerDay = scanner.nextInt();
        System.out.print("Enter part time hours / Day: ");
        this.partTimeHrPerDay = scanner.nextInt();
        System.out.print("Enter wage / hours: ");
        this.wagePerHr = scanner.nextInt();
        System.out.print("Enter total working days / month: ");
        this.workingDaysOfMonth = scanner.nextInt();
        System.out.print("Enter maximum working hours / month: ");
        this.maxWorkingHrs = scanner.nextInt();

    }


    public int getEmployeeHrs(int present){
        switch (present) {
            case 2:
                return fullTimeHrPerDay ;
            case 1:
                return partTimeHrPerDay ;
            default :
                return 0 ;
        }
    }
    public int getEmployeeWageOfDay(int hours){
        return  wagePerHr * hours ;
    }
    public boolean checkCondition(int currentDay, int totalHrs){
        if (currentDay!=this.workingDaysOfMonth && totalHrs <= maxWorkingHrs){
            return true;
        }
        else{
            return false;
        }

    }
}
