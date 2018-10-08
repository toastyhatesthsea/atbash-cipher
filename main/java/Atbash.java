public class Atbash
{


    public String encode(String aStr)
    {
        String cleanString = aStr.replaceAll("[ ,.]", "").toLowerCase();
        String answer = "";
        int grouping = 0; //used to group letters by groups of 5

        for (int i = 0; i < cleanString.length(); i++)
        {
            if (grouping == 5)
            {
                answer = answer.concat(" ");
                grouping = 0; //resets grouping back to zero
            }
            char aChar = cleanString.charAt(i);
            int movement = 0;
            char aDefault = 'z';

            if (Character.isLetter(aChar))
            {
                grouping++;
                movement = aChar - 'a';
                aDefault = (char) (aDefault - movement);
                answer = answer.concat(Character.toString(aDefault));
            }
            else if (Character.isDigit(aChar))
            {
                grouping++;
                answer = answer.concat(Character.toString(aChar));
            }
        }
        return answer;
    }

    public String decode(String aStr)
    {
        String answer = "";
        String cleanString = aStr.replaceAll("[ ,.]", "").toLowerCase();



        return answer;
    }
}
