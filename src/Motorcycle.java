public class Motorcycle extends Vehicle implements CompeteOnTrack{
    private Double displacement;

    public Motorcycle(String vehicleModel, Float marketPrice, String vehicleType, Double displacement) {
        super(vehicleModel, marketPrice, vehicleType);
        this.displacement = displacement;
    }

    public Double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(Double displacement) {
        this.displacement = displacement;
    }

    @Override
    public void compete() {
        System.out.println("Compite en carrera");
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                " Modelo: "+ super.getVehicleModel()+
                " Precio de mercado: "+super.getMarketPrice()+
                " Tipo de vehiculo: "+ super.getVehicleType()+
                " cilindrada=" + displacement +
                '}';
    }


}
