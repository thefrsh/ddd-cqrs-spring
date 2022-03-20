package io.github.thefrsh.dddcqrs.infrastructure;

import io.github.thefrsh.dddcqrs.domain.BaseEntity;

/**
 * Generic interface for entities persistence
 *
 * @param  <E> derived object of {@link BaseEntity} superclass
 * @author Michal Broniewicz
 */
public interface Persistence<E extends BaseEntity> {

    E loadById(Long id);
}
