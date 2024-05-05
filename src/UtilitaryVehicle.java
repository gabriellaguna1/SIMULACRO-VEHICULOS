public class UtilitaryVehicle extends  Vehicle{
    private Double height;
    private Double maxKg;

    public UtilitaryVehicle(String vehicleModel, Float marketPrice, String vehicleType, Double height, Double maxKg) {
        super(vehicleModel, marketPrice, vehicleType);
        this.height = height;
        this.maxKg = maxKg;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getMaxKg() {
        return maxKg;
    }

    public void setMaxKg(Double maxKg) {
        this.maxKg = maxKg;
    }

    @Override
    public String toString() {
        return "Vehiculo utilitario{" +
                " Modelo: "+ super.getVehicleModel()+
                " Precio de mercado: "+super.getMarketPrice()+
                " Tipo de vehiculo: "+ super.getVehicleType()+
                " Altura=" + height +
                ", Max. kg=" + maxKg +
                '}';
    }
}
