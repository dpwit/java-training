// data at the House level are called fields

public class House {
    private int numStories; // these are fields
    private int numWindows;
    private String color;

    // no-argument constructor
    public House() {
        numStories = 2;
        numWindows = 4;
        color = "White";
    } // end no-argument constructor

    // parameter constructor
    public House(int numStories, int numWindows, String color) {
        this.numStories = numStories;
        this.numWindows = numWindows;
        this.color = color;
    } // parameter constructor (or ctor for short)

    public int numStories() {
        return numStories;
    }

    public void setNumStories(int numStories) {
        this.numStories = numStories;
    }

    public int getNumWindows() {
        return numWindows;
    }

    public void setNumWindows(int numWindows) {
        this.numWindows = numWindows;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
} // end House class
