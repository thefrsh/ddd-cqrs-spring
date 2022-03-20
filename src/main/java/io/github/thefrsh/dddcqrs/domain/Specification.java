package io.github.thefrsh.dddcqrs.domain;

import io.github.thefrsh.dddcqrs.Then;

/**
 * Pattern determining whether the domain rules for a given object are met
 *
 * @param   <T> the type of a given domain object
 * @see     Rule
 * @see     io.github.thefrsh.dddcqrs.domain.annotation.DomainSpecification
 * @author  Michal Broniewicz
 */
public interface Specification<T> {

    boolean isSatisfiedBy(T candidate);

    default Then<T> ifSatisfiedBy(T candidate) {

        return new Then<>(candidate, isSatisfiedBy(candidate));
    }
}
