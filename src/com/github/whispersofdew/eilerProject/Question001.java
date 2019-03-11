package com.github.whispersofdew.eilerProject;


//    Если выписать все натуральные числа меньше 10, кратные 3 или 5, то получим 3, 5, 6 и 9. Сумма этих чисел равна 23.
//
//    Найдите сумму всех чисел меньше 1000, кратных 3 или 5.

public class Question001 {

  public static void main(String[] args) {

    int tempInt = 0;

    for (int i = 0; i < 1000; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        tempInt = tempInt + i;
      }
    }

    System.out.println("Total sum is " + tempInt);
  }
}
