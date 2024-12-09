package en.g3.groovy.catalogcontext.application.mapper;

import en.g3.groovy.catalogcontext.application.dto.SaveSongDTO;
import en.g3.groovy.catalogcontext.application.dto.SongContentDTO;
import en.g3.groovy.catalogcontext.domain.SongContent;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SongContentMapper {

    @Mapping(source = "song.publicId", target = "publicId")
    SongContentDTO songContentToSongContentDTO(SongContent songContent);

    SongContent saveSongDTOToSong(SaveSongDTO songDTO);
}
