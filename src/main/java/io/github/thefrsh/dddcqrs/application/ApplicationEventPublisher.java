package io.github.thefrsh.dddcqrs.application;

/**
 * Publishes {@link ApplicationEvent}
 *
 * @author Michal Broniewicz
 */
public interface ApplicationEventPublisher {

    void publish(ApplicationEvent event);
}
