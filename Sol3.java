package org.example;

public class Sol3 {
    public String getResult(long ulDataInput){
        StringBuilder res = new StringBuilder();
        int i=2;
        while (i<=Math.sqrt(ulDataInput)) {
            if (ulDataInput % i == 0) {
                res.append(i);
                ulDataInput /= i;
                if (ulDataInput > 1){
                    res.append(' ');
                }
            } else {
                i++;
            }
        }
        if (ulDataInput > 1){
            res.append(ulDataInput);
        }
        return res.toString();
    }
}
