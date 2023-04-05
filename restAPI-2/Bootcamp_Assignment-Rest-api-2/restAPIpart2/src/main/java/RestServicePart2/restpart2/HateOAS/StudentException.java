package RestServicePart2.restpart2.HateOAS;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)

public class StudentException extends RuntimeException{
        public StudentException(String s) {
            super(s);
        }
}
