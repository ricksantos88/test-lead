package builder_factory;

import domain.enums.DocumentType;
import domain.model.Address;
import domain.model.Document;
import domain.model.Lead;

public class LeadFactory {

    private Lead lead;

    public LeadFactory createLead(String trademark){
        this.lead = new Lead(trademark);
        return this;
    }

    public LeadFactory createDocument(DocumentType type, String value) {
       this.lead.addDocument(new Document(type, value));
       return this;
    }

    public LeadFactory createAddress(Address address) {
        this.lead.addAddress(address);
        return this;
    }

    public Lead leadCreated() {
        return this.lead;
    }

}
