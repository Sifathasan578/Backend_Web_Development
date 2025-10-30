Perfect, Sifat ✅
I’ve read your new PDF — it covers **Encapsulation, Access Modifiers, and Immutability**, including:

* Encapsulation principles (data hiding, getters/setters)
* Access modifiers (`private`, `default`, `protected`, `public`)
* Immutable classes (`final`, private final fields, no setters)

Now, here’s a **focused coding test** (practice + evaluation) that will check your *true understanding* of this module before you move to the next topic (Inheritance/Polymorphism).

---

## 🧠 **Encapsulation & Access Control — Practice Test**

### 🧩 Part A: Core Encapsulation

**1️⃣ Problem — Basic Encapsulation**
Create a class `Account` with private fields:

* `accountNumber` (String)
* `balance` (double)

👉 Add:

* A **getter** for `accountNumber`
* A **getter and setter** for `balance` (but only allow updating balance if amount > 0)
* A method `displayInfo()` to show account number and balance.

In `main()`, create an object, set valid and invalid balances, and show output.

---

**2️⃣ Problem — Validation through Setters**
Create a class `Product` with private fields: `name`, `price`.

* Only allow `price` to be set if it’s greater than 0.
* If a wrong price is set, print “Invalid price”.
* Add a `display()` method to show product details.

---

### 🧩 Part B: Access Modifiers

**3️⃣ Problem — Access Levels Practice**
Create **two packages**:

* `packageA` → contains class `Person` with:

  * `private String name`
  * `protected int age`
  * `public void display()`
* `packageB` → contains class `Test` that tries to:

  * Access `name`, `age`, and call `display()` using an object of `Person`.

👉 Observe and explain which members are accessible and why.

---

### 🧩 Part C: Immutability

**4️⃣ Problem — Immutable Class**
Create an immutable class `Student`:

* Fields: `private final String name`, `private final int id`
* Initialize through constructor only.
* No setters.
* Only getters.
* Mark the class `final`.

In `main()`, create a `Student` object and show that values can’t be changed after creation.

---

**5️⃣ Problem — Breaking Immutability**
Create:

* A base class `ImmutablePerson` (not `final`), similar to above.
* A subclass `MutablePerson` that adds a `setName()` method and overrides `getName()`.

👉 Demonstrate in `main()` how immutability gets broken when subclassing is allowed.

---

### 🧩 Bonus Challenge (Optional)

**6️⃣ Problem — Combine All Concepts**
Create a class `BankCustomer` that is:

* Encapsulated (private fields, getters/setters with validation)
* Contains a `final` immutable class `Address` inside it
* Demonstrates use of `this` and `private` fields

---

Once you complete these and send me your solutions, I’ll:

* ✅ Evaluate correctness & syntax
* 💬 Point out improvements
* 🧭 Tell you if you’re ready to move to **Inheritance & Polymorphism**

---

Would you like me to include **1–2 debugging questions** (with code that has access modifier or encapsulation mistakes for you to fix)?

################################################# 
Answers: 

#1: 

package com.imrul.hasan.sifat;

public class Main {
    public static void main(String[] args) {
       
        Account account = new Account();
        account.setBalance(-1);
        account.setBalance(10);

        System.out.println(account.getBalance());
    }
}

package com.imrul.hasan.sifat;

public class Account {
    private String accountNumber;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance > 0) {
            this.balance = balance;
        }
    }

    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

#2: 

package com.imrul.hasan.sifat;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        
        product.setPrice(10);
        product.setPrice(-10);
        product.display();
    }
}

package com.imrul.hasan.sifat;

public class Product {
    private String name;
    private double price;

	// Ekta constructor add korle valo

    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        }
        else {
            System.out.println("Invalid Price!");
        }
    }

    public void display() {
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
    }
}


#3: 

package packageA;

public class Person {
    private String name;
    protected int age;

    public void display() {
        System.out.println("Display()");
    }
}

package packageB;

import packageA.Person;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
//        System.out.println(person.name); //
//        System.out.println(person.age); //

        System.out.println("age is not accessible here because Test is in a different package and not a subclass\nname is not accessible as it is private");
        System.out.println("name is not accessible as it is protected and Test is in different package");

        person.display();
    }
}

#4:

package com.imrul.hasan.sifat;

public class Main {
    public static void main(String[] args) {
        /*BankAccount bankAccount = new BankAccount("A123");
        System.out.println(bankAccount.getAccountNumber() + " has " + bankAccount.getBalance() + " taka");

        bankAccount.deposit(500);
        System.out.println(bankAccount.getAccountNumber() + " has " + bankAccount.getBalance() + " taka");

        bankAccount.deposit(-100); // will not execute for validation
        System.out.println(bankAccount.getAccountNumber() + " has " + bankAccount.getBalance() + " taka");*/
        /*Student student = new Student("Sifat", 1, 26);
        System.out.println(student.getName());

//        student = new ImmutableStudent("Arafat", 2, 25);
//        System.out.println(student.getName()); // change kora jaitece because of not final in class*/

        /*Account account = new Account();
        account.setBalance(-1);
        account.setBalance(10);

        System.out.println(account.getBalance());*/

        NewStudent newStudent = new NewStudent("Sifat", 1);
        System.out.println("ID: " + newStudent.getId() + ", Name: " + newStudent.getName());

//        newStudent.name = "arafat"; // not changeable
    }
}
// Not sure how to show whether it is changeable or not! 

package com.imrul.hasan.sifat;

public final class NewStudent {
    private final String name;
    private final int id;

    public NewStudent(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

#5: 

package com.imrul.hasan.sifat;

public class Main {
    public static void main(String[] args) {
       

        ImmutablePerson immutablePerson = new ImmutablePerson(); 
        immutablePerson.name = "Sifat"; 
        System.out.println(immutablePerson.name); 

        MutablePerson mutablePerson = new MutablePerson(); 
        mutablePerson.setName("Arafat"); 
        System.out.println(mutablePerson.getName()); // name changed to arafat because of overriding.
    }
}
// I am not sure how to show that subclass can destroy immutability! 

package com.imrul.hasan.sifat;

public class ImmutablePerson {
    public String name;

/*    public ImmutablePerson(String name) {
        this.name = name;
    }*/

    public String getName() {
        return name;
    }
}

package com.imrul.hasan.sifat;

public class MutablePerson extends ImmutablePerson {
    /*public MutablePerson(String name) {
        super(name);
    }*/

    public void setName(String name) {
        super.name = name;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}

Corrected: 

package com.imrul.hasan.sifat;

public class Main {
    public static void main(String[] args) {
        

        ImmutablePerson person = new MutablePerson("Sifat");
        System.out.println(person.getName());

        ((MutablePerson) person).setName("Arafat");
        System.out.println(person.getName());
    }
}

package com.imrul.hasan.sifat;

public class ImmutablePerson {
    private final String name;

    public ImmutablePerson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

package com.imrul.hasan.sifat;

public class MutablePerson extends ImmutablePerson {
    private String newName;

    public MutablePerson(String name) {
        super(name);
    }

    public void setName(String name) {
        this.newName = name;
    }

    @Override
    public String getName() {
        return newName;
    }
}


#6: 

package com.imrul.hasan.sifat;

public class Main {
    public static void main(String[] args) {
        

        BankCustomer bankCustomer = new BankCustomer(1, "Sifat");
        System.out.println(bankCustomer.getAccountId() + " " + bankCustomer.getAccountName());
    }
}

package com.imrul.hasan.sifat;

public final class BankCustomer {
    private final int accountId;
    private final String accountName;

    public BankCustomer(int accountId, String accountName) {
        this.accountId = accountId;
        this.accountName = accountName;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    // This is new for me class inside class:
    public final class Address {

    }
}

Correction: 

package com.imrul.hasan.sifat;

public class Main {
    public static void main(String[] args) {
        ImmutablePerson person = new MutablePerson("Sifat");
        System.out.println(person.getName());

        ((MutablePerson) person).setName("Arafat");
        System.out.println(person.getName());
    }
}

package com.imrul.hasan.sifat;

public final class BankCustomer {
    private final int accountId;
    private final String accountName;
    private final Address address;

    public BankCustomer(int accountId, String accountName, Address address) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.address = address;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    // This is new for me class inside class:
    public final class Address {
        private final String city;
        private final String country;

        public Address(String city, String country) {
            this.city = city;
            this.country = country;
        }

        public String getCity() { return city; }
        public String getCountry() { return country; }
    }
}




















