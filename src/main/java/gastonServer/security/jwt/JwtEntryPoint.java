
package gastonServer.security.jwt;

//Comprueba si el token si es válido, sino responde con un 401 NO AUTORIZADO

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component
public class JwtEntryPoint implements AuthenticationEntryPoint {

    private final static Logger logger = LoggerFactory.getLogger(JwtEntryPoint.class);
    
    @Override
    public void commence(HttpServletRequest req, HttpServletResponse res, AuthenticationException ae) throws IOException, ServletException {
        logger.error ("fail en el método commence");
        res.sendError(HttpServletResponse.SC_UNAUTHORIZED, "no autorizado");
    }
   
    
    
    
}
