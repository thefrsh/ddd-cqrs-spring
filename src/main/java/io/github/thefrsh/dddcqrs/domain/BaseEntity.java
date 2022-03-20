package io.github.thefrsh.dddcqrs.domain;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.UUID;

/**
 * Base class for all domain objects, the data of which should be persisted
 *
 * @see    io.github.thefrsh.dddcqrs.domain.annotation.DomainEntity
 * @author Michal Broniewicz
 */
@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * An additional field on the basis of which the equals-hashcode contract is fulfilled
     */
    @Column(nullable = false, updatable = false)
    private String uuid;

    protected BaseEntity() {

        uuid = UUID.randomUUID().toString();
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof BaseEntity that)) return false;
        return uuid.equals(that.uuid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(uuid);
    }

    public Long getId() {

        return id;
    }
}
