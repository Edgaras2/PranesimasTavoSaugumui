package lt.vilnius.saugus.saugusvilnius;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Disturbance resource not found")
public class ResourceNotFoundException extends RuntimeException {
}
