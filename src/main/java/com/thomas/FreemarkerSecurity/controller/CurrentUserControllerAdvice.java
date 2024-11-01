package com.thomas.FreemarkerSecurity.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.security.core.GrantedAuthority;

import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class CurrentUserControllerAdvice {

    private static final Logger LOGGER = LoggerFactory.getLogger(CurrentUserControllerAdvice.class);

    @ModelAttribute("currentUsername")
    public String getCurrentUsername(Authentication authentication) {
        return (authentication == null) ? null : authentication.getName();
    }

    @ModelAttribute("isAuthenticated")
    public Boolean isAuthenticated(Authentication authentication) {
        return (authentication == null) ? null : authentication.isAuthenticated();
    }

    @ModelAttribute("currentRoles")
    public List<String> getCurrentUserRoles(Authentication authentication) {
        if (authentication == null) {
            return List.of(); // Return an empty list if no user is authenticated
        }
        return authentication.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.toList());
    }
}
