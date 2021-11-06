package com.roommatematcher.enterprise.dto;

import lombok.Data;
import com.google.gson.annotations.SerializedName;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
public @Data
class Profile {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "profile_id", nullable = false)
    private Integer profileId;

    @SerializedName("gender")
    private String gender;
    @SerializedName("smokingPreference")
    private Boolean smokingPreference;
    @SerializedName("cleanliness")
    private String cleanliness;
    @SerializedName("location")
    private String location;
    @SerializedName("numberOfPeople")
    private Double numberOfPeople;
    @SerializedName("sleepSchedule")
    private String sleepSchedule;
    @SerializedName("workSchedule")
    private String workSchedule;
    @SerializedName("description")
    private String description;
    @SerializedName("profilePicture")
    private String profilePicture;
    @SerializedName("name")
    private String name;
    @SerializedName("age")
    private int age;
}
