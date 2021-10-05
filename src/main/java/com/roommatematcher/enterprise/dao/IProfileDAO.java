package com.roommatematcher.enterprise.dao;

import com.roommatematcher.enterprise.dto.Profile;

import java.util.ArrayList;
import java.util.List;

public interface IProfileDAO {
    Profile save(Profile profile) throws Exception;

    ArrayList<Profile> fetchAll();

    Profile fetch(int id);
}
