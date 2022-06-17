package com.targettheaim.rest.webservices.restfulwebservices.jwt.resource;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {
  
  private static final long serialVersionUID = -5616176897013108345L;

  private String username;
    private String password;
//    {
//        "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0YXJnZXR0aGVhaW0iLCJleHAiOjE2NTUyODg1MTEsImlhdCI6MTY1NDY4MzcxMX0.r0ksu2mAiaFSU1s3gDzBLUPI3qdsUGLfEQTt5BEl1TugRRkvYM8p4l7OIx2BxRvlRaJOz9ellUKIG0dRbmAiLA"
//    }

    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

