package io.swagger.api;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-16T16:42:40.675Z")
public class ApiException extends Exception{
	private int code;
	public ApiException(int code, String msg) {
		super(msg);
		this.code = code;
	}
}
