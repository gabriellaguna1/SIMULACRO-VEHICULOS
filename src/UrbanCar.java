public class UrbanCar extends Car{
    private Integer passenger;

    public UrbanCar(String vehicleModel, Float marketPrice, String vehicleType, Integer airbag, Integer passenger) {
        super(vehicleModel, marketPrice, vehicleType, airbag);
        this.passenger = passenger;
    }

    public Integer getPassenger() {
        return passenger;
    }

    public void setPassenger(Integer passenger) {
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        return "Auto urbano{" +
                " Modelo: "+ super.getVehicleModel()+
                " Precio de mercado: "+super.getMarketPrice()+
                " Tipo de vehiculo: "+ super.getVehicleType()+
                " Cant de airbags: "+super.getAirbag()+
                " Cantidad de pasajeros=" + passenger +
                '}';
    }
}
