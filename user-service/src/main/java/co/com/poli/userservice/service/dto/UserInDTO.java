package co.com.poli.userservice.service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserInDTO {

    @NotEmpty(message = "El nombre no puede estar vacio")
    private String name;

    @NotEmpty(message = "El apellido no puede estar vacio")
    private String lastName;
}
