package io.github.thefrsh.dddcqrs.application;

/**
 * Handles specified type of {@link Command}
 *
 * @param  <R> value returned from handling
 * @param  <C> handled command
 * @author Michal Broniewicz
 */
public interface CommandHandler<R, C extends Command> {

    R handle(C command);

    boolean canHandle(Command command);
}
