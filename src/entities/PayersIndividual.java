package entities;

public class PayersIndividual extends Payers {

    private Double healthExpenditures;

    public PayersIndividual(){
        
    }

    public PayersIndividual(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double taxesPaid() {
        double result = 0.00;
        if(annualIncome < 20000.00) {
            result = (annualIncome * 0.15) - (healthExpenditures * 0.5);
        } else {
            result = (annualIncome * 0.25) - (healthExpenditures * 0.5);
        }

        return result;
    }

    
}
