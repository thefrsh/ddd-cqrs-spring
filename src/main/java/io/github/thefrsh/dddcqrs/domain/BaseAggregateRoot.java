package io.github.thefrsh.dddcqrs.domain;

import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

/**
 * Base class for all aggregate roots
 *
 * @author Michal Broniewicz
 */
@MappedSuperclass
public class BaseAggregateRoot extends BaseEntity {

    @Transient
    private DomainEventPublisher publisher;

    public void setDomainEventPublisher(DomainEventPublisher publisher) {

        this.publisher = publisher;
    }
}
