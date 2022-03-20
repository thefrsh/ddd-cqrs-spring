package io.github.thefrsh.dddcqrs.domain.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Defines a value object
 *
 * @author Michal Broniewicz
 */
@Target(value = ElementType.TYPE)
public @interface ValueObject {

}
