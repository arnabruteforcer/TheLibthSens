
public class FirstScanner extends Thread implements MainCentralScanner {

  @Override
  public void run() {
    for (int i = 0; i < 25; i++) {
      idlist.add("ID" + i);

      try {
        if (i == 15)
          Thread.sleep(10000);
      } catch (InterruptedException interrupt) {
        System.out.println("Couldn't sleep");
      }

    }


  }
}
