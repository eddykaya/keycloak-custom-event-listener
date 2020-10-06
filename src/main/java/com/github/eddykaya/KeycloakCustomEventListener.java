package com.github.eddykaya;

import org.jboss.logging.Logger;
import org.keycloak.events.Event;
import org.keycloak.events.EventListenerProvider;
import org.keycloak.events.EventType;
import org.keycloak.events.admin.AdminEvent;

public class KeycloakCustomEventListener implements EventListenerProvider {

    private final Logger log = Logger.getLogger(getClass().getSimpleName());

    @Override
    public void onEvent(Event event) {
        if (event.getType().equals(EventType.REGISTER)) {
            log.infof("User %s has successfully registered", event.getUserId());
        }
    }

    @Override
    public void onEvent(AdminEvent adminEvent, boolean b) {
        log.infof("Received admin event: %s", adminEvent);
    }

    @Override
    public void close() {
        log.debug("Closing...");
    }
}
