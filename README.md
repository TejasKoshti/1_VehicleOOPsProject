# 🚗 VehicleOOPsProject in Java

This project demonstrates the **4 pillars of Object-Oriented Programming (OOPs)** using a real-world scenario of vehicles such as cars, bikes, and trucks.

## 🔥 OOP Concepts Implemented

1. **Encapsulation** – Data members are private, accessed using getters/setters.
2. **Abstraction** – The `Vehicle` class is abstract and defines the structure for its subclasses.
3. **Inheritance** – `Car`, `Bike`, and `Truck` inherit common properties from `Vehicle`.
4. **Polymorphism** – Method overriding and using a list of `Vehicle` references to invoke subclass behavior.

---

## 🛠️ Project Structure
  VehicleOOPsProject/
├── com/
│ └── oops/
│ ├── Main.java
│ ├── model/
│ │ ├── Vehicle.java
│ │ ├── Car.java
│ │ ├── Bike.java
│ │ └── Truck.java
│ └── service/
│ └── VehicleService.java


---

## 🚀 How to Run

1. Make sure Java is installed (`java -version`)
2. Open terminal and navigate to the project folder.
3. Run the following commands:

```bash
javac com/oops/**/*.java
java com.oops.Main

✅ Sample Output
yaml
Copy
Edit
🚗 Car -> Brand: Maruti, Color: Red, Wheels: 4
🏍️ Bike -> Brand: Yamaha, Color: Black, Wheels: 2
🚚 Truck -> Brand: Tata, Color: Blue, Wheels: 6


📚 Technologies Used
Java 21+

Object-Oriented Programming Concepts

🙌 Author
Tejas Koshti

📌 Bonus (Optional)
You can also include:

A link to your LinkedIn

A .jar file or GitHub Action to auto-run the project
