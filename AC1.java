import java.io.*;
import java.util.*;

/**
 * Write a description of class Main here.
 *
 * @author Lo
 * @version 12-1-2020s
 */
public class AC1
{
    static ArrayList<String> lines = new ArrayList<String>();

    public static void main(String[] args)
    {

        //Try and read in the numbers from input.txt
        try {
            Scanner input = new Scanner(new File("AC1_input.txt"));
            while(input.hasNextLine()){
                lines.add(input.nextLine());
            }
            input.close();
        }
        catch(Exception e){
            System.out.println("Error reading or parsing input");
        }

        System.out.println("Part 1 Answer: " + part1());

        System.out.println("Part 2 Answer: " + part2());

    }

    public static int part1(){
        String total= "";
        int sum = 0;
        for(int i = 0; i < lines.size(); i++){
            for(int j = 0; j < lines.get(i).length(); j++){
                String curr = lines.get(i).substring(j, j+1);
                switch(curr){
                    case "1":
                        total += 1;
                        j = lines.get(i).length();
                        break;
                    case "2":
                        total += 2;
                        j = lines.get(i).length();
                        break;
                    case "3":
                        total += 3;
                        j = lines.get(i).length();
                        break;
                    case "4":
                        total += 4;
                        j = lines.get(i).length();
                        break;
                    case "5":
                        total += 5;
                        j = lines.get(i).length();
                        break;
                    case "6":
                        total += 6;
                        j = lines.get(i).length();
                        break;
                    case "7":
                        total += 7;
                        j = lines.get(i).length();
                        break;
                    case "8":
                        total += 8;
                        j = lines.get(i).length();
                        break;
                    case "9":
                        total += 9;
                        j = lines.get(i).length();
                        break;
                    case "0":
                        break;
                }
            }

            for(int j = lines.get(i).length() - 1; j >= 0; j--){
                String curr = lines.get(i).substring(j, j+1);
                switch(curr){
                    case "1":
                        total += 1;
                        j = -1;
                        break;
                    case "2":
                        total += 2;
                        j = -1;
                        break;
                    case "3":
                        total += 3;
                        j = -1;
                        break;
                    case "4":
                        total += 4;
                        j = -1;
                        break;
                    case "5":
                        total += 5;
                        j = -1;
                        break;
                    case "6":
                        total += 6;
                        j = -1;
                        break;
                    case "7":
                        total += 7;
                        j = -1;
                        break;
                    case "8":
                        total += 8;
                        j = -1;
                        break;
                    case "9":
                        total += 9;
                        j = -1;
                        break;
                    case "0":
                        break;
                }
            }

            sum+= Integer.parseInt(total);
            System.out.println("total: " + total + " sum: " + sum);
            total = "";



            
        }

        return sum;
    }

    public static int part2(){
        

        return -1;
    }
}
