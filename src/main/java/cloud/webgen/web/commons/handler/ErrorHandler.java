package cloud.webgen.web.commons.handler;

import cloud.webgen.web.commons.exceptions.HttpException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Map;

/**
 * Clase de manejo de excepciones global para manejar instancias de HttpException en toda la aplicación.
 *
 * @author Camilo Muñoz
 * @see HttpException
 * @see ExceptionHandler
 * @see ControllerAdvice
 * @since 1.0-SNAPSHOT
 */
@ControllerAdvice
public class ErrorHandler {

    /**
     * Maneja las excepciones del tipo HttpException y genera una respuesta con información detallada.
     *
     * @param ex Excepción de tipo HttpException.
     * @return ResponseEntity con un mapa que contiene el mensaje de error y el código de estado.
     * @since 1.0
     */
    @ExceptionHandler({HttpException.class})
    public ResponseEntity<HttpException> handleException(HttpException ex) {
        return new ResponseEntity<>(ex, ex.getHttpCode());
    }
}
