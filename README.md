# Sloshify

**A Spring Web Application **

## WeSummary

A web app in order to enhance UT Slosh's social dance scheduling, teaching, and free dance sessions

## Core Features

- Website Framework
  -Leaders and Dancers distinction?
  -Database for logins?
- Scheduling songs based on the dance style
  -Shuffled playlists that allow for “weights” of certain dance styles to be played more
  -Allow manual editing of playlist from users
  -Showing song dance style to the playlist - connected through containing an extra column related to a given song through Spotify’s API (https://developer.spotify.com/web-api/playlist-endpoints/ )
  -https://github.com/thelinmichael/spotify-web-api-java
- Checking in/allowing people to sign up for different tasks throughout the meeting for each event
- List of SLOSH events (Use Google API?)

## Additional Features 
- Public website introducing SLOSH :-)
- Login for SLOSH leaders
- Buy a domain
- Public people can add SLOSH calendar to their google/Apple calendars -- never miss a slosh event

## Web Layout
- https://slosh.heroku.com Homepage
- /login Login page (potentially homepage)
- /leaders
- /leaders/dj Dj playlist
- /leaders/library List of playlists & “All music” associated to dance styles 
  -/library/all-songs 
  -/library/salsa
  -...
- /events Calendar of events for Slosh
- /events/event-1/
  -List roles, rsvp, etc for each event
  -& sign up
- /help
  -Teach future people how to use our website
- /contact-us 
  -List contact info of leaders?
- /about 
- Future ideas:
  -https://slosh.heroku.com/about-the-leaders 
  -https://slosh.heroku.com/leaders/my-slosh 
  -Lists all the roles you’re signed up for/responsibility you have
  -https://slosh.heroku.com/suggestion-box 
  

