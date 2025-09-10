package Domain.ClassNObject;

public class task1 {
    public static void main(String[] args) {
        car carBrand = new car("Audi", "B6", 2023);
        System.err.println(carBrand.brand);
        carBrand.startCar();
        person personname = new person("Ragul");
        carBrand.driveCar(personname);
    }
    static class car{
        String brand;
        String model;
        int year;
        car(String brand,String model,int year){
            this.brand = brand;
            this.model=model;
            this.year=year;
        }
        void startCar(){
            System.err.println(brand+" Car is Starting ");
        }
        void driveCar(person name){
            System.out.println(brand + " is drived by "+name.name);
        }
    }
    static class person{
        String name;
        person(String name){
            this.name=name;
        }

    }
}
