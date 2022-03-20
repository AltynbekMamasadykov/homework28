package com.company;

import com.company.interfaces.UnaryOperator;

public class Main {

    public static void main(String[] args) {

        /*
        sqrt деген метод тузунуз.
        UnaryOperator деген интерфейстин реализациясын кайтаруусу керек
        Бир санды кабыл алып анын тамырдан чыккан жообун кайтарат(корень).

        public static UnaryOperator<Double> sqrt().
         */

        // First version without lambda

        UnaryOperator unaryOperator = new UnaryOperator() {

            @Override
            public double sqrt(int x) {
                return Math.sqrt(x);
            }
        };
        System.out.println(unaryOperator.sqrt(9));


        // Second version with lambda
        UnaryOperator unaryOperator2 = x -> Math.sqrt(x);
        UnaryOperator unaryOperator3 = Math::sqrt; //ushintip jazsa da bolot deyt intelijidea
        System.out.println(unaryOperator2.sqrt(25));
        System.out.println(unaryOperator3.sqrt(36));

    }
}
