package by.bsuir.messageapp.service.mapper;

import by.bsuir.messageapp.model.entity.Creator;
import by.bsuir.messageapp.model.request.CreatorRequestTo;
import by.bsuir.messageapp.model.response.CreatorResponseTo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
@Mapper(componentModel = "spring")
public interface CreatorMapper {
    @Mapping(source = "firstName", target = "firstname")
    @Mapping(source = "lastName", target = "lastname")
    CreatorResponseTo getResponse(Creator creator);

    @Mapping(source = "firstName", target = "firstname")
    @Mapping(source = "lastName", target = "lastname")
    List<CreatorResponseTo> getListResponse(Iterable<Creator> creators);

    @Mapping(source = "firstname", target = "firstName")
    @Mapping(source = "lastname", target = "lastName")
    Creator getCreator(CreatorRequestTo creatorRequestTo);
}
