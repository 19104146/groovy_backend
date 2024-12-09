package en.g3.groovy.catalogcontext.application.dto;

import en.g3.groovy.catalogcontext.application.vo.SongAuthorVO;
import en.g3.groovy.catalogcontext.application.vo.SongTitleVO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record SaveSongDTO(@Valid SongTitleVO title,
                          @Valid SongAuthorVO author,
                          @NotNull byte[] cover,
                          @NotNull String coverContentType,
                          @NotNull byte[] file,
                          @NotNull String fileContentType) {
}
