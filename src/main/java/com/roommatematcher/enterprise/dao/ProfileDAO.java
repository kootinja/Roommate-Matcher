package com.roommatematcher.enterprise.dao;

import com.roommatematcher.enterprise.dto.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.List;

@Repository
public class ProfileDAO implements IProfileDAO{

    @Autowired
    private ProfileRepository profileRepository;

    @Autowired


    @Override
    public List<Profile> fetchProfiles(String profileName) throws IOException {
        Retrofit retrofitInstance = RetrofitClientInstance.getRetrofitInstance();
        IProfileRetrofitDAO profileRetrofitDAO = retrofitInstance.create(IProfileRetrofitDAO.class);
        Call<List<Profile>> allPlants = profileRetrofitDAO.getProfiles(profileName);
        Response<List<Profile>> execute = allPlants.execute();
        List<Profile> profiles = execute.body();
        return profiles;
    }
}
