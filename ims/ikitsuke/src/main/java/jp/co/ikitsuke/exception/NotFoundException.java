package jp.co.ikitsuke.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {

    private static final Logger logger = LoggerFactory.getLogger(NotFoundException.class);

    private static final long serialVersionUID = 1L;

    public NotFoundException(String message) {
        super(message);
        if (logger.isErrorEnabled()) {
            logger.error(message);
        }
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
        if (logger.isErrorEnabled()) {
            logger.error(message);
        }
    }

}
