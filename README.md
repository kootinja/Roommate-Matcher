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
[Storyboard](https://online.visual-paradigm.com/share.jsp?id=313538363632392d32#diagram:workspace=eqtcqchr&proj=0&id=2&view)

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

## JSON Schema
This is what we plan to export to another app

{ "Gender" : { "type" : "string" }, "smoking" : { "type" : "boolean" }, "cleanliness" : { "type" : "String" }, "Location" : { "type" : "String" }, "NumberOfPeople" : { "Type" : "double" }, "PriceTotal" : { "type" : "double" }, "SleepSchedule" : { "type" : "String" }, "WorkSchedule" : { "type" : "String" }, "Description" : { "type" : "String" }, "ProfilePicture" : { "type" : "String" }}


## Team Members and Roles
- UI Specialist: Brandan Ngyuen, Bhakti Pokhrel
- Logic/Persitence: Robert Hart 
- DevOps/Product Owner/Scrum Master/GitHub Admin: Jeanette Kootin- Sanwu

## Milestones
[Milestone 1](https://github.com/kootinja/Roommate-Matcher/milestone/1)

## Standup
[We will meet at 7:30 EST on Thursdays](https://teams.microsoft.com/l/meetup-join/19%3ameeting_NTQ4ODBlNTAtZWFjNi00YWFhLWJlNjAtNmM5OTQwZWM3YzBj%40thread.v2/0?context=%7b%22Tid%22%3a%22f5222e6c-5fc6-48eb-8f03-73db18203b63%22%2c%22Oid%22%3a%225705403b-7546-4aac-b858-9d09d3efb663%22%7d)


