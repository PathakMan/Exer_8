package com.company;


class Staff extends com.company.Person implements Salary{
    String education , Position;
    void InitiShahze1(){
        InitiShahze();
        System.out.println("Enter your Education: ");
        education = sr.nextLine();
        System.out.println("Enter your Position");
        Position = sr.nextLine();
    }

    void Print1(){
        printData();
        System.out.println("Education: " + education);
        System.out.println("Position: "+ Position);
    }


    @Override
    public void salaryToPayPathak56458(int hoursPathak56458, int RatePathak56458) {

    }

    @Override
    public int salaryForOvertime(int extrahoursPathak56458, int ratePathak56458) {
        return Salary.super.salaryForOvertime(extrahoursPathak56458, ratePathak56458);
    }
}

interface Salary{
    void salaryToPayPathak56458(int hoursPathak56458, int RatePathak56458);

    default int salaryForOvertime(int extrahoursShah56255, int rateShah56255){
        int salaryOverTime=extrahoursShah56255 * rateShah56255;
        return salaryOverTime;

    }

    static double bonusCheckPathak56458( int yearsOfExpirience){
        double bonusPathak56458=0;
        if (yearsOfExpirience>3) bonusPathak56458=100;
        else bonusPathak56458=0;
        return bonusPathak56458;
    };


}

public class Tasks
{

    public static void main(String[] args)
    {
        Staff employee = new Staff();
        employee.InitiShahze();
        employee.Print1();
        employee.salaryToPayPathak56458(5,9);
        Salary.bonusCheckPathak56458(7);
    }
}
