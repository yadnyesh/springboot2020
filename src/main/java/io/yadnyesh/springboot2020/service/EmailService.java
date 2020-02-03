package io.yadnyesh.springboot2020.service;

import io.yadnyesh.springboot2020.model.Greeting;

import java.util.concurrent.Future;

public interface EmailService {
	Boolean send (Greeting greeting);
	void sendAsync(Greeting greeting);
	Future<Boolean> sendAsyncWithResult(Greeting greeting);
}
