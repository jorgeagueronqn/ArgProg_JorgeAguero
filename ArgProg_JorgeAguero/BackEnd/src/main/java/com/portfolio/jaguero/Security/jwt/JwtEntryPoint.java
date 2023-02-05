package com.portfolio.jaguero.Security.jwt;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;

import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jorge
 */
@Component
public class JwtEntryPoint implements AuthenticationEntryPoint {

    private final static org.slf4j.Logger logger = LoggerFactory.getLogger(JwtEntryPoint.class);

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
      logger.error("fallo el metodo commence");
      response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
    }

}
