package org.example;

import java.util.Scanner;

//Static, dynamic, methods in class
//Learn language java

public class Main {
    public void text() {
        String[] words = {"Hi,", "my", "name", "is", "Mykola", "and", "it`s", "my", "first", "coding", "on", "Java!"};
        System.out.print("\n");
        for (String word : words) {
            System.out.print(word + " ");
        }
    }

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[10];
        int summ = 0;
        double prod = 1f;
        System.out.println("Enter 10 integer numbers: ");
        for (int i = 0; i <= 9; i++) {
            num[i] = scanner.nextInt();
            summ += num[i];
            prod *= num[i];
        }
        System.out.println("Your results: \n" + "Sum: " + summ + "\n" + "Difference: " + -(summ));
        System.out.println("Product: " + prod + "\n" + "Fraction: " + (1 / prod) + "\n");
        Main mainObject = new Main();
        mainObject.user();
        System.out.print("\n");
        mainObject.cars();
        System.out.print("\n");
        mainObject.text();
        System.out.print("\n");
        mainObject.revers(scanner.nextInt());
    }

    public void user() {
        int[] id = new int[10];
        int[] age = new int[10];
        String[] name = {"Oleg", "Mykola", "Vasyl", "Nazar", "Tatiana", "Nikita", "Christina", "Anna", "Elena", "Bohdan"};
        String[] surname = {"Tkachuk", "Savchenko", "Marchenko", "Rudenko", "Moroz", "Lysenko", "Petrenko", "Vasylenko", "Kharchenko", "Tyshchenko"};
        double[] weight = new double[10];
        double[] height = new double[10];

        for (int i = 0; i <= 9; i++) {
            id[i] = (int) (4000 + (Math.random() * 999));
            age[i] = (int) (20 + Math.random() * 5);
            weight[i] = 51 + (Math.random() * 20);
            height[i] = 170 + (Math.random() * 30);
        }

        User[] ourUsers = new User[10];
        int sumAge = 0;
        double sumWeight = 0f;
        double sumHeight = 0f;
        for (int i = 0; i <= 9; i++) {
            ourUsers[i] = new User();
            ourUsers[i].setId(id[i]);
            ourUsers[i].setAge(age[i]);
            ourUsers[i].setName(name[i]);
            ourUsers[i].setSurname(surname[i]);
            ourUsers[i].setWeight(weight[i]);
            ourUsers[i].setHeight(height[i]);
            sumAge += ourUsers[i].getAge();
            sumWeight += ourUsers[i].getWeight();
            sumHeight += ourUsers[i].getHeight();
        }
        System.out.print("Sum age: " + sumAge + "\nSum weight: " + sumWeight + "\nSum height: " + sumHeight);
    }

    public void cars() {
        String[] mark = {"Toyota", "Volkswagen", "Ford", "Chevrolet", "Honda", "Nissan", "BMW", "Mercedes-Benz", "Audi", "Hyundai"};
        int[] power = new int[10];
        int[] EngineCapacity = new int[10];
        double[] weightTon = new double[10];
        int[] speed = new int[10];
        String[] color = {"Red", "Blue", "Green", "Black", "White", "Silver", "Gray", "Yellow", "Orange", "Brown"};
        String[] availabilityAI = {"Yes", "Yes", "No", "Yes", "Yes", "No", "Yes", "Yes", "No", "No"};

        for (int i = 0; i <= 9; i++) {
            power[i] = (int) (4000 + Math.random() * 999);
            EngineCapacity[i] = (int) (10 + Math.random() * 5);
            weightTon[i] = 5 + (Math.random() * 7);
            speed[i] = (int) (150 + (Math.random() * 50));
        }

        Car[] ourCars = new Car[10];
        int sumPower = 0;
        int sumEngineCapacity = 0;
        for (int i = 0; i <= 9; i++) {
            ourCars[i] = new Car();
            ourCars[i].setMark(mark[i]);
            ourCars[i].setPower(power[i]);
            ourCars[i].setEngineCapacity(EngineCapacity[i]);
            ourCars[i].setWeightTon(weightTon[i]);
            ourCars[i].setSpeed(speed[i]);
            ourCars[i].setColor(color[i]);
            ourCars[i].setAvailabilityAI(availabilityAI[i]);
            sumPower += ourCars[i].getPower();
            sumEngineCapacity += ourCars[i].getEngineCapacity();
        }
        System.out.print("Sum power: " + sumPower + "\nSum Engine capacity: " + sumEngineCapacity);
    }

    public void revers(int n) {
        System.out.print("\n");
        int m = (n%10)*100 + n/100 + ((n/10)%10)*10;
        System.out.print(m);
    }
}