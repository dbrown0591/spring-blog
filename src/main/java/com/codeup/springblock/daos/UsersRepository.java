package com.codeup.springblock.daos;


import com.codeup.springblock.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends CrudRepository<User, Long> {
    //    HQL
    User findByUsername(String username);
}
