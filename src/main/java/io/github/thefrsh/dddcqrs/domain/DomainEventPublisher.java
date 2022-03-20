package io.github.thefrsh.dddcqrs.domain;

/**
 * Publishes {@link DomainEvent}
 *
 * @see BaseAggregateRoot
 * @author Michal Broniewicz
 */
public interface DomainEventPublisher {

    void publish(DomainEvent event);
}
