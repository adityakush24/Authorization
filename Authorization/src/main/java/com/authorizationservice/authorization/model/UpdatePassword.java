package com.authorizationservice.authorization.model;

import org.springframework.data.annotation.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor      //need default constructor for JSON Parsing
@AllArgsConstructor
@ToString
@ApiModel(description = "Creating model for updating user password")

public class UpdatePassword {

    @Id
    @ApiModelProperty(value = "Username to update password")
    private String userName;

    @ApiModelProperty(value = "old password of user")
    private String oldPassword;

    @ApiModelProperty(value = "new password of user")
    private String newPassword;
    
}
