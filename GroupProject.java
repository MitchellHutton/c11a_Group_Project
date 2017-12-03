public class GroupProject {
  public static void main(String[] args) {

      int dbSize = 600;

      String[] player = new String[dbSize];    // col 0
      String[] position = new String[dbSize];      // col 1
      String[] team = new String[dbSize];       // col 2

      int[] rebounds = new int[dbSize];            // col 3
      int[] assists = new int[dbSize];           // col 4
      int[] steals = new int[dbSize];            // col 5
      int[] blocks = new int[dbSize];            // col 6
      int[] points = new int[dbSize];            // col 7





      /* Reads the csv file
        */
      TextIO.readFile("fs.csv");
      TextIO.getln();  // skip the line of headers...
      int cate = 0;
      while (!TextIO.eof()){
        String line = TextIO.getln(); // read in the next line from the file

        String[] fields = line.split(","); // split the columns apart


//establish categories 
      player[cate] = fields[0];
      position[cate] = fields[1];
      team[cate] = fields[2];
      rebounds[cate] = Integer.parseInt(fields[3]);
      assists[cate] = Integer.parseInt(fields[4]);
      steals[cate] = Integer.parseInt(fields[5]);
      blocks[cate] = Integer.parseInt(fields[6]);
      points[cate] = Integer.parseInt(fields[7]);

    System.out.println("Welcome to the fantasy draft!!!!");


  }
}
