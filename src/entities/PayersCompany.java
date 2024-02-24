package entities;

public class PayersCompany extends Payers{

    private Integer numberOfEmployees;

    public PayersCompany() {
        
    }

    public PayersCompany(String name, Double annualIncome, Integer numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }


    @Override
    public double taxesPaid() {
        double result = 0.00;
        if (numberOfEmployees > 10) {
            result = (annualIncome * 0.14);
        } else {
            result = (annualIncome * 0.16);
        }

        return result;
    }
    
}
