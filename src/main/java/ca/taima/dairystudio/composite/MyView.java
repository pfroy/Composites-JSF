package ca.taima.dairystudio.composite;

import javax.enterprise.inject.Model;

/**
 *
 * @author pfroy
 */
@Model
public class MyView {
    
    public Auditable getAuditable() {
        return new Auditable() {

            @Override
            public String getCreatedBy() {
                return "pfroy";
            }
        };
    }
    
}
