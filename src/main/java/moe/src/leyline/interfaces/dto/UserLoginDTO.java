package moe.src.leyline.interfaces.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;

/**
 * Created by bytenoob on 6/18/16.
 */
@AllArgsConstructor public class UserLoginDTO implements Serializable {
    public Long id;
    public String username;
    public String password;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }
}