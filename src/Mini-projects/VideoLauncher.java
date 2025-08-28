import java.util.ArrayList;
import java.util.Scanner;

class Video {
    String videoName;
    boolean checkout;
    int rating;

    Video(String name) {
        this.videoName = name;
    }

    String getName() {
        return this.videoName;
    }

    void doCheckout() {
        this.checkout = true;
    }

    void doReturn() {
        this.checkout = false;
    }

    void receiveRating(int rating) {
        this.rating = rating;
    }

    int getRating() {
        return this.rating;
    }

    boolean getCheckout() {
        return this.checkout;
    }
}

class VideoStore {
    ArrayList<Video> store = new ArrayList<>();

    void addVideo(String name) {
        store.add(new Video(name));
    }

    void doCheckout(String name) {
        for (Video v : store) {
            if (v.videoName.equals(name)) {
                v.doCheckout();
                return;
            }
        }
    }

    void doReturn(String name) {
        for (Video v : store) {
            if (v.videoName.equals(name)) {
                v.doReturn();
                return;
            }
        }
    }

    void receiveRating(String name, int rating) {
        for (Video v : store) {
            if (v.videoName.equals(name)) {
                v.receiveRating(rating);
                return;
            }
        }
    }

    void listInventory() {
        System.out.println("--------------------------------------------------------");
        System.out.println("Video Name\t|\tCheckout Status\t|\tRating");
        for (Video v : store) {
            System.out.println(v.videoName + "\t|\t" + v.getCheckout() + "\t|\t" + v.getRating());
        }
        System.out.println("--------------------------------------------------------");
    }
}

public class VideoLauncher {
    public static void main(String[] args) {

        VideoStore vs = new VideoStore();

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("MAIN MENU");
            System.out.println("=========");
            System.out.print(
                    "1.Add Videos : \n2.Check Out Video :\n3.Return Video :\n4.Receive Rating :\n5.List Inventory :\n6.Exit :\nEnter your choice (1..6) : ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: {
                    System.out.print("Enter the name of the video you want to add: ");
                    String name = sc.nextLine();
                    // add the video to the store
                    vs.addVideo(name);
                    System.out.println("Video \"" + name + "\"added successfully");
                    break;
                }
                case 2: {
                    System.out.print("Enter the name of the video you want to check out: ");
                    String name = sc.nextLine();
                    // checkout the given video
                    vs.doCheckout(name);
                    System.out.println("Video \"" + name + "\"checked out successfully");
                    break;
                }
                case 3: {
                    System.out.print("Enter the name of the video you want to Return: ");
                    String name = sc.nextLine();
                    // return the given video
                    vs.doReturn(name);
                    System.out.println("Video \"" + name + "\" returned successfully");
                    break;
                }
                case 4: {
                    System.out.print("Enter the name of the video you want to rate: ");
                    String name = sc.nextLine();
                    System.out.print("\nEnter the rating for this video: ");
                    int rating = sc.nextInt();
                    sc.nextLine();
                    // checkout the given video
                    vs.receiveRating(name, rating);
                    System.out.println("Rating \"" + rating + "\" has been mapped to the Video \"" + name + "\"");
                    break;
                }
                case 5: {
                    vs.listInventory();
                    break;
                }
            }
        } while (choice != 6);

        System.out.println("\nExiting...!! Thanks for using the application.");

    }
}
