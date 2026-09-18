import com.database.DataRepositry;
import com.dto.StudentDTO;

public class main {
    public static void main(String[] args) {
        Input ip = new Input();
        StudentDTO sdto = ip.takeInput();
        
        EligibilityService es = new EligibilityService();
        DataRepositry drepo = new DataRepositry();
        es.eligibilityValidation(sdto,drepo.getExtendedRepo());
    }
}
