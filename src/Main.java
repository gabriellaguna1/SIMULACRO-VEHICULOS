import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    List<Vehicle> vehicleList= new ArrayList<>();

    UtilitaryVehicle utilitary= new UtilitaryVehicle("s4", 2000f, "urbano", 5d, 150d);
    UtilitaryVehicle utilitary1= new UtilitaryVehicle("s5", 2500f, "urbano", 4d, 180d);

    RacingCar racingCar= new RacingCar("GLC coupe lamborghini", 50000f, "de carrera", 5, 300d);
    RacingCar racingCar1= new RacingCar("Ferrari SF-24", 60000f, "de carrera", 6, 350d);

    UrbanCar urbanCar= new UrbanCar("3008 - peugeot", 2500f, "urbano", 2, 5);
    UrbanCar urbanCar1= new UrbanCar("uno - fiat", 1500f, "urbano", 2, 4);

    Motorcycle motorcycle= new Motorcycle("honda xr Tornado", 1200f, "de carrera", 249d );
    Motorcycle motorcycle1= new Motorcycle("Yamaha fz-3", 1000f, "de carrera", 260d);

    vehicleList.add(utilitary);
    vehicleList.add(utilitary1);
    vehicleList.add(racingCar);
    vehicleList.add(racingCar1);
    vehicleList.add(urbanCar);
    vehicleList.add(urbanCar1);
    vehicleList.add(motorcycle);
    vehicleList.add(motorcycle1);

    Integer opc;

    do{
        System.out.println("1 - listado de vehiculos utilitarios");
        System.out.println("2 - listado de vehiculos de carrera");
        System.out.println("3 - listado de vehiculos urbanos");
        System.out.println("4 - listado de motocicletas");
        System.out.println("5 - Cambiar precios");
        System.out.println("6 - salir");

        System.out.println("ingrese la opcion deseada:");
        Scanner sr= new Scanner(System.in);
        opc=sr.nextInt();

        switch(opc){
            case 1:
                for(Vehicle a : vehicleList){
                    if(a instanceof UtilitaryVehicle){
                        System.out.println(a.toString());
                    }
                }
                break;
            case 2:
                for( Vehicle a : vehicleList){
                    if(a instanceof RacingCar){
                        System.out.println(a.toString());
                    }
                }
                break;
            case 3:
                for(Vehicle a: vehicleList){
                    if(a instanceof UrbanCar){
                        System.out.println(a.toString());
                    }
                }
                break;
            case 4:
                for(Vehicle a: vehicleList){
                    if(a instanceof Motorcycle){
                        System.out.println(a.toString());
                    }
                }
            case 5:
                System.out.println("se actualiza el precio de las motos en un 5%");
                for(Vehicle m: vehicleList){
                    if(m instanceof Motorcycle){
                        m.setMarketPrice(m.getMarketPrice()*0.05f + m.getMarketPrice());
                    }

                }
                System.out.println("se actualiza el precio de las utilitarios en un 10%");
                for(Vehicle m : vehicleList){
                    if(m instanceof UtilitaryVehicle){
                        m.setMarketPrice(m.getMarketPrice() * 0.10f + m.getMarketPrice());
                    }
                }
                System.out.println("se actualiza el precio de las autos urbanos en un 15%");
                for(Vehicle m : vehicleList){
                    if(m instanceof UrbanCar){
                        m.setMarketPrice(m.getMarketPrice()*0.15f + m.getMarketPrice());
                    }
                }
                System.out.println("se actualiza el precio de los de carrera en un 20%");
                for(Vehicle m : vehicleList){
                    if(m instanceof RacingCar){
                        m.setMarketPrice(m.getMarketPrice()*0.20f + m.getMarketPrice());
                    }
                }
                break;
            default:
                System.out.println("opcion incorrecta");
                break;
        }
    }while(opc!=6);




    }
}