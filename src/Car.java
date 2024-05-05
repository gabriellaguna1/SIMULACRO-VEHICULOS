public class Car extends Vehicle{
    private Integer airbag;

    public Car(String vehicleModel, Float marketPrice, String vehicleType, Integer airbag) {
        super(vehicleModel, marketPrice, vehicleType);
        this.airbag = airbag;
    }

    public Integer getAirbag() {
        return airbag;
    }

    public void setAirbag(Integer airbag) {
        this.airbag = airbag;
    }
}
