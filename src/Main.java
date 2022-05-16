import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Staff newStaff = new Staff();
        newStaff.Initialize1();
        newStaff.print1();
    }
}
    class Person {
        Scanner sr = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String FirstName, Surname, Street, City;
        int ZipCode;

        void Initialize() throws IOException {
            System.out.println("Please enter your First Name : ");
            FirstName = br.readLine();
            System.out.println("Please enter your Surname: ");
            Surname = br.readLine();
            System.out.println("Please enter your Street name: ");
            Street = br.readLine();
            System.out.println("PLease enter your City: ");
            City = br.readLine();
            System.out.println("Please enter your zipCode: ");
            ZipCode = Integer.parseInt(br.readLine());
        }

        void PrintData() {
            System.out.println("First Name: " + FirstName);
            System.out.println("Surname: " + Surname);
            System.out.println("Street: " + Street);
            System.out.println("city: " + City);
            System.out.println("Zipcode: " + ZipCode);
        }
    }

    class Staff extends Person {
        String Education, Position, EducationZholchuev56857, Position56857;

        void Initialize1() throws IOException {
            Initialize();
            System.out.println("Please enter your Education");
            Education = sr.nextLine();
            System.out.println("Please enter your Position");
            Position = sr.nextLine();

        }
        void print1(){
            PrintData();
            System.out.println("Education: " + Education );
            System.out.println("Position: " + Position);
        }

    }


