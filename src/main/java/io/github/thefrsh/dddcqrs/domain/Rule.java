package io.github.thefrsh.dddcqrs.domain;

/**
 * Domain rule object that can be used by {@link Specification}
 *
 * @see    io.github.thefrsh.dddcqrs.domain.annotation.DomainRule
 * @param  <E> domain object for which the rule is checked
 * @author Michal Broniewicz
 */
public interface Rule<E> {

    boolean meets(E candidate);
}
