package io.github.thefrsh.dddcqrs.domain.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Defines an interface to a domain module
 *
 * @author Michal Broniewicz
 */
@Target(value = ElementType.TYPE)
public @interface DomainEntryPoint {

}
