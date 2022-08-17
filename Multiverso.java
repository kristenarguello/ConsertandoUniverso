import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Multiverso {
    public static String leTXT() {
        String arquivo = "";
        try {
            FileReader arq = new FileReader("multiv.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            String str = lerArq.readLine();
            while (str != null) {
                //System.out.printf("%s\n", str);
                arquivo += str + "\n";
                str = lerArq.readLine();
            }
            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo!");
        }
        return arquivo;
    }
    public static int cpy(int x,int y) {
        y = x;
        return y;
    }
    public static int inc(int x) {
        x += 1;
        return x;
    }
    public static int dec(int x) {
        x -= 1;
        return x;
    }
    public static int jzn(int x, int y) {
        if (x == 0) return 1;
        else return y;
    }
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
 public static void main (String [] args) {
        int a=0,b=0,c=0,d=0,pos=0,x,y;
        String[] instrucoes = leTXT().split("\n");
        char letra;
        String[] info = new String[3];
        boolean num;
        
        while (pos<instrucoes.length) {
            letra = instrucoes[pos].charAt(0);
            switch (letra) {
                case 'c':
                    info = instrucoes[pos].split(" ");
                    num = isNumeric(info[1]);
                    if (num) {
                        x = Integer.valueOf(info[1]);
                    }
                    else {
                        if (info[1].equals("a")) x = a;
                        else if (info[1].equals("b")) x = b;
                        else if (info[1].equals("c")) x = c;
                        else x = d;   
                    }

                    if (info[2].equals("a")) a = cpy(x,a);
                    else if (info[2].equals("b")) b= cpy(x,b);
                    else if (info[2].equals("c")) c = cpy(x,c);
                    else d = cpy(x,d);   
                    pos++;
                    break;
                case 'i':
                    info = instrucoes[pos].split(" ");
                    num = isNumeric(info[1]);
                    if (num) {
                        inc(Integer.valueOf(info[1]));
                    }
                    else {
                        if (info[1].equals("a")) a = inc(a);
                        else if (info[1].equals("b")) b= inc(b);
                        else if (info[1].equals("c")) c = inc(c);
                        else d = inc(d);   
                    }
                    pos++;
                    break;
                case 'd':
                    info = instrucoes[pos].split(" ");
                    num = isNumeric(info[1]);
                    if (num) {
                        dec(Integer.valueOf(info[1]));
                    }
                    else {
                        if (info[1].equals("a")) a = dec(a);
                        else if (info[1].equals("b")) b = dec(b);
                        else if (info[1].equals("c")) c = dec(c);
                        else d = dec(d);   
                    }
                    pos++;
                    break;
                case 'j':
                    info = instrucoes[pos].split(" ");
                    num = isNumeric(info[1]);
                    if (num) {
                        x = Integer.valueOf(info[1]);
                    }
                    else {
                        if (info[1].equals("a")) x = a;
                        else if (info[1].equals("b")) x = b;
                        else if (info[1].equals("c")) x = c;
                        else x = d;   
                    }

                    num = isNumeric(info[2]);
                    if (num) {
                        y = Integer.valueOf(info[2]);
                    }
                    else {
                        if (info[2].equals("a")) y = a;
                        else if (info[2].equals("b")) y = b;
                        else if (info[2].equals("c")) y = c;
                        else y = d;   
                    }
                    pos += jzn(x,y);
                    break;
            }
        }
        System.out.println("resultado " + a);
    }
}
