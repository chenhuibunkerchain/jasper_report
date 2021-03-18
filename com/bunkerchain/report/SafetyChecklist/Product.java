public class Product {
    private Double maxRate;
    private Double toppingRate;
    private Double initialRate;
    private String grade;

    public Product(){}

    public Product(Double maxRate, Double toppingRate, Double initialRate, String grade){
        this.maxRate = maxRate;
        this.toppingRate = toppingRate;
        this.initialRate = initialRate;
        this.grade = grade;

    }

    public Double getMaxRate() {
        return maxRate;
    }

    public void setMaxRate(Double maxRate) {
        this.maxRate = maxRate;
    }

    public Double getToppingRate() {
        return toppingRate;
    }

    public void setToppingRate(Double toppingRate) {
        this.toppingRate = toppingRate;
    }

    public Double getInitialRate() {
        return initialRate;
    }

    public void setInitialRate(Double initialRate) {
        this.initialRate = initialRate;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

}