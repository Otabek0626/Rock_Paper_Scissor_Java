package com.example.oopswithjava;
import java.util.Scanner;
import java.util.Random;

public class OOPsWithJava {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.flush();
        System.out.println("#####################################\n#########    Hello player   #########\n######  It is a game for you   ######\n##  I hope you will enjoy with it  ##\n######  Lets start playing    #######\n#########     Good luck     #########\n#####################################");
        System.out.print("\nHow many round do you want?... ");
        int rounds = input.nextInt();
        int p_score = 0, c_score = 0;
        for(int i = 1; i <= rounds; i++){
            System.out.flush();
            int p_choice, c_choice;
            System.out.print("\n#####   " + i + "-Round   #####\n");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissor");
            p_choice = input.nextInt();
            Random rand = new Random(); 
            c_choice = 1 + rand.nextInt(2);
            System.out.flush();

            if(c_choice == p_choice){
                System.out.println("******************\n*****  Draw  *****\n******************");
                c_score++;
                p_score++;
                }
            else if((p_choice == 1 && c_choice == 3) || (p_choice == 2 && c_choice == 1) || (p_choice == 3 && c_choice == 2)){
                System.out.println("*********************\n*****  You win  *****\n*********************");
                p_score++;
                }
            else{
                System.out.println("**********************\n*****  You lose  *****\n**********************");
                c_score++;
                }
            System.out.print("\nENTER any number to continue..... ");
            int a = input.nextInt();
            
        }
        System.out.flush();
        System.out.println("####   Player score = " + p_score + "     ####");
        System.out.println("####   computer score = " + c_score + "   ####\n");
        if(p_score > c_score){
            System.out.println("*********************\n*****  You win  *****\n*********************");
        }else if(p_score < c_score){
            System.out.println("**********************\n*****  You lose  *****\n**********************");
        }else{
            System.out.println("******************\n*****  Draw  *****\n******************");
        }
        }
    }
