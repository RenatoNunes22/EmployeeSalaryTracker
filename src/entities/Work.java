package entities;

import entities.enums.WorkrLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Work {
  private String name;
  private WorkrLevel level;
  private Double baseSalary;

  private Department department;
  private List<HourContract>  contracts = new ArrayList<>();

    public Work() {
    }

  public Work(Department department, Double baseSalary, WorkrLevel level, String name) {
    this.department = department;
    this.baseSalary = baseSalary;
    this.level = level;
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WorkrLevel getLevel() {
    return level;
  }

  public void setLevel(WorkrLevel level) {
    this.level = level;
  }

  public Double getBaseSalary() {
    return baseSalary;
  }

  public void setBaseSalary(Double baseSalary) {
    this.baseSalary = baseSalary;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public List<HourContract> getContracts() {
    return contracts;
  }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public double income(int year, int month) {
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract c : contracts) {
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if (c_year == year && c_month == month) {
                sum += c.totalValue();
            }
        }
        return sum;
    }



}
