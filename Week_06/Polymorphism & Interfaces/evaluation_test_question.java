Perfect, Sifat ✅

You’ve completed **Class 12 – Polymorphism & Interfaces**, which includes:

* Static (compile-time) and dynamic (runtime) polymorphism
* Method overloading and overriding
* Abstract classes and interfaces
* Default & static interface methods
* Multiple inheritance using interfaces
* Abstraction and “contract” concepts

Now, to **evaluate whether you’ve truly mastered this chapter** and are ready to move forward, here’s a single **comprehensive coding challenge** that covers **all key concepts from this PDF**.

---

## 🧩 **Comprehensive Challenge — “Smart Device Management System”**

### 🎯 **Goal**

Design a small Java system demonstrating **abstraction, static & dynamic polymorphism, and interfaces** (including multiple inheritance).

---

### 🏗️ **Scenario**

You are designing a program to manage different types of smart devices — **Phone**, **Laptop**, and **SmartWatch**.
All of them share certain behaviors but also have unique capabilities.

You’ll use **abstract classes** and **interfaces** to model this system.

---

### 🔹 **Requirements**

#### 1. **Abstract Superclass: `SmartDevice`**

* **Private fields:** `brand`, `batteryLevel`
* **Constructor:** Initializes both fields
* **Abstract method:** `void powerOn()`
* **Concrete method:** `void charge(int percent)` → increases battery level
* **Method overloading:**

  * `charge(int percent)` → adds %
  * `charge(int percent, boolean fastCharge)` → adds % faster if `fastCharge == true`
  * (👉 covers **compile-time polymorphism**)

#### 2. **Interfaces**

* **`Connectable` interface**

  * `void connectToWiFi(String networkName)`
  * `default void disconnect()` → prints `"Disconnected from network."`

* **`Portable` interface**

  * `void carryAround()`
  * Add a `static void info()` method → prints `"Portable devices are easy to carry."`

#### 3. **Subclasses**

* **`Phone` extends `SmartDevice` implements `Connectable`, `Portable`**

  * Override `powerOn()` → `"Phone is starting up..."`
  * Implement `connectToWiFi()` and `carryAround()`
  * Add method `makeCall(String number)` → `"Calling <number>..."`

* **`Laptop` extends `SmartDevice` implements `Connectable`**

  * Override `powerOn()` → `"Laptop booting..."`
  * Implement `connectToWiFi()`
  * Add method `code()` → `"Coding in Java..."`

* **`SmartWatch` extends `SmartDevice` implements `Portable`**

  * Override `powerOn()` → `"SmartWatch activated."`
  * Implement `carryAround()`
  * Add method `trackSteps(int steps)` → `"Tracking <steps> steps."`

---

### 🔹 **Demonstration Requirements**

In your `Main` class:

1. Create objects:

   ```java
   SmartDevice phone = new Phone("Samsung", 60);
   SmartDevice laptop = new Laptop("Dell", 75);
   SmartDevice watch = new SmartWatch("Apple", 40);
   ```

2. Show **runtime polymorphism**:

   ```java
   SmartDevice[] devices = { phone, laptop, watch };
   for (SmartDevice d : devices) {
       d.powerOn(); // dynamic polymorphism
   }
   ```

3. Demonstrate **method overloading** (static polymorphism) using `charge()`.

4. Demonstrate **interface usage**:

   * Call `Portable.info()`
   * Connect devices that are `Connectable`
   * Call `disconnect()` (default method)

5. Demonstrate **upcasting and downcasting**:

   ```java
   SmartDevice d = new Phone("OnePlus", 50);
   ((Phone)d).makeCall("01712345678");
   ```

6. Show **multiple inheritance via interfaces** (`Phone` implements two interfaces).

---

### 🧾 **Expected Output (Sample)**

```
--- Powering On Devices ---
Phone is starting up...
Laptop booting...
SmartWatch activated.

--- Charging Demo ---
Charging 20%...
Fast Charging 40%...

--- WiFi Connection ---
Connecting to WiFi network: HomeNetwork
Disconnected from network.

--- Portability Info ---
Portable devices are easy to carry.
Carrying phone around easily.

--- Dynamic Method Dispatch ---
Phone -> powerOn()
Laptop -> powerOn()
SmartWatch -> powerOn()

--- Downcasting Demo ---
Calling 01712345678...
```

---

### 🧠 **Concepts Covered**

| Concept                  | Where it Appears                                        |
| ------------------------ | ------------------------------------------------------- |
| Static polymorphism      | `charge()` overloading                                  |
| Dynamic polymorphism     | Overridden `powerOn()` calls                            |
| Abstract class           | `SmartDevice`                                           |
| Interfaces               | `Connectable`, `Portable`                               |
| Multiple inheritance     | `Phone implements Connectable, Portable`                |
| Default & static methods | `disconnect()`, `Portable.info()`                       |
| Upcasting & downcasting  | `SmartDevice d = new Phone(...); ((Phone)d).makeCall()` |

---

### 📊 **Evaluation Rubric**

| Area                                    | Weight | What I’ll Check                   |
| --------------------------------------- | ------ | --------------------------------- |
| Correct inheritance structure           | 15%    | Proper `extends` and `implements` |
| Abstract class usage                    | 10%    | Abstract + concrete mix           |
| Method overriding (runtime poly.)       | 15%    | Correct runtime behavior          |
| Method overloading (compile-time poly.) | 10%    | Proper `charge()` variants        |
| Interface implementation                | 15%    | Default/static methods included   |
| Multiple interface handling             | 10%    | `Phone` demonstrates this         |
| Upcasting & downcasting                 | 10%    | Shown safely                      |
| Clean code, naming, readability         | 15%    | Structure and clarity             |

---

When you’re ready, write and share your **complete Java code** for this “Smart Device Management System.”
Then I’ll:

* ✅ Analyze it line by line
* 🧠 Explain mistakes or improvements
* 📈 Give you a detailed evaluation and score
* ⚡ Tell you if you’re ready to move on to **Abstract Classes & Interface Integration (next chapter)**
