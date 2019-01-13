package com.fmpnazareth.expensemagement.security.jwt;

import java.io.Serializable;

public class JwtAuthenticationRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	private String codUser;
    private String password;

    public JwtAuthenticationRequest() {
        super();
    }

    public JwtAuthenticationRequest(String email, String password) {
        this.setCodUser(email);
        this.setPassword(password);
    }

    public String getCodUser() {
        return codUser;
    }

    public void setCodUser(String codUser) {
        this.codUser = codUser;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
