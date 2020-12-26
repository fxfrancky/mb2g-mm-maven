package guru.springframework.converters;

import guru.springframework.entities.User;
import guru.springframework.entities.User.UserBuilder;
import guru.springframework.webapi.UserCommand;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-12-26T20:44:52+0100",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 14.0.2 (Private Build)"
)
public class UserToUserCommandMapperImpl implements UserToUserCommandMapper {

    @Override
    public UserCommand UserToUserCommandMapper(User user) {
        if ( user == null ) {
            return null;
        }

        UserCommand userCommand = new UserCommand();

        userCommand.setFirstName( user.getFirstName() );
        userCommand.setEmail( user.getEmail() );

        return userCommand;
    }

    @Override
    public User UserCommandToUserMapper(UserCommand userCommand) {
        if ( userCommand == null ) {
            return null;
        }

        UserBuilder user = User.builder();

        user.firstName( userCommand.getFirstName() );
        user.email( userCommand.getEmail() );

        return user.build();
    }
}
