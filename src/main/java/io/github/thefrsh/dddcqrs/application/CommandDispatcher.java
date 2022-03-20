package io.github.thefrsh.dddcqrs.application;

/**
 * Gateway to command handlers
 *
 * @see CommandHandler
 * @see Command
 * @author Michal Broniewicz
 */
public interface CommandDispatcher {

    Object dispatch(Command command);
}
