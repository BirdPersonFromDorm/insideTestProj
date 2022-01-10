# Test Project

Technologies

- Java (spring framework)
- MySQL
- Docker


## Installation

Download this project from gitHub https://github.com/BirdPersonFromDorm/insideTestProj

Open terminal and enter next docker commands

```
docker-compose up
```
After that you need chack container id of mysql:5.7 like this "95f75a557eb2"

```
docker exec -it 95f75a557eb2 bin/bash
```
```
mysql -uroot -p testProj
```
```
admin
```

Then add next sql insert

insert role
(role_name)
values
("ROLE_USER"),
("ROLE_MODERATOR"),
("ROLE_ADMIN");

Then close terminal and open postMan or other app for tests web api

## EndPoints

| EndPoints | description |
| ------ | ------ |
| http://localhost:5050/register | registering a new user |
| http://localhost:5050/auth | log in |
| http://localhost:5050/user/addNewMessage | add new message |
| http://localhost:5050/user/addNewMessage | get all message |

## Usage steps

1. Register using http://localhost:5050/register like this:

{
"login": "login",
"password": "password"
}

2. After that usin http://localhost:5050/auth enter to body tour login and password like this:

{
"login": "login",
"password": "password"
}

3. Then you get your token, you can use it to log in to your account and add new message box like this

{
"name": "someText",
"message": "someText"
}
