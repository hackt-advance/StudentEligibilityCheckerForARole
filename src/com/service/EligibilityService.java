import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.dto.Role;
import com.dto.RoleResult;
import com.dto.StudentDTO;
import com.dto.ValidatedStudentDTO;

public class EligibilityService {

      private Validator validator;

      EligibilityService(){
          this.validator = new Validator();
      }

      public void eligibilityValidation(StudentDTO sdto,List<Role> dataRepo){
             enCapsulatedValidatedResult enValRes = validator.validate(sdto);
             ValidatedStudentDTO student = enValRes.getVsdto();
             int eligibleCount = 0;
         
             if(!enValRes.getSuccess()){
                 System.out.println("Please review following Field as You have Entered Them Wrongly");
                 for(String str:enValRes.getInvalidReasons()){
                      System.out.println(str);
                 }
                 return;
             }else{
                 //branch
                 List<RoleResult> evaluatedRes = new ArrayList<>();
             
                 for(Role role:dataRepo){
                     List<String> failures = new ArrayList<>();
                     //branch
                     boolean isValidBranch = false;
                     for(String branch:role.getAllowedBranches()){
                         if(student.getBranch().equalsIgnoreCase(branch)){
                            isValidBranch =  true;
                            break;
                         }
                     }
 
                     if(!isValidBranch){
                         failures.add("BRANCH_NOT_ALLOWED");
                     }
 
 
                     //cgpa below minimum
                     Double minCgpa = role.getMinCgpa();
                     if(student.getCgpa()<minCgpa){
                         failures.add("CGPA_BELOW_MINIMUM");
                     }
 
                     //grad year check
                     boolean isValidGradYear = false;
                     for(int gradYear:role.getAllowedGradYear()){
                           if(student.getGradYear()==gradYear){
                              isValidGradYear = true;
                              break;
                           }
                     }
 
                     if(!isValidGradYear){
                         failures.add("GRADUATION_YEAR_NOT_ALLOWED");
                     }
 
 
                     //max backlogs
                     int maxBacklogs = role.getMaxBacklogs();
                     if(student.getActiveBacklogs()>maxBacklogs){
                         failures.add("TOO_MANY_ACTIVE_BACKLOGS");
                     }
 
                     //skills pe iterate karo
                     List<String> missingSkills = new ArrayList<>();
                     for(String skill:role.getRequiredSkills()){
                          if(!student.getNormalizedSkillsSet().contains(skill.toLowerCase().trim())){
                              missingSkills.add(skill);
                          }
                     }
 
                     Collections.sort(missingSkills,String.CASE_INSENSITIVE_ORDER);
                     for(String mskill:missingSkills){
                         failures.add("MISSING_SKILL: "+mskill);
                     }
                     
                        boolean isEligible = failures.isEmpty()?true:false;
 
                        if(isEligible){
                          eligibleCount++;
                        }
 
                        evaluatedRes.add(new RoleResult(role,isEligible,failures));
                 }
 
                 //now applying the sorting
                 Collections.sort(evaluatedRes, (r1, r2) -> {
                     // 1. Status Check: Agar dono ka status alag hai
                     if (r1.isEligible() != r2.isEligible()) {
                         return r1.isEligible() ? -1 : 1; // jo eligible hai woh pehle aayega (-1)
                     }
                 
                     // 2. Title Check: Agar status SAME hai, toh Title A-to-Z
                     int titleCompare = r1.getRole().getRlTitle().compareToIgnoreCase(r2.getRole().getRlTitle());
                     if (titleCompare != 0) {
                         return titleCompare;
                     }
                 
                     // 3. ID Check: Agar Title bhi same hai, toh Role ID
                     return r1.getRole().getRlId().compareTo(r2.getRole().getRlId());
                 });
                 
                 // sun.security.toolsstudent.toString();
 
                 System.out.println("\nELIGIBLE : " + eligibleCount + " || INELIGIBLE : " + (dataRepo.size() - eligibleCount));
                 System.out.println("--------------------------------------------------");
                 for (RoleResult res : evaluatedRes) {
                     String status = res.isEligible() ? "[ELIGIBLE]" : "[INELIGIBLE]";
                     System.out.println(res.getRole().getRlId() + " - " + res.getRole().getRlTitle() + " " + status);
                     if (!res.isEligible()) {
                         System.out.println("   Failed Reasons: " + String.join(", ", res.getFailures()));
                     }
                 }
                 System.out.println("--------------------------------------------------");
  
 
 
             }
       }
}
