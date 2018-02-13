/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ancient_encryption1;

import javax.management.JMX;

/**
 *
 * @author Computer
 */
public class AtbashCipher extends AbstractCipher
{
    @Override
    public String encrypt(String message)
    {
        String result = "";
        for (char c : message.toCharArray())
        {
            int index = findCharIndex(c); //= ALPHABETH.length - 1 - findCharIndex(c);
            if (index != -1)
            {
                result += ALPHABETH[ALPHABETH.length - 1 - index];
            }
            else
            result += c;
        }
        return result;
    }
    @Override
    public String decrypt(String encrypted)
    {
        return encrypt(encrypted);
        
    }
}
