package com.spring.cloud.utils;

import com.alibaba.fastjson.JSONObject;

public class Result extends JSONObject {
	private static final long serialVersionUID = 1L;
	public static final int SUCCESS = 0;
	public static final int ERROR = -1;

	public Result(int _result, String _msg) {
		this.put("errcode", _result);
		this.put("errmsg", _msg);
	}

	public Result(int _result, String _msg, Object _data) {
		this.put("errcode", _result);
		this.put("errmsg", _msg);
		this.put("dataList", _data);
	}

	public static Result success(String _msg, Object _data) {
		return new Result(SUCCESS, _msg, _data);
	}

	public static Result success(String _msg) {
		return new Result(SUCCESS, _msg);
	}

	public static Result error(String _msg, Object _data) {
		return new Result(ERROR, _msg, _data);
	}

	public static Result error(String _msg) {
		return new Result(ERROR, _msg);
	}
}
