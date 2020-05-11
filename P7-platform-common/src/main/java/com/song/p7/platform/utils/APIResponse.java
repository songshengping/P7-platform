package com.song.p7.platform.utils;

/**
 * API接口返回数据结构
 * 
 * @author Jack
 * @param <T>
 */
public class APIResponse<T> {
	private Boolean success = true;
	private APIErrorCode error = APIErrorCode.SUCCESS;
	private T data;
	
	public Boolean getSuccess() {
		return success;
	}
	
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	
	public APIErrorCode getError() {
		return error;
	}
	
	public void setError(APIErrorCode error) {
		this.error = error;
		this.success = error.equals(APIErrorCode.SUCCESS);
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}

	public APIResponse(T data) {
		this(APIErrorCode.SUCCESS, data);
	}

	public APIResponse() {
		super();
	}
	
	public APIResponse(APIErrorCode error, T data) {
		super();
		if(error != null) this.success = error.equals(APIErrorCode.SUCCESS);
		this.error = error;
		this.data = data;
	}
	
	public APIResponse(APIErrorCode error) {
		this(error, null);
	}
	
	public APIResponse(Boolean success, APIErrorCode error, T data) {
		super();
		this.success = success;
		this.error = error;
		this.data = data;
	}
}
