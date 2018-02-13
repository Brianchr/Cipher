/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ancient_encryption1;

/**
 *
 * @author Computer
 */
public class CeasarCipher extends AbstractCipher
{
    int rotFactor;

    public CeasarCipher(int rotFactor)
    {
        if (0 < rotFactor)
        {
            if (rotFactor < ALPHABETH.length)
            {
                this.rotFactor = rotFactor;
            }
            else
            {
                System.out.println("Number of rotation is greater than Alphabeth");
            }    
        }
        else
        {
            System.out.println("Number of rotation is a negative value");
        }
    
    }
    @Override
    public String encrypt(String message)
    {
        String result = "";
        for (char c : message.toCharArray())
        {
            int index = findCharIndex(c);
            if (index != -1)
            {
                result += ALPHABETH[(index + rotFactor) % ALPHABETH.length];
            }
            else
            result += c;
        }
        return result;
    }
    @Override
    public String decrypt(String encrypted)
    {
        String result = "";
        for (char c : encrypted.toCharArray())
        {
            int index = findCharIndex(c);
            if (index != -1)
            {
                result += ALPHABETH[(index - rotFactor + ALPHABETH.length) % ALPHABETH.length];
            }
            else
            result += c;
        }
        return result;
    }    
    
    
}
