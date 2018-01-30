package com.gmail.artemhaevsky;


public class Main {


    public static void main(String[] args) {
        Vector3d vctr1 = new Vector3d(5, 6, 7);
        Vector3d vctr2 = new Vector3d(6, 5, 4);
                int sum1 = vctr1.x + vctr2.x;
                int sum2 = vctr1.y + vctr2.y;
                int sum3 = vctr1.z + vctr2.z;
                System.out.println("сложение веторов" + "( " + sum1 + " " + sum2 + " " + sum3 + " )");

            int scalarX = vctr1.x*vctr2.x;
            int scalarY = vctr1.y*vctr2.y;
            int scalarZ = vctr1.z*vctr2.z;
            int sumScalar = scalarX+scalarY+scalarZ;
            System.out.println("Скалярное произведение векторов " + sumScalar);

         int vecPro1 = (vctr1.y*vctr2.z-vctr1.z*vctr2.y);
         int vecPro2 = (vctr1.z*vctr2.x-vctr1.x*vctr2.z);
         int vecPro3 = (vctr1.x*vctr2.y-vctr1.y*vctr2.x);
         System.out.println("Векторное произведение (" + vecPro1+", " + vecPro2 + ", " + vecPro3 + " )");


    }


        }










