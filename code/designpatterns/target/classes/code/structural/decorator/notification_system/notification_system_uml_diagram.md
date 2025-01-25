@startuml

interface Notifier {
  send(message: String): void
}

class SMSNotifer implements Notifier {
  send(message: String): void
}

class BaseNotifier implements Notifier {
  - notifier: Notifier
  BaseNotifier(notifier): BaseNotifier
  send(message: String): void
}

class FacebookNotifier extends BaseNotifier {
  FacebookNotifier(wrapee: Notifier): FacebookNotifier
  send(message: String): void
}

class SlackNotifier extends BaseNotifier {
  SlackNotifier(wrapee: Notifier): SlackNotifier
  send(message: String): void
}

class NotificationClient {
  notifier: Notifier
  
  // configure the notifier 
  
  // sending the message
  notifier.send("Hello world")
}

NotificationClient .> Notifier

@enduml
