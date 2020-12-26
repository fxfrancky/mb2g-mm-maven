package guru.springframework.converters;

import guru.springframework.entities.User;
import guru.springframework.webapi.UserCommand;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserToUserCommandMapper {

    UserToUserCommandMapper INSTANCE = Mappers.getMapper(UserToUserCommandMapper.class);
    UserCommand UserToUserCommandMapper(User user);
    User UserCommandToUserMapper(UserCommand userCommand);

}
