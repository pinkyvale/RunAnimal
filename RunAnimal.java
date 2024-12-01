package runanimal;

import java.util.Scanner;

public class RunAnimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (true) {
            System.out.print("Choose an animal. Press B for Bird, C for Cat, or D for Dog: ");
            input = scanner.nextLine();

            // Validate input to be a single character and match B, C, or D (case-insensitive)
            if (input.length() == 1 && (input.equalsIgnoreCase("B") || input.equalsIgnoreCase("C") || input.equalsIgnoreCase("D"))) {
                break;  // Exit the loop if valid input
            } else {
                System.out.println("Invalid input. Please enter a single character: B, C, or D.");
            }
        }

        // Convert input to lowercase for case-insensitive comparison
        char choice = input.toLowerCase().charAt(0);

        if (choice == 'b') {
            Bird bird = new Bird();
            bird.eat();
            bird.sleep();
            bird.makeSound();
        } else if (choice == 'c') {
            Cat cat = new Cat();
            cat.eat();
            cat.sleep();
            cat.makeSound();
        } else if (choice == 'd') {
            Dog dog = new Dog();
            dog.eat();
            dog.sleep();
            dog.makeSound();
        }

        scanner.close(); 
    }
}

abstract class Animal {
    public abstract void eat();
    public abstract void sleep();
    public abstract void makeSound();
}

class Bird extends Animal {
    
    public void eat() {
        System.out.print("Birds love to eat seeds and ");
    }

    public void sleep() {
        System.out.println("sleep for 10-12 hours a day.");
    }

    public void makeSound() {
        System.out.println("Tweet Tweet");
    }
}

class Cat extends Animal {
   
    public void eat() {
        System.out.print("Cats love to eat fish and ");
    }

    public void sleep() {
        System.out.println("sleep for 12-18 hours a day.");
    }

    public void makeSound() {
        System.out.println("Meow Meow");
    }
}

class Dog extends Animal {

    public void eat() {
        System.out.print("Dogs love to eat meat and ");
    }

    public void sleep() {
        System.out.println("sleep for 12-14 hours a day.");
    }

    public void makeSound() {
        System.out.println("Arf Arf");
    }
}