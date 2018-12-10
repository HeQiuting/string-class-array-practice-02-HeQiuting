public class Phrase
{
    private static String currentPhrase;

    /** Constructs a new Phrase object. */
    public Phrase(String p)
    {
         currentPhrase = p;
    }

    /** Returns the index of the nth occurrence of str in the current phrase;
     *  returns -1 if the nth occurrence does not exist.
     *  Precondition: str.length() > 0 and n > 0
     *  Postcondition: the current phrase is not modified.
     */
    public static int findNthOccurrence(String str, int n)
    {
        int a = 0;
        int loc = currentPhrase.indexOf(str);
        for(int i = 0; i < currentPhrase.length() + str.length(); i++)
        {
            
            if(currentPhrase.substring(i, i + str.length()).equals(str) == true && a < n){
                a++;
            }
            else if(currentPhrase.substring(i, i + str.length()).equals(str) == false && a == n){
                loc = i - 1;
            }
            else if(currentPhrase.substring(i, i + str.length()).equals(str) == false && a < n){
                return -1;
            }
        } 
        return loc;
    }
}
        int loc = -1;
        int count = 0;
        int start = 0;
        int sub = -1;


    /** Modifies the current phrase by replacing the nth occurrence of str with repl.
     *  If the nth occurrence does not exist, the current phrase is unchanged.
     *  Precondition: str.length() > 0 and n > 0
     */
    public void replaceNthOccurrence(String str, int n, String repl)
    {
        int index = findNthOccurrence(str, n);
        return currentPhrase.substring(0, index) + repl + currentPhrase.substring(index + str.length());
        
    }

    /** Return the index of the last occurrence of str in the current phrase;
     *  returns -1 if str is not found.
     *  Precondition: str.length() > 0
     *  Postcondition: the current phrase is not modified.
     */
    public int findLastOccurrence(String str)
    {
        int n = 1;
        while(findNthOccurrence != -1)
        {
            n++;
        }
        return findNthOccurrence(str, n);
    }
    /** Returns a string containing the current phrase */
    public String toString(){
        return currentPhrase;
    }
    public static void main(String[] args)
    {
    }
}
