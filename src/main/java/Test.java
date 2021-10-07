import builder_factory.LeadFactory;
import domain.enums.DocumentType;
import domain.model.Address;
import domain.model.Document;
import domain.model.Lead;

import java.time.LocalDateTime;

public class Test {

    public static void main(String[] args) {

        //Create
        DocumentType cpf = DocumentType.CPF;
        String trademark = "loja 1";

        //Construtor fica gigante
        Lead leadConstructor =
                new Lead(trademark,
                        new Document(cpf, "0029962212"),
                        new Address("rua", "cidade", "estado", "123"),
                        LocalDateTime.now());


        //Com factory
        LeadFactory factory1 = new LeadFactory();
        Lead leadFactory = factory1.createLead(trademark).leadCreated();

        //Possivel Erro
        LeadFactory factory2 = new LeadFactory();
        Lead leadFactory2 = factory2.leadCreated();


        System.out.println(leadFactory);
        System.out.println(leadFactory2);

    }

}
