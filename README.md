### EventListener SPI implementation
This is a keycloak plugin which implements the Keycloak EventListener SPI. It logs if a new user registered in the system. 


### Usage
* The plugin is tested with keycloak version *11.0.2*

### build
```bash
    mvn clean package
```

### Run locally
The repository contains a docker-compose.yml file with a keycloak container.
1. Build using `mvn clean package`
2. Run `cp ./target/keycloak-custom-eventlistener-0.0.1-SNAPSHOT.jar ./deployments` 
3. Run `docker-compose up`
4. Open http://localhost:9090 and login using admin/admin
5. Navigate to *Realm Settings* and open tab *Login*
6. Activate option *User Registration*
7. Navigate to *Events* and open tab *Config*
8. Add our SPI to the list of event listeners.
10. Open new private browser tab and navigate to http://localhost:9090

### deployment
To use this required action, copy the jar file into the *<keycloak-root>/standalone/deployments* directory.
According to the official documentation, hot deployment is possible.

