
import java.lang.reflect.Array;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sebastian
 */
public class Triplet {
    
    public int maxValue()
    {
        int max = 0;
        int value = 0;
        for (int i = 0; i < 6; ++i)
        {
            for (int j = 1; j < 6; ++j)
            {
                for (int k = 2; k < 6; ++k)
                {
                    value = tab[i] * tab[j] * tab[k];
                    if (value > max)
                    {
                        max = value;
                    }
                }
            }
        }
        return max;
    }
    
    public int[] tab = {-3, 1, 2, -2, 5, 6};
}
