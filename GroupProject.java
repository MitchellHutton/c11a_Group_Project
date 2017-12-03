public class GroupProject {
  public static void main(String[] args) {

      /* Reads the csv file
        */
      TextIO.readFile("Fs.csv");
      TextIO.getln();  // skip the line of headers...
      int pos=0;
      while (!TextIO.eof()){
        String line = TextIO.getln(); // read in the next line from the file

        String[] fields = line.split(","); // split the columns apart


    System.out.println("Welcome to the fantasy draft!!!!");


  }
}
