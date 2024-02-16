/*2.   A class teacher has decided to split her entire class into four groups, 
namely Sapphire, Perl, Ruby, and Emerald for sports competitions. 
For dividing the students into these four groups, she has followed the pattern given below:
Sapphire - 1, 5, 9, 13, 17, 21, ...
Perl - 2, 6, 10, 14, 18, 22, ...
Ruby - 3, 7, 11, 15, 19, 23, ...
Emerald - 4, 8, 12, 16, 20, 24, ...
All the students are represented by their roll numbers. 
Based on the above pattern, given the roll number as input, 
print the group the student belongs to. Note that the roll number can be any
positive integer and not necessarily less than 25.
*/



package Thursday_LAB_15_02_24;

import java.util.Scanner;

public class Practical2 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the roll number of the student: ");
        int rollNumber = scanner.nextInt();
        scanner.close();

        // Calculate the remainder when roll number is divided by 4
        int group = (rollNumber - 1) % 4;

        // Determine the group based on the remainder
        String groupName;
        switch (group) {
            case 0:
                groupName = "Sapphire";
                break;
            case 1:
                groupName = "Perl";
                break;
            case 2:
                groupName = "Ruby";
                break;
            case 3:
                groupName = "Emerald";
                break;
            default:
                groupName = "Unknown"; // This should not occur
        }

        System.out.println("The student with roll number " + rollNumber + " belongs to the group: " + groupName);
    }
}
