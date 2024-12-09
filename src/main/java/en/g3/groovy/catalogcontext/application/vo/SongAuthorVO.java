package en.g3.groovy.catalogcontext.application.vo;

import jakarta.validation.constraints.NotBlank;

public record SongAuthorVO(@NotBlank String value) {
}
