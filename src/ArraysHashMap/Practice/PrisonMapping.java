package ArraysHashMap.Practice;

import java.util.Scanner;

public class PrisonMapping {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cellNum = s.nextInt();
        int cell1 = 1,cell2=2,cell3=3,cell4=7;
        boolean flag  = false;
        for(int i = 1;i<=18;i++){
            if(cell1 == cellNum){
                flag = true;
                System.out.println("Valid");
                System.out.println("A Block");
                break;
            }
            if(i% 2 != 0 ){
                cell1 += 3;
            }
            else
                cell1+=5;
        }
        for(int i = 1;i<=18;i++){
            if(cell2 == cellNum){
                flag = true;
                System.out.println("Valid");
                System.out.println("B Block");
                break;
            }
            if(i% 2 != 0 ){
                cell2 += 3;
            }
            else
                cell2+=5;
        }
        for(int i = 1;i<=18;i++){
            if(cell3 == cellNum){
                flag = true;
                System.out.println("Valid");
                System.out.println("C Block");
                break;
            }
            if(i% 2 != 0 ){
                cell3 += 3;
            }
            else
                cell3+=5;
        }
        for(int i = 1;i<=18;i++){
            if(i% 2 != 0 ){
                if(cell4 == cellNum){
                    flag = true;
                    System.out.println("Valid");
                    System.out.println("D Block");
                    break;
                }
                cell4 += 1;
            }
            else{
                if(cell4 == cellNum){
                    flag = true;
                    System.out.println("Valid");
                    System.out.println("E Block");
                    break;
                }
                cell4+=7;
            }
        }
        if(!flag)
            System.out.println("Invalid");

    }
}
