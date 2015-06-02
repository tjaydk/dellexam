/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import DTO.PoEDTO;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dennis
 */
public class createPOEJUnitTest {
    
    public createPOEJUnitTest() {
    }
    
    @Test
    public void createPoEDTOData() {
        PoEDTO poe = new PoEDTO(
                "Test number", 
                "Test type", 
                "Test activity", 
                "Test date", 
                "Test reciepients", 
                "Test opens/Hits", 
                "Test clicks", 
                "Test information", 
                "Test filepath");
        
        
        assertTrue(poe.getPoe_ID().equals("Test number"));
        assertTrue(poe.getCampaign_type().equals("Test type"));
        assertTrue(poe.getActivity().equals("Test activity"));
        assertTrue(poe.getDate().equals("Test date"));
        assertTrue(poe.getRecipients().equals("Test reciepients"));
        assertTrue(poe.getUnique_opens_hits().equals("Test opens/Hits"));
        assertTrue(poe.getUnique_clicks().equals("Test clicks"));
        assertTrue(poe.getAdditional_information().equals("Test information"));
        assertTrue(poe.getFilepath().equals("Test filepath"));
    }
    
    
    
    
}
