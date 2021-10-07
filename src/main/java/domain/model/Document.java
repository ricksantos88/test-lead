package domain.model;

import domain.enums.DocumentType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Document {

    private DocumentType type;
    private String value;

}
