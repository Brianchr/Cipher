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
public abstract class AbstractCipher implements CipherInterface
{
    protected int findCharIndex(char ch)
    {
        int i = 0;
        while (i < ALPHABETH.length)
        {            
            if (ch != ALPHABETH[i])
            {
                i++;
            }
            else
                break;
        }
        if (i == ALPHABETH.length)
        {
            i = -1;
        }
        return i;
    }
    
}
