package com.codeup.springblock.daos;

import com.codeup.springblock.models.Ad;
import org.springframework.data.repository.CrudRepository;

public interface AdRepository extends CrudRepository<Ad, Long> {
}
