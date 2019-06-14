package com.kok.designpatterns.creational.builder;

import lombok.Data;

/**
 * @author wenjie
 * @description
 * @date 2019/6/14 22:58
 */
//@Builder
@Data
public class UserDto {

    private String userName;

    private String passWord;

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {
        private UserDto userDto;

        public Builder(){
            userDto = new UserDto();
        }

        public Builder userName(String userName){
            userDto.setUserName(userName);
            return this;
        }

        public Builder passWord(String passWord){
            userDto.setPassWord(passWord);
            return this;
        }

        public UserDto build(){
            return userDto;
        }
    }

}
