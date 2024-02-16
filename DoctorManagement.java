/*Q4)Create arraylist of doctor(id,name,specility) and generate 
addDoctor(),displayDoctors(),updateDoctor() methods.*/

package Thursday_LAB_15_02_24;

import java.util.ArrayList;
import java.util.Scanner;


public class DoctorManagement 
{
    private ArrayList<Doctor> doctors;

    public DoctorManagement() 
    {
        doctors = new ArrayList<>();
    }

    public void addDoctor(int id, String name, String specialty) 
    {
        Doctor doctor = new Doctor(id, name, specialty);
        doctors.add(doctor);
    }

    public void displayDoctors() 
    {
        for (Doctor doctor : doctors) 
        {
            System.out.println(doctor);
        }
    }

    public void updateDoctor(int id, Scanner scanner) 
    {
        while (id < 1 || id > 7) 
        {
            System.out.println("Error: Only doctors with ID 1 to 7 can be updated.");
            System.out.println("Enter the ID of the doctor to update (1 to 7):");
            id = scanner.nextInt();
        }

        scanner.nextLine(); // Consume newline character
        System.out.println("Enter new name for the doctor:");
        String newName = scanner.nextLine();
        System.out.println("Enter new specialty for the doctor:");
        String newSpecialty = scanner.nextLine();

        for (Doctor doctor : doctors) 
        {
            if (doctor.getId() == id) 
            {
                doctor.setName(newName);
                doctor.setSpecialty(newSpecialty);
                System.out.println("Doctor with ID " + id + " updated successfully.");
                return;
            }
        }
        System.out.println("Error: Doctor with ID " + id + " not found.");
    }

    public static void main(String[] args) 
    {
        DoctorManagement management = new DoctorManagement();
        Scanner scanner = new Scanner(System.in);

        // Adding doctors
        management.addDoctor(1, "Dr. Sameer", 	"Cardiology");
        management.addDoctor(2, "Dr. Johnson", 	"Dermatology");
        management.addDoctor(3, "Dr. Rohit", 	"Neurology");
        management.addDoctor(4, "Dr. Sachin", 	"Endocrinologist");
        management.addDoctor(5, "Dr. Aakash", 	"Pediatrician");
        management.addDoctor(6, "Dr. Akshay", 	"Gynecologist");
        management.addDoctor(7, "Dr. Sandip", 	"Oncologist");


        // Displaying doctors
        System.out.println("Doctors before update:");
        management.displayDoctors();

        // Updating doctor
        System.out.println("Enter the ID of the doctor to update:");
        int idToUpdate = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        management.updateDoctor(idToUpdate, scanner);

        // Displaying doctors after update
        System.out.println("Doctors after update:");
        management.displayDoctors();
    }
}