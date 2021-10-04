package com.roommatematcher.enterprise.dao;

import com.roommatematcher.enterprise.dto.Profile;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface IProfileRetrofitDAO {
    @GET("/roommates.json")
    Call<List<Profile>> getProfiles(@Query("Profile_Name") String profileName);
}
