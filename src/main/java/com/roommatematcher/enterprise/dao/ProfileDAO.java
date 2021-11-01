package com.roommatematcher.enterprise.dao;

import com.roommatematcher.enterprise.dto.Profile;
import org.springframework.stereotype.Repository;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.List;

@Repository
public class ProfileDAO implements IProfileDAO{

    @Override
    public List<Profile> fetchProfile(String filterQuery) throws IOException {
        Retrofit retrofitInstance = RetrofitClientInstance.getRetrofitInstance();
        IProfileRetrofitDAO profileRetrofitDAO = retrofitInstance.create(IProfileRetrofitDAO.class);
        Call<List<Profile>> allProfiles = profileRetrofitDAO.getProfiles(filterQuery);
        Response<List<Profile>> execute = allProfiles.execute();
        List<Profile> profiles = execute.body();
        return profiles;
    }
}
