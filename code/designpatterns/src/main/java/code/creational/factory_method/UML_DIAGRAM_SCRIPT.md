@startuml
class RentalRecord{
    Vehicle vehicle
    LocalDateTime startTime
    LocalDateTime endTime
    Double price
    
    calculatePrice(): void
}

class Rental{
    abstract createVehicle(): Vehicle
    createRentalRecord(): RentalRecord
}

class CarRental extends Rental{
    createVehicle(): Vehicle
}

class BikeRental extends Rental{
    createVehicle(): Vehicle
}

class TruckRental extends Rental{
    createVehicle(): Vehicle
}

interface Vehicle {
    void Starting();
    void Stopping();
    Double DisplayingCost();
}

class Car extends Vehicle{
    void Starting(){}
    void Stopping(){}
    Double DisplayingCost();
}

class Bike extends Vehicle{
    void Starting(){}
    void Stopping(){}
    Double DisplayingCost();
}

class Truck extends Vehicle{
    void Starting(){}
    void Stopping(){}
    Double DisplayingCost();
}

class VehicleRentalSystem{
    List<RentalRecord> records;
    
    static main(String[] args): void
    
    static addRentalRecord(String rentalType, String customerName): void
}

Rental --> Vehicle
Rental --> RentalRecord

VehicleRentalSystem -- RentalRecord
VehicleRentalSystem -- Rental

@enduml
