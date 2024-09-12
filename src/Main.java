import entities.Department;
import entities.HourContract;
import entities.Work;
import entities.enums.WorkrLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws ParseException {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the department's name:");
    String departmentName = sc.nextLine();

    System.out.println("Enter work data:");
    System.out.print("Name: ");
    String workName = sc.nextLine();
    System.out.print("Level: ");
    String workLevel = sc.nextLine();
    System.out.print("Base salary: ");
    double baseSalary = sc.nextDouble();

    Work work = new Work(new Department(departmentName), baseSalary, WorkrLevel.valueOf(workLevel), workName);

    System.out.print("How many contracts to this work? ");
    int n = sc.nextInt();

    for(int i = 0; i < n; i++) {
      System.out.println("Enter contract #" + (i + 1) + " data:");
      System.out.print("Date (DD/MM/YYYY): ");
      Date date = sdf.parse(sc.next());
      System.out.print("Value per hour: ");
      double valuePerHour = sc.nextDouble();
      System.out.print("Duration (hours): ");
      int hours = sc.nextInt();
      HourContract contract = new HourContract(date, valuePerHour, hours);
      work.addContract(contract);
    }

    System.out.println();
    System.out.print("Enter month and year to calculate income (MM/YYYY): ");
    String monthAndYear = sc.next();
    int month = Integer.parseInt(monthAndYear.substring(0, 2));
    int year = Integer.parseInt(monthAndYear.substring(3));
    System.out.println("Name: " + work.getName());
    System.out.println("Department: " + work.getDepartment().getName());
    System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", work.income(year, month)));

    sc.close();
  }
}