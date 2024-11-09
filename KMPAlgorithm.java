public class KMPAlgorithm {
    public static void main(String[] args) {
        String text = "ABABDABACDABABCABAB";
        String pattern = "ABABCABAB";
        KMPSearch(pattern, text);
    }

    static void KMPSearch(String pat, String txt) {
        int M = pat.length();
        int N = txt.length();
        int[] lps = new int[M]; 
        computeLPSArray(pat, M, lps);//this function creates lps array in a variable named lps[]
        int i = 0, j = 0; 
        while (i < N) { 
            if (pat.charAt(j) == txt.charAt(i)) { 
                i++;
                j++;
            }
            if (j == M) {  
                System.out.println("Found pattern at index " + (i - j));
                j = lps[j - 1];//using lps array to find the next starting index of pattern
            } else if (i < N && pat.charAt(j) != txt.charAt(i)) {  
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
    }

    static void computeLPSArray(String pat, int M, int lps[]) {
        int i=0,j=1;
        lps[0]=0;
        int F[]=new int[M];
        int P[]=new int[M];
        while(i<M){
            if(pat.charAt(i)==pat.charAt(j)){
                F[i]=j+1;
                i++;
                j++;
            }
            else if(j>0){
                j=F[j-1];
            }else{
                P[i]=0;
                i++;
            }
        }
    }
}
