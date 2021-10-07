package domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class Lead {

    private String trademark;
    private Document document;
    private Address address;
    private LocalDateTime createdAt;

    public Lead(String trademark) {
         this.trademark = trademark;
        this.createdAt = LocalDateTime.now();
    }

    public void addAddress(Address address) {
        this.setAddress(address);
    }

    public void addDocument(Document document){
        this.setDocument(document);
    }

}
