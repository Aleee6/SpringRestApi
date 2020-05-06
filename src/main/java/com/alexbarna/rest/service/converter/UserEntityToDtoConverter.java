package com.alexbarna.rest.service.converter;

import com.alexbarna.rest.repository.user.UserEntity;
import com.alexbarna.rest.service.user.UserDto;
import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;

public class UserEntityToDtoConverter implements Converter<UserEntity, UserDto> {
    @Override
    public UserDto convert(MappingContext<UserEntity, UserDto> mappingContext) {
        UserEntity source = mappingContext.getSource();
        UserDto userDto = new UserDto();
        return null;
    }
}
