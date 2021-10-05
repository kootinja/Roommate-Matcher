package com.roommatematcher.enterprise.dao;

import com.roommatematcher.enterprise.dto.Profile;

import java.util.ArrayList;

public class ProfileDAOStub implements IProfileDAO {
    @Override
    public Profile save(Profile profile) throws Exception {
        return null;
    }

    @Override
    public ArrayList<Profile> fetchAll() {
        ArrayList<Profile> desiredProfiles = new ArrayList<>();
        Profile profile = new Profile();
        desiredProfiles.add(profile);
        return desiredProfiles;
    }


    @Override
    public Profile fetch(int id) {
        return null;
    }
}
