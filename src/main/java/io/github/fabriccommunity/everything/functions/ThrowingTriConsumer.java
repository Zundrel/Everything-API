package io.github.fabriccommunity.everything.functions;


public interface ThrowingTriConsumer<A, B, C> extends io.github.fabriccommunity.everything.functions.TriConsumer<A, B, C> {
	void acceptThrowing(A a, B b, C c) throws Throwable;
	@Override default void accept(A a, B b, C c) {
		try {
			this.acceptThrowing(a, b, c);
		} catch(Throwable t) {
			throw new RuntimeException(t);
		}
	}
}