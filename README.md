# RoommateMatcher
---

Jeanette Kootin- Sanwu

Robert Hart

Bhakti Pokhrel

Brandon Nguyen

## Introduction
The Roommate Matcher will be used to help pair recent graduates with a roommate for when they relocate to a different location. Also, it can be helpful if you aren’t leaving for a new city and can find people that are near you. 

Users will be able to filter what they want in a roommate based on their own preferences such as gender, cleanliness, location, amount of roommates, etc. 

Users will be able to interact with the Roommate Matcher by using our UI and endpoints to find their perfect roommate match!

## Storyboard
[Storyboard]![MicrosoftTeams-image](https://user-images.githubusercontent.com/47064092/133006027-2c23eaa8-6c74-40d4-9514-f029d16bce74.png)
![MicrosoftTeams-image (1)](https://user-images.githubusercontent.com/47064092/133006030-e4981f36-d0a4-46e9-aa59-4e0cf49b3075.png)
![MicrosoftTeams-image (2)](https://user-images.githubusercontent.com/47064092/133006034-c6ca1c07-5231-4dac-8aa6-b20d0c3c6989.png)
![MicrosoftTeams-image (3)](https://user-images.githubusercontent.com/47064092/133006038-a6c6030a-2fd1-433d-a590-c44d53646d82.png)

## Requirements

As a recent graduate, I want to be able to find a match for a roommate when I move to a new city, so that I can have more ease when I’m moving and ensure that I will be able to split rent with somebody.

### Example 1:
#### Given: a user wants a roommate that is located in Dallas
#### When: the user searches “Dallas” in the search box
#### Then: the user will find a list of people who are moving to dallas for their job

### Example 2:
#### Given: a user is a woman and wants a roommate who is also a woman
#### When: the user filters for their gender preference
#### Then: the user will find a list of women that they will be able to room with

### Example 3:
#### Given: a user wants a roommate that doesn’t mind smoking
#### When: the user filters in the search box “smoking”
#### Then: the user will find a list of people who either smoke as well or don’t mind smoking

## Class Diagram
![classDiagram (1).pdf](https://github.com/kootinja/Roommate-Matcher/files/7150391/classDiagram.1.pdf)

### Class Diagram Description
- ProfileDAO: Shows the profile of the user
- LocationDAO: Gathers location data on where the user is going
- PhotoDAO: Interface to gather pictures of the users of the profile
- ProfileFilterProcess: Class that represents filter profiles to match roommates together
- IPhotoDAO: Interface to show the photo of the user
- IProfileDAO: Interface to show the profile of the user
- ProfilePhotoBase64Adapter: Class that will import photo into JSON for the user's profile
- Photo: Class that will dispaly the image of the user's profile
- Location: Class that will display the location
- Profile: Class will display the information of the user to show their individual profile

## JSON Schema
This is what we plan to export to another app

> { "Gender" : { "type" : "string" }, "smoking" : { "type" : "boolean" }, "cleanliness" : { "type" : "String" }, "Location" : { "type" : "String" }, "NumberOfPeople" : { "Type" : "double" }, "PriceTotal" : { "type" : "double" }, "SleepSchedule" : { "type" : "String" }, "WorkSchedule" : { "type" : "String" }, "Description" : { "type" : "String" }, "ProfilePicture" : { "type" : "String" }}


## Team Members and Roles
- UI Specialists: Brandan Ngyuen, Bhakti Pokhrel
- Logic/Persitence: Robert Hart 
- DevOps/Product Owner/Scrum Master/GitHub Admin: Jeanette Kootin- Sanwu

## Milestones
[Milestone 1](https://github.com/kootinja/Roommate-Matcher/milestone/1)

## Standup
[We will meet at 7:30 EST on Thursdays](https://teams.microsoft.com/l/meetup-join/19%3ameeting_NTQ4ODBlNTAtZWFjNi00YWFhLWJlNjAtNmM5OTQwZWM3YzBj%40thread.v2/0?context=%7b%22Tid%22%3a%22f5222e6c-5fc6-48eb-8f03-73db18203b63%22%2c%22Oid%22%3a%225705403b-7546-4aac-b858-9d09d3efb663%22%7d)


