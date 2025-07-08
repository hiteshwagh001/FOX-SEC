package com.foxsec.user_services.mapper;

import com.foxsec.user_services.dto.UserDto;
import com.foxsec.user_services.model.User;
import com.foxsec.user_services.model.UserRole;

public class UserMapper {

    // This class can be used to map UserDto to User and vice versa
    // For example, you can use ModelMapper or MapStruct for this purpose

    // Example method to convert UserDto to User
    public static User mapToUser(UserDto userDto) {
        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        user.setEmail(userDto.getEmail());
        user.setRole(UserRole.fromString(userDto.getRole()));
        user.setActive(userDto.isActive());
        return user;
    }

    // Example method to convert User to UserDto
    public static UserDto mapToUserDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setUsername(user.getUsername());
        userDto.setPassword(user.getPassword());
        userDto.setEmail(user.getEmail());
        userDto.setRole(user.getRole().toString());
        userDto.setActive(user.isActive());
        return userDto;
    }

}
