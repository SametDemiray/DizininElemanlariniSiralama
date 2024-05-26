package org.example;

// Klavyeden girilen N elemanlı A dizisini küçükten büyüğe doğru "Seçme Sıralama (selection sort)" algoritmasıyla sıralayan program

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i,j,N,g;

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nLütfen Dizinin Elelman Sayısını Giriniz : ");
        N = scanner.nextInt();
        System.out.println(" ");
        int[] A = new int[N];

        for (i=0; i<N; i++){
            System.out.print("A("+i+")=");
            A[i] = scanner.nextInt();
        }

        for (i=0; i<N-1; i++){
            for (j=i+1; j<N; j++)
                if (A[j] < A[i]){
                    g = A[i];
                    A[i] = A[j];
                    A[j] = g;
                }
        }

        System.out.println("\nSıralı Dizi : ");
        System.out.println("------------- ");

        for (i=0; i<N; i++)
            System.out.println("A("+i+")="+A[i]);
    }
}