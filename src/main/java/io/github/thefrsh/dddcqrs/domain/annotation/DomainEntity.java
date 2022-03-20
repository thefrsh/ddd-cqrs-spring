package io.github.thefrsh.dddcqrs.domain.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Defines a domain entity
 *
 * @see io.github.thefrsh.dddcqrs.domain.BaseEntity
 * @author Michal Broniewicz
 */
@Target(value = ElementType.TYPE)
public @interface DomainEntity {

}
