package io.yadnyesh.springboot2020.util;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class AsyncResponse<V> implements Future<V> {
	
	private V value;
	private Exception executionException;
	private boolean isCompletedExceptionally = false;
	private boolean isCancelled = false;
	private boolean isDone = false;
	private long checkCompletedInterval = 100;
	
	public AsyncResponse() {
	
	}
	
	public AsyncResponse(V val) {
		this.value = val;
		this.isDone = true;
	}
	
	public AsyncResponse(Throwable ex) {
		this.executionException = new ExecutionException(ex);
		this.isCompletedExceptionally = true;
		this.isDone = true;
	}
	
	@Override
	public boolean cancel(boolean mayInterruptIfRunning) {
		this.isCancelled = true;
		this.isDone = true;
		return false;
	}
	
	@Override
	public boolean isCancelled() {
		return false;
	}
	
	@Override
	public boolean isDone() {
		return false;
	}
	
	@Override
	public V get() throws InterruptedException, ExecutionException {
		//block(0);
		return null;
		
	}
	
	@Override
	public V get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
		return null;
	}
}
