package com.roommatematcher.enterprise.dao;

import com.roommatematcher.enterprise.dto.Profile;
import org.springframework.stereotype.Repository;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

@Repository
public class ProfileDAO implements IProfileDAO{

    HashMap<Integer, Profile> allProfiles = new HashMap<>();

    @Override
    public List<Profile> fetchProfile(String filterQuery) throws IOException {
        Retrofit retrofitInstance = RetrofitClientInstance.getRetrofitInstance();
        IProfileRetrofitDAO profileRetrofitDAO = retrofitInstance.create(IProfileRetrofitDAO.class);
        Call<List<Profile>> allProfiles = profileRetrofitDAO.getProfiles(filterQuery);
        Response<List<Profile>> execute = allProfiles.execute();
        List<Profile> profiles = execute.body();
        return profiles;
    }

    //this is an implementation of the getProfileId() method that we implemented in ProfileDTO
    public Profile save(Profile profile) throws Exception {
        Integer profileID = Integer.parseInt(profile.getProfileId());
        allProfiles.put(profileID, profile);
        return profile;
    }
}
