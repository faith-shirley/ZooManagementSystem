/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.zoo;

/**
 *
 * @author faith
 */
public class Zoo {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.makeSound();
        lion.eat();

        Elephant elephant = new Elephant();
        elephant.makeSound();
        elephant.eat();

        Monkey monkey = new Monkey();
        monkey.makeSound();
        monkey.eat();
    }
}
