/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vbkJi
 */
public class AccountTest{
    
@Test
 public void testHasBalance(){
     Account a = new Account(10.0);
     assertTrue(a.hasBalance());
 }
 
 @Test
 public void testWithoutBalance(){
     Account a = new Account(0.0);
     assertFalse(a.hasBalance());
 }
 
 @Test
 public void testBalanceWithNullValue(){
     Account a = new Account(null);
     assertFalse(a.hasBalance());
 }
    
}
