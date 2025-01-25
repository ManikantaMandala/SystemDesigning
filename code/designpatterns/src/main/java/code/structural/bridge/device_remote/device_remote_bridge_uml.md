@startuml

interface Device {

  isEnabled(): boolean
  enable(): void
  disable(): void
  
  getVolume(): int
  setVolume(int volume): void
  
  getChannel(): int
  setChannel(int channel): void
  
  printDeviceStatus(): void
  
  toString(): String

}

class Radio implements Device {

  isEnabled(): boolean
  enable(): void
  disable(): void
  
  getVolume(): int
  setVolume(int volume): void
  
  getChannel(): int
  setChannel(int channel): void
  
  printDeviceStatus(): void
  
  toString(): String

}

class Tv implements Device {

  isEnabled(): boolean
  enable(): void
  disable(): void
  
  getVolume(): int
  setVolume(int volume): void
  
  getChannel(): int
  setChannel(int channel): void
  
  printDeviceStatus(): void
  
  toString(): String
  
}


interface Remote {

  power(): void
  
  volumeUp(): void
  volumeDown(): void

  channelUp(): void
  channelDown(): void

}

class BasicRemote implements Remote {
  # Device device
  
  power(): void
  
  volumeUp(): void
  volumeDown(): void

  channelUp(): void
  channelDown(): void
  
}

class AdvancedRemote extends BasicRemote {
  mute(): void
}

Remote o- Device

@enduml
