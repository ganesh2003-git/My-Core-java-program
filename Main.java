
//import java.util.Scanner;

public class University {
    String Uname;
    String Ulocation;
    //1Scanner scanner = new Scanner(System.in);

    public void getuniversityDetail() {
        System.out.println("Enter the University Name");
        Uname = sc.nextLine();

        System.out.println("Enter the University location");
        Ulocation = sc.nextLine();

        System.out.println("Entery is succesfully....");
    }

    public void DisplayUniDetail() {

        System.out.println("The University Name is" + Uname);
        System.out.println("The University Location" + Ulocation);
    }

}

//import java.util.Scanner;

public class Mmccclg extends University {
    long CCcode;
    String Cname;
    String Clocation;
   // Scanner scanner = new Scanner(System.in);

    public void  getclgdetails(){
        System.out.println("Enter the clg Code");
        CCcode = sc.nextLong();

        System.out.println("Enter the Name  Student");
        Cname = sc.nextLine();

        System.out.println("Enter the clg location");
        Clocation = sc.nextLine();
    }
    public  void Displayclgdetail(){
        System.out.println("Student code"+ CCcode);
        System.out.println("Student Name" + Cname);
        System.out.println("Clg loaction"+Clocation);
    }

}

//import java.util.Scanner;

public class Student extends Mmccclg {
    long  HTno;
    String Sname;
    String Course;

   // Scanner scanner = new Scanner(System.in);

    public void getstudentdetail(){
        System.out.println("Enter the hall Ticket number");
        HTno= sc.nextLong();

        System.out.println("Enter the student name");
        Sname=scanner.nextLine();
        

        System.out.println("Enter the course ");
        Course=sc.nextLine();
    }

    public void displaystudent(){
        System.out.println("Hall ticket number" + HTno);
        System.out.println("Student name"+ Sname);
        System.out.println("Course type "+ Course);

    }

    
}

//import java.util.Scanner;


public class Main extends Student {
    public static void main(String[] args) {
        Main obj = new Main();
        Scanner scanner = new Scanner(System.in);
		
        while (true) {

            System.out.println("1.unversity add ");
            System.out.println("2.unversity Display ");
            System.out.println("3. clg add");
            System.out.println("4. clg Display");
            System.out.println("5.Student add");
            System.out.println("6.Student Display");
            System.out.println("7.exit...");

            int option;
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    obj.getuniversityDetail();
                    break;
                case 2:
                    obj.DisplayUniDetail();
                    break;

                case 3:
                    obj.getclgdetails();
                    break;
                case 4:
                    obj.Displayclgdetail();
                    break;
                case 5:
                    obj.getstudentdetail();
                    break;
                case 6:
                    obj.displaystudent();
                    break;

                case 7:
                    obj.scanner.close();
                default:
                System.out.println("invalid data");
                    break;
            }
        }

    }
}
