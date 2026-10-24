package com.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);

            Socket s = new Socket("127.0.0.1", 8080);

            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);

            System.out.println("Scrivi il primo numero (si ricorda di usare il punto: ");
            Double numero1 = input.nextDouble();

            System.out.println("Scrivi l'operatore (si ricorda di usare il punto: ");
            String operatore = input.nextLine();

            System.out.println("Scrivi il secondo numero (si ricorda di usare il punto: ");
            Double numero2 = input.nextDouble();

            out.println(numero1);
            out.println(numero2);
            out.println(operatore);

            String risposta = in.readLine();
            System.out.println(risposta);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}