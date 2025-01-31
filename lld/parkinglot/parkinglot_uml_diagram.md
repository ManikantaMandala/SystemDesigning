@startuml

class ParkingLot {
  List<Floor> floors
  List<VehicleSlotRecord> vehicleSlotrecords
  List<Operator> operators
  List<Gate> gates
  List<PaymentVehicleRecord> paymentVehicleRecords
}

class Floor {
  String id
  int floorNumber
  List<Slot> slots
  Gate entryGate
  Gate exitGate
}

class Slot {
  String id
  int floorNumber
  String slotNumber
  SlotStatus status
  VehicleType type
}

enum SlotStatus {
  OCCUPIED,
  NOT_OCCUPIED
}

class Vehicle {
  String id
  String vehicleNumber
}

class VehicleSlotRecord {
  String id
  String vehicleNumber
  Slot slot
  Time entryTime
}

enum VehicleType {
  2_WHEELER,
  4_WHEELER
}

class Gate {
  GateType type
  Operator operator
  int floorNumber
}

enum GateType {
  ENTRY,
  EXIT
}

class Operator {
  String id
  String name
}

class Bill {
  String id
  Time entryTime
  Time exitTime
  Vehicle vehicle
  Slot slot
  double price
  Operator operator
}

class Payment {
  String id
  Bill bill
  PaymentType type
  PaymentStatus status
}

class PaymentVehicleRecord {
  String id
  Payment payment
  String vehicleNumber
}

enum PaymentStatus {
  COMPLETED,
  NOT_COMPLETED
}

enum PaymentType {
  CASH,
  ONLINE_UPI
}

ParkingLot *.. Floor
ParkingLot *.. Gate
ParkingLot o.. Operator
ParkingLot *-- VehicleSlotRecord
ParkingLot *-- PaymentVehicleRecord
VehicleSlotRecord o-- Vehicle
VehicleSlotRecord o-- Slot
Floor *.. Gate
Floor *.. Slot
PaymentVehicleRecord o.. Payment
Payment o. Bill
Gate o. Operator
Bill o.. Operator

@enduml
