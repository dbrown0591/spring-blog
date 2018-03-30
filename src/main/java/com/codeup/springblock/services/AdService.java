package com.codeup.springblock.services;

import com.codeup.springblock.daos.AdRepository;
import com.codeup.springblock.models.Ad;
import org.springframework.stereotype.Service;


@Service
public class AdService {

    private AdRepository dao;

    public AdService(AdRepository dao) {
        this.dao = dao;
    }

    public Iterable<Ad> findAll() {
        return dao.findAll();
    }

    public void save(Ad ad) {
        dao.save(ad);
    }

    public Ad findOne(long id) {
        return dao.findOne(id);
    }
}
