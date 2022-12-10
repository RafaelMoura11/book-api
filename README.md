# Book API

This is my first Java Project. It's an API where you can manipulate books. You can create, read, update and delete books from the database


## Stacks

- Java

- Springboot

- Docker

- Postgres

- IntelliJ

- JPA




## How to init the project

At first I recommend you to use the IDEA IntelliJ (the one that I used to build this project) and also you should use JDK 19 (just to prevent from possible issues)

Once you chose your tools it's time to setup the docker container which will run the Postgres

The command line is:

```
docker run --name postgres -e POSTGRES_PASSWORD=admin123 -e POSTGRES_USER=root -e POSTGRES_DB=books -p 5432:5432 -d postgres
```

Do not worry about these environment variables. They are already in the file "resources/application.properties"

Also you can change any of them if you want to

After that you must open the main file that is in the root of the application

This file is "BookApiApplication". Once you opened it you can run and wait for the build process

Now the project is up and you can check it out by making a simple GET request from the follow url:

```
localhost:8080/books
```

Once everything is ok you are able to make GET, GET ONE (by id), PUT, POST and DELETE requests from this url

