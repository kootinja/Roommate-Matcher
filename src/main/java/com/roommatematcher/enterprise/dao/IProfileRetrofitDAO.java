package com.roommatematcher.enterprise.dao;

import com.roommatematcher.enterprise.dto.Profile;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface IProfileRetrofitDAO {
    @GET("/Roommate-Matcher/Enterprise/templates/start.html") // 8:04 in implement retrofit vid if it needs adjusting
    Call<List<Profile>> getProfiles(@Query("_ijt") String filterQuery); //filterQuery is combinedName from vid
}
