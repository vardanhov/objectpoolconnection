package com.egs.user.service;

public class CreateUserRequest {

    private final String email;

    private final String firstName;

    private final String lastName;

    public CreateUserRequest(final String email, final String firstName, final String lastName) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
