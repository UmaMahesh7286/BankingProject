package com.urbank.userservice.utils;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import com.urbank.userservice.entity.UserDetailsImpl;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtils {
	@Value("${aj.app.jwtSecret}")
	private String jwtSecret;
	@Value("${aj.app.jwtExpTimeInMs}")
	private int jwtExpTimeInMs;

	public String generateToken(Authentication authentication) {
		UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
		return Jwts.builder().setSubject(userDetails.getUsername()).setIssuedAt(new Date())

				.setExpiration(new Date(System.currentTimeMillis() + jwtExpTimeInMs))
				.signWith(SignatureAlgorithm.HS256, jwtSecret).compact();
	}

	public String getUsernameFromJwtToken(String token) {
		return Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token).getBody().getSubject();
	}

	public boolean validateToken(String token) {
		try {
			Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}