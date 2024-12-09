package en.g3.groovy.usercontext.mapper;

import en.g3.groovy.usercontext.ReadUserDTO;
import en.g3.groovy.usercontext.domain.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    ReadUserDTO readUserDTOToUser(User entity);

}
