import java.util.List;

import com.dto.ValidatedStudentDTO;

public class enCapsulatedValidatedResult {
    private boolean success;
    private ValidatedStudentDTO vsdto;
    private List<String> invalidReasons;
    public List<String> getInvalidReasons() {
        return invalidReasons;
    }
    public void setInvalidReasons(List<String> invalidReasons) {
        this.invalidReasons = invalidReasons;
    }
    public boolean getSuccess() {
        return success;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }
    public ValidatedStudentDTO getVsdto() {
        return vsdto;
    }
    public void setVsdto(ValidatedStudentDTO vsdto) {
        this.vsdto = vsdto;
    }
    public enCapsulatedValidatedResult(boolean success, ValidatedStudentDTO vsdto,List<String> invalidReasons) {
        this.success = success;
        this.vsdto = vsdto;
        this.invalidReasons = invalidReasons;
    }
   
    public static enCapsulatedValidatedResult Success(ValidatedStudentDTO vsdto){
         return new enCapsulatedValidatedResult(true, vsdto,null);
    }

    public static enCapsulatedValidatedResult Failure(List<String> invalidReasons){
        return new enCapsulatedValidatedResult(false, null,invalidReasons);
    }

}
