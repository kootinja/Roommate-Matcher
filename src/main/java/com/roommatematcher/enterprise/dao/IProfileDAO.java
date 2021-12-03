package com.roommatematcher.enterprise.dao;

import com.roommatematcher.enterprise.dto.Profile;

import java.io.IOException;
import java.util.List;

public interface IProfileDAO {
    /**
     * Returns a list of profiles to be used in a profile autocomplete search function
     */
    List<Profile> fetchProfile(String filterQuery) throws IOException;

    Profile save(Profile profile) throws Exception;
}
