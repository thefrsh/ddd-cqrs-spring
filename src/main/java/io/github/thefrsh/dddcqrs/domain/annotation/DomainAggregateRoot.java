package io.github.thefrsh.dddcqrs.domain.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Defines a domain aggregate root
 *
 * @see io.github.thefrsh.dddcqrs.domain.BaseAggregateRoot
 * @author Michal Broniewicz
 */
@Target(value = ElementType.TYPE)
public @interface DomainAggregateRoot {

}
