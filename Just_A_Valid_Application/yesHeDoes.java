import java.io.PrintStream;

public class yesHeDoes
{
  public static void main(String args[])
  {

    int[] arrayOfInt1 = { 4304, 4288, 4311, 4315, 4296, 4314, 4305, 4294, 4308, 4329, 4307, 4327, 4344, 4349, 4327, 4320, 4342, 4277, 4346, 4327, 4347, 4286, 4312, 4343, 4301, 4321, 4327, 4347, 4321, 4301, 4290, 4343, 4348, 4326, 4343, 4321, 4326, 4343, 4320, 4301, 4343, 4326, 4301, 4351, 4349, 4348, 4301, 4351, 4339, 4348, 4339, 4341, 4343, 4320, 4301, 4351, 4277, 4339, 4301, 4342, 4343, 4351, 4339, 4348, 4342, 4343, 4301, 4321, 4347, 4301, 4344, 4343, 4301, 4321, 4339, 4324, 4339, 4347, 4321, 4301, 4337, 4349, 4342, 4343, 4320, 4301, 4343, 4348, 4301, 4312, 4307, 4292, 4307, 4301, 4284, 4284, 4284, 4301, 4292, 4310, 4319, 4335 };

    char[] ascii = {'_','`', '&', '<', '>', '@', '\'','.','é', ',',' ', '#','{', '}','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','1','2','3','4','5','6','7','8','9','0','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};


    char[] flag = new char[102]; //Cuz flag's size if arrayOfInt1'size => 102
    int flagIndex = 0;
    boolean found = false;

    //We xor every char of ascii[] with 0x1092 to find arrayOfInt1[j]
    //And hopefully every chars of the flag are in ascii ... :)
    for (int j = 0; j < arrayOfInt1.length; j++) {
      for (int k = 0; k < ascii.length; k++) {
        if ((ascii[k] ^ 0x1092) == arrayOfInt1[j]) {
          flag[flagIndex]=ascii[k];
          flagIndex++;
          found = true;
        }
      }
      if(!found) System.out.println("Not found "+ arrayOfInt1[j]);
      found = false;
    }
    System.out.println(flag);
  }
}

//Million
