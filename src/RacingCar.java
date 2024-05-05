public class RacingCar extends Car implements CompeteOnTrack{
    private Double maxSpeed;

    public RacingCar(String vehicleModel, Float marketPrice, String vehicleType, Integer airbag, Double maxSpeed) {
        super(vehicleModel, marketPrice, vehicleType, airbag);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void compete() {
        System.out.println("compite en carrera");
    }

    public Double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Auto de carrera{" +
                " odelo: "+ super.getVehicleModel()+
                " Precio de mercado: "+super.getMarketPrice()+
                " Tipo de vehiculo: "+ super.getVehicleType()+
                " Cant de airbags: "+super.getAirbag()+
                " maxSpeed=" + maxSpeed +
                '}';
    }
}
