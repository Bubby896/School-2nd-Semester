import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Tokenizer {
    public static void main(String args[])
    throws IOException{

        Path word_frequency = Path.of("/Users/Hiram Silva/Downloads/letter_frequency.txt"); //Tells the program which txt file to read from

        String file_content = Files.readString(word_frequency);  //Imports the content of the txt file to "file_content" in the program

        String NoCommas = file_content.replace(",", "");  //Removes commas from the file content

        String FinalString = NoCommas.replace('"', ' ');   //Removes parenthesis from the file content

        String Lines[] = FinalString.split("\n");  //Splits the file content into individual lines

        System.out.println(FinalString);  //Prints out the file content

        String A[] = Lines[1].split(" ");  //Splits the Second Line into individual parts
        String LetterA = A[5];  //Singles out the letter into a string
        String NumberOfA = A[8];  //Singles out the amount into a string
        String PercentOfA = A[10];  //Singles out the percent into a string

        String B[] = Lines[2].split(" ");
        String LetterB = B[5];
        String NumberOfB = B[9];
        String PercentOfB = B[11];

        String C[] = Lines[3].split(" ");
        String LetterC = C[5];
        String NumberOfC = C[9];
        String PercentOfC = C[11];
        
        String D[] = Lines[4].split(" ");
        String LetterD = D[5];
        String NumberOfD = D[8];
        String PercentOfD = D[10];

        String E[] = Lines[5].split(" ");
        String LetterE = E[5];
        String NumberOfE = E[8];
        String PercentOfE = E[9];

        String F[] = Lines[6].split(" ");
        String LetterF = F[5];
        String NumberOfF = F[9];
        String PercentOfF = F[11];

        String G[] = Lines[7].split(" ");
        String LetterG = G[5];
        String NumberOfG = G[9];
        String PercentOfG = G[11];
        
        String H[] = Lines[8].split(" ");
        String LetterH = H[5];
        String NumberOfH = H[8];
        String PercentOfH = H[10];

        String I[] = Lines[9].split(" ");
        String LetterI = I[5];
        String NumberOfI = I[8];
        String PercentOfI = I[10];

        String J[] = Lines[10].split(" ");
        String LetterJ = J[5];
        String NumberOfJ = J[10];
        String PercentOfJ = J[12];

        String K[] = Lines[11].split(" ");
        String LetterK = K[5];
        String NumberOfK = K[9];
        String PercentOfK = K[11];

        String L[] = Lines[12].split(" ");
        String LetterL = L[5];
        String NumberOfL = L[8];
        String PercentOfL = L[10];

        String M[] = Lines[13].split(" ");
        String LetterM = M[5];
        String NumberOfM = M[9];
        String PercentOfM = M[11];

        String N[] = Lines[14].split(" ");
        String LetterN = N[5];
        String NumberOfN = N[8];
        String PercentOfN = N[10];

        String O[] = Lines[15].split(" ");
        String LetterO = O[5];
        String NumberOfO = O[8];
        String PercentOfO = O[10];

        String P[] = Lines[16].split(" ");
        String LetterP = P[5];
        String NumberOfP = P[9];
        String PercentOfP = P[11];

        String Q[] = Lines[17].split(" ");
        String LetterQ = Q[5];
        String NumberOfQ = Q[10];
        String PercentOfQ = Q[12];

        String R[] = Lines[18].split(" ");
        String LetterR = R[5];
        String NumberOfR = R[8];
        String PercentOfR = R[10];

        String S[] = Lines[19].split(" ");
        String LetterS = S[5];
        String NumberOfS = S[8];
        String PercentOfS = S[10];

        String T[] = Lines[20].split(" ");
        String LetterT = T[5];
        String NumberOfT = T[8];
        String PercentOfT = T[10];

        String U[] = Lines[21].split(" ");
        String LetterU = U[5];
        String NumberOfU = U[9];
        String PercentOfU = U[11];

        String V[] = Lines[22].split(" ");
        String LetterV = V[5];
        String NumberOfV = V[9];
        String PercentOfV = V[11];

        String W[] = Lines[23].split(" ");
        String LetterW = W[5];
        String NumberOfW = W[9];
        String PercentOfW = W[11];

        String X[] = Lines[24].split(" ");
        String LetterX = X[5];
        String NumberOfX = X[10];
        String PercentOfX = X[12];

        String Y[] = Lines[25].split(" ");
        String LetterY = Y[5];
        String NumberOfY = Y[9];
        String PercentOfY = Y[11];

        String Z[] = Lines[26].split(" ");
        String LetterZ = Z[5];
        String NumberOfZ = Z[11];
        String PercentOfZ = Z[13];

        //Prints out a message, converts the number strings into integers, and prints out the sum of all the values
        System.out.println("\n Total Number Of Letters: " + (Integer.parseInt(NumberOfA) + Integer.parseInt(NumberOfB) + Integer.parseInt(NumberOfC) + Integer.parseInt(NumberOfD) + Integer.parseInt(NumberOfE) + Integer.parseInt(NumberOfF) + Integer.parseInt(NumberOfG) + Integer.parseInt(NumberOfH) + Integer.parseInt(NumberOfI) + Integer.parseInt(NumberOfJ) + Integer.parseInt(NumberOfK) + Integer.parseInt(NumberOfL) + Integer.parseInt(NumberOfM) + Integer.parseInt(NumberOfN) + Integer.parseInt(NumberOfO) + Integer.parseInt(NumberOfP) + Integer.parseInt(NumberOfQ) + Integer.parseInt(NumberOfR) + Integer.parseInt(NumberOfS) + Integer.parseInt(NumberOfT) + Integer.parseInt(NumberOfU) + Integer.parseInt(NumberOfV) + Integer.parseInt(NumberOfW) + Integer.parseInt(NumberOfX) + Integer.parseInt(NumberOfY) + Integer.parseInt(NumberOfZ)));
        
        //Prints out a message, converts the percent strings into doubles, and prints out the sum of all the values
        System.out.println("\n Total Percent: " + (Double.parseDouble(PercentOfA) + Double.parseDouble(PercentOfB) + Double.parseDouble(PercentOfC) + Double.parseDouble(PercentOfD) + Double.parseDouble(PercentOfE) + Double.parseDouble(PercentOfF) + Double.parseDouble(PercentOfG) + Double.parseDouble(PercentOfH) + Double.parseDouble(PercentOfI) + Double.parseDouble(PercentOfJ) + Double.parseDouble(PercentOfK) + Double.parseDouble(PercentOfL) + Double.parseDouble(PercentOfM) + Double.parseDouble(PercentOfN) + Double.parseDouble(PercentOfO) + Double.parseDouble(PercentOfP) + Double.parseDouble(PercentOfQ) + Double.parseDouble(PercentOfR) + Double.parseDouble(PercentOfS) + Double.parseDouble(PercentOfT) + Double.parseDouble(PercentOfU) + Double.parseDouble(PercentOfV) + Double.parseDouble(PercentOfW) + Double.parseDouble(PercentOfX) + Double.parseDouble(PercentOfY) + Double.parseDouble(PercentOfZ)));

        
    }
}
