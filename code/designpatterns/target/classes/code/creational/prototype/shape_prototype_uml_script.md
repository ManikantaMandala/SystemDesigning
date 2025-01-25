@startuml
abstract class Shape {
      x: int
      y: int
      color: String
      Shape(): void
      Shape(shape: Shape): void
      clone(): Shape
      equals(object: Object): boolean
}

class Circle extends Shape {
      radius: int
      color: String
      name: String
      Circle(): void
      Circle(radius: int, color: String): void
      Circle(circle: Circle): void
      clone(): Shape
      equals(object: Object): boolean
}

class Rectangle extends Shape {
      width: int
      height: int
      color: String
      name: String
      Rectangle(): void
      Rectangle(width: int, height: int, color: String): void
      Rectangle(rectangle: Rectangle): void
      clone(): Shape
      equals(object: Object): boolean
}

class PrototypeRegistryClient {
      shapes: List<Shape>
      clonedShapes: List<Shape>
      main(args: String[]): void
      compareRegistry(): void
}

PrototypeRegistryClient .> Shape
@enduml

