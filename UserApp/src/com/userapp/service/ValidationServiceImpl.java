package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;

public class ValidationServiceImpl implements ValidationService {
    @Override
    public boolean validatePassword(String password) throws TooLongException, TooLongException {
       String[] password1 ={"squid", "arya", "voya"};
        for (String name:password1
             ) {
            if (name.equals(password)){

            }

        }
        return false;
    }

    @Override
    public boolean validateUsername(String username) throws NameExistsException {
        String[] username1 ={"java", "html", "sql", "css"};
        for (String name:username1
             ) {
            if (name.equals(username)){
                throw  new NameExistsException();
            }

        }


        return false;
    }
}
