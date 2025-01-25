@startuml
class Client{
 adapter: Adapter
 
 adapter.processPayment(100); // transaction Id is 1234
 adaptercheckPaymentStatus("1234") // transaction details
}

Client .> Adapter

interface Adapter{
 + processPayment(amount: double): boolean
 + checkPaymentStatus(transactionId: String): String
}

class SBIAdapter implements Adapter{
 - sbiPaymentAPI: SBIPaymentAPI
 + processPayment(amount: double): boolean
 + checkPaymentStatus(transactionId: String): String
}

class ICICIAdapter implements Adapter{
 - iciciPaymentAPI: ICICIPaymentAPI
 + processPayment(amount: double): boolean
 + checkPaymentStatus(transactionId: String): String
}

class KotakAdapter implements Adapter{
 - kotakPaymentAPI: KotakPaymentAPI
 + processPayment(amount: double): boolean
 + checkPaymentStatus(transactionId: String): String
}

class SBIPaymentAPI{
 makePayment(amt: double): boolean
 getTransactionStatus(transactionId: String): String
}

class KotakPaymentAPI{
 initiateTransfer(money: double): boolean
 trackStatus(id: String): String
}

class ICICIPaymentAPI{
 processTransaction(amount: double): boolean
 queryStatus(transactionId: String): String
}

SBIAdapter o-- SBIPaymentAPI
KotakAdapter o-- KotakPaymentAPI
ICICIAdapter o-- ICICIPaymentAPI

@enduml
