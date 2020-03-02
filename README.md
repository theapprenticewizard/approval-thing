# approval-thing
A simple CRUD app that saves 'applications' into a MySQL database that are submitted from React using REST. This project is meant to demonstrate how to handle state in React where the client's state is the source of truth for component-rendering.  Versus other anti-patterns such as fetching after POST/PUT/PATCH request.

### How to run:

1. Run `docker-compose up` to start-up MySQL
2. Open MySQL from the terminal or your favorite SQL Client, and add a user `hibernate:%` with password `hibernate` 
3. `cd` into `./application-service` and start the quarkus development server by running `mvn/.mvnw quarkus:dev`
4. `cd` back out and into `./approval-client` and run `yarn/npm start`
