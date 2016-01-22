package com.coolweather.app.util;

public interface HttpCallbackListener {
	void onFinished(String response);

	void onError(Exception e);
}
