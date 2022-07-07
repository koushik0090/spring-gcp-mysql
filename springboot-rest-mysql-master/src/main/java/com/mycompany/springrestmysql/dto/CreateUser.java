package com.mycompany.springrestmysql.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@ApiModel
public class CreateUser {

	@ApiModelProperty(example = "User Test")
	@NotBlank
	private String name;

	@ApiModelProperty(example = "user@test.com", position = 2)
	@Email
	@NotBlank
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
