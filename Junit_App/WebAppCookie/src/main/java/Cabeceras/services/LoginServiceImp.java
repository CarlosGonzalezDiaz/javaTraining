package Cabeceras.services;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;

import java.util.Arrays;
import java.util.Optional;

public class LoginServiceImp implements LoginService{

    @Override
    public Optional<String> getUsername(HttpServletRequest req) {
        Cookie[] cookies = req.getCookies()!= null ? req.getCookies() : new Cookie[0];
        Optional<String> cookieOptional = Arrays.stream(cookies).filter(cookie -> "username".equals(cookie.getName()))
                .map(Cookie::getValue)
                .findAny();
        return cookieOptional;
    }
}
