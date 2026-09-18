import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.dto.StudentDTO;
import com.dto.ValidatedStudentDTO;
public class Validator {
    public enCapsulatedValidatedResult validate(StudentDTO sdto){
         List<String> invalidReasons = new ArrayList<>();
         String branch = null;
        
         //branch
        try {
            branch = sdto.getBranch().trim();
            if(branch.length()==0){
                invalidReasons.add("INVALID_BRANCH");
            }
   
            if(!branch.isEmpty()){
               for(char c:branch.toCharArray()){
                   if(Character.isDigit(c)){
                       invalidReasons.add("INVALID_BRANCH");
                       break;
                   }
               }
            }
        } catch (Exception e) {
            invalidReasons.add("INVALID_BRANCH");
        }
        
        

         //cgpa
         Double cgpa = null;

        try{
           cgpa = Double.parseDouble(sdto.getCgpa().trim());
           if(cgpa>10.0||cgpa<1.0){
              invalidReasons.add("INVALID_CGPA");
           }
        }catch(Exception e){
            invalidReasons.add("INVALID_CGPA");
        }
        
        //gradyear
        Integer gradYear = null;
        try {
           gradYear = Integer.parseInt(sdto.getGradYear().trim());

           if(gradYear<2000||gradYear>2100){
              invalidReasons.add("INVALID_GRADUATION_YEAR");
           }
            
        } catch (Exception e) {
            invalidReasons.add("INVALID_GRADUATION_YEAR");
        }
        
        //active backlogs
        Integer activeBacklogs = null;
        try {
            activeBacklogs = Integer.parseInt(sdto.getActiveBacklogs().trim());

            if(activeBacklogs<0){
                invalidReasons.add("INVALID_BACKLOG_COUNT");
            }
        } catch (Exception e) {
            invalidReasons.add("INVALID_BACKLOG_COUNT");
        }


        //skills
        Set<String> seen = new HashSet<>();
        List<String> cleanSkills = new ArrayList<>();
        try {

            String[] skills = sdto.getSkills().split(",");

            for(String skill:skills){
                if(!skill.trim().isEmpty()&&seen.add(skill.trim().toLowerCase())){
                   cleanSkills.add(skill.trim().toLowerCase());
                }
            }

        } catch (Exception e) {
            invalidReasons.add("INVALID_SKILLS");
        }
        
        if(invalidReasons.isEmpty()){
            ValidatedStudentDTO vsdto = new ValidatedStudentDTO(branch, cgpa, gradYear, activeBacklogs, cleanSkills, seen);
            return new enCapsulatedValidatedResult(true, vsdto, null);
        }else{
            return new enCapsulatedValidatedResult(false, null, invalidReasons);
        }
    }

}
