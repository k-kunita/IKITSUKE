package jp.co.ikitsuke.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN)
public class ForbiddenException extends RuntimeException {

    private static final Logger logger = LoggerFactory.getLogger(ForbiddenException.class);

    private static final long serialVersionUID = 1L;

    public ForbiddenException(String message) {
        super(message);
        if (logger.isErrorEnabled()) {
            logger.error(message);
        }
    }

    public ForbiddenException(String message, Throwable cause) {
        super(message, cause);
        if (logger.isErrorEnabled()) {
            logger.error(message);
        }
    }

}
