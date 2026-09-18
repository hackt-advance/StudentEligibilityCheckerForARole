import java.util.*;

import com.dto.StudentDTO;
public class Input {
    public StudentDTO takeInput(){
         Scanner sc = new Scanner(System.in);
         
         System.out.println("======================================");
         System.out.println("Welcome To Student Eligibility Checker");
         System.out.println("======================================");

         System.out.println("Press 1: to enter the new Candidate details to Check Eligibilty");


         System.out.println("Enter the Branch :");
         String branch = sc.nextLine();

         System.out.println("Enter the Cgpa :");
         String cgpa= sc.nextLine();

         System.out.println("Enter the Graduation Year :");
         String graduationYear = sc.nextLine();

        System.out.println("Enter the Active Backlogs :");
        String activeBacklogs = sc.nextLine();

        System.out.println("Enter the Skills (comma-separated, e.g. Git, Python, SQL) :");
        String skills = sc.nextLine();
        
        sc.close();
        return new StudentDTO(branch, cgpa, graduationYear, activeBacklogs, skills);

    }
}
