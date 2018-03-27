package com.codeup.springblock.services;

import com.codeup.springblock.daos.UsersRepository;
import com.codeup.springblock.models.UserWithRoles;
import org.apache.tomcat.jni.User;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsLoader  implements UserDetailsService{
    private final UsersRepository users;

    public UserDetailsLoader(UsersRepository users) {
        this.users = users;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = users.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("No user found for " + username);
        }

        return new UserWithRoles(user);
    }
}
