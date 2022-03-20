package io.github.thefrsh.dddcqrs.query.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Defines a presentation layer component showing projections of domain objects
 *
 * @author Michal Broniewicz
 */
@Target(value = ElementType.TYPE)
public @interface Finder {

}
