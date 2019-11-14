import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        // Object for the first version:
        // Take words from standard input(till EOF).
        // And shows number of words read so far.
        Scanner reader = new Scanner(System.in).useDelimiter("\\W+");
        int nWords = 0;
        while (reader.hasNext()) {
            reader.next();
            ++nWords;
        }
        System.out.println(nWords);
    }
}
/* Test Input 1
Hello World!
^D
Output: 2
 */

/* Test Input 2
You're the last hope!
^D
Output: 5
 */

/* Test Input 3
I threw a wish in the well
Don't ask me I'll never tell
I looked at you as it fell
And now you're in my way
I'd trade my soul for a wish
Pennies and dimes for a kiss
I wasn't looking for this
But now you're in my way

Your stare was holding
Ripped jeans, skin was showin'
Hot night, wind was blowin'
Where you think you're going baby?
^D
Output: 77
 */
